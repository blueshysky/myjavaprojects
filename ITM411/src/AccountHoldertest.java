import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//Xionghui Huang 2/9/2019 AccountHoldertest lab1
//this program is designed to be a AMT like machine where user deposit money and withdraw money
public class AccountHoldertest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		double balance = 0;
		double withdraw;
		Scanner sc = new Scanner(System.in);
		AccountHolder acctObj = new AccountHolder(balance);
		
		acctObj.menu();
		while (true) {
			  balance = sc.nextDouble();
			  if (balance < 0)
		                   System.out.println("Pls. reenter a positive beginning balance");
			  else 
			     break;
		}

		
		acctObj.setBalance(balance);
		
		System.out.println("Inital Amount " + acctObj.getBalance());
		System.out.println("Anually interest: 4% ");
		for(int i=1; i < 13; i++) 
		{
			//this iteration allows the balance to add up the interest 
			double yearly = acctObj.monthlyInterests(balance);
			//the holder is to hold the monthly interest for a year then reenters it to the monthlyInterest(balance)
			double holder = yearly;
			balance = holder;
			//i took a bit extra step to making the grammar looks a bit better 
			if (i == 1) {
			System.out.println(i + "st Month " + "amount: " + acctObj.toString(balance));
			}
			else if(i == 2 ) 
			{
				System.out.println(i + "nd Months " + "amount: " + acctObj.toString(balance));
			}
			else {
				System.out.println(i + "th Months " + "amount: " + acctObj.toString(balance));

			};
				
			
		}
		
		//i set up another menu with a switch statement so that the user can have a choice
		
		acctObj.options();
		
		int key = sc.nextInt();
		
		switch (key)
		{
			//this set up a deposit session 
			case 1: 		
				System.out.println("Deposit");
				balance = sc.nextDouble();
				acctObj.deposit(balance);
				System.out.println(acctObj.getBalance()+ " new balance!");
				break;
			case 2: 
				//this set up a withdraw session
				System.out.println("Withdraw");
				withdraw = sc.nextDouble();
				acctObj.withdraw(withdraw);
				//this gives a choice to allow user to go though with the transaction
				if(acctObj.getBalance() >= 0) {
					//if the user decided to not withdraw then it won't take any month out
					System.out.print(acctObj.getBalance() + " new amount \n");
				}
				else {
					//if the user decided to take out money then the 35$ will be deducted from the balance
					System.out.print(acctObj.overCharge(withdraw) + " new amount\n");
				}
				break;
		};
		
		acctObj.timestamp();
		
	};
};
