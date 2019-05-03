import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
//Xionghui Huang 2/9/2019 AccountHoldertest lab1


public class AccountHolder {
	double balance;
	static double annualInterestRate = 0.04;
	//contructor for AccountHolder
	public AccountHolder(double balance) {
		this.balance = balance < 0 ? 0 : balance;
	};

	//the deposit method
	public void deposit(double balance) {
	this.balance += balance;
	};
	//the withdraw method
	public void withdraw(double balance) {
	this.balance -= balance;
	};


	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	};


	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	};
	//makes a number goes to a string for displaying it
	public String toString(double balance) { 
		return String.format(("$%.2f") , balance);
	};
	
	//bare bone menu
	public void menu() {
		System.out.println("**********************************");
		System.out.println("Main Menu");
		System.out.println("**********************************");
		System.out.println("Please enter your initial deposit");
		System.out.println("**********************************");
	};
	// bare bone menu
	public void options() {
		System.out.println("**********************************");
		System.out.println("What would you like to do?");
		System.out.println("Option 1: Deposit \n"
							+ "Option 2: Withdraw");
		System.out.println("**********************************");
		System.out.println("Please enter your choice");
		System.out.println("**********************************");
	};
	//calculate the interest per month and then return the amount per month
	public double monthlyInterests(double balance) {
		//calculate the interest per month 
		double rating = (balance * annualInterestRate) / 12;
		
		double outcome = (rating + balance);

		return outcome;
	};
	//this method determines if the user want to withdraw pass their balance
	public double overCharge(double balance) {
		System.out.println("**************************");
		System.out.println("ERROR! Insufficient amount!");
		System.out.println("**************************");
		System.out.println("No amount has been drawn!");
		System.out.println("If you wish to contiune the transaction a 35$ fee will occur");
		System.out.println("press Y to contiune or N to cancel");
		
		Scanner key = new Scanner(System.in);
		String request = key.nextLine();
		//set if statement to either deduct or leave alone
		if (request.equalsIgnoreCase("Y")) {
			return this.balance = (this.balance - 35.00);
		}
		else {
			return balance;
		}
		
	};
	//time
	public void timestamp() {
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println("Cur dt=" + timeStamp + "\nProgrammed by Xionghui Huang\n");
		System.out.println("Thanks For Visiting");
	};
	
	
	
};