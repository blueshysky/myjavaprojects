//programmer Xionghui Huang
import java.util.*;
import java.time.LocalDateTime;
public class GeorgeGyros {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Display();
	int cus = 0, food =0, drinks = 0, fries = 0;
	double sum = 0.0, totalsum = 0.0, sumfries = 0,totalSumFries = 0, finalAmount = 0;
	int foodnum[] = {1,2,3,4,};
	String[] foodName = {"Gyros Sandwich", "Italian Beef Sandwich","Hot Dog","Hamburger"};
	double foodprice[] = {5.50,4.50,3.50,3.80};
	int friesnum[] = {1,2};
	double friesprice[] = {1.50,1.00};
	char answer = 'U';
	System.out.println("Enter the number of customer");
	cus = sc.nextInt();
	//loop to see if the customer change their mind
	while(answer == 'u' || answer == 'U' )
	{
	//for loop to prompt and calculate the price and the items the customer wants
	for(int i = 1; i <= cus; i++) 
	{
		System.out.println("For customer " + i);
		System.out.println("Enter the number of food section you wish to order");
		food = sc.nextInt();
		sum = foodprice[food-1];
		System.out.print(foodName[food-1] + " : ");
		System.out.printf(" $%.2f",sum);
		System.out.println("\nEnter the number for fries' size \nif you do not want fries enter 0 ");
		fries = sc.nextInt();
		if(fries == 1 || fries == 2 )
		{
		sumfries = friesprice[fries-1];
		System.out.printf("$%.2f \n",sumfries);
		totalSumFries = totalSumFries + sumfries;
		}
		totalsum = totalsum + sum + totalSumFries;
		System.out.printf("current amount $%.2f \n", totalsum);
	}
	System.out.println("Enter the number of drinks");
	drinks = sc.nextInt();
	for(int k = 1; k <= drinks; k++)
	{
		System.out.println("Enter the name of the drinks");
		String drinksTypes = sc.next();
	}
	finalAmount = totalsum + drinks;
	System.out.printf("current amount $%.2f \n", finalAmount);
	System.out.println("***********************");
	System.out.println("Is that all? C to checkout U to return ");
	answer = sc.next().charAt(0);
	}
	//normal discount if either student or senior
	System.out.println("Enter any types of discount S for Student N for Senior any other key is for Regular");
	char discount = sc.next().charAt(0);
	switch (discount) 
	{
	case 'S' : case 's' :  System.out.printf("discounted total is $%.2f \n", finalAmount = finalAmount  - finalAmount * .10); break;
	case 'N' : case 'n' :  System.out.printf("discounted total is $%.2f \n",finalAmount =  finalAmount  - finalAmount * .20); break;
	case 'R' : case 'r' :  System.out.println("No discount"); break;
	}
	//Special birthday discount if it's a treat the friend's cashier can manually take it out like the real world
	System.out.println("For birthday cases Y for yes or N for No");
	char bday = sc.next().charAt(0);
	if (bday == 'Y' || bday == 'y')
	{
		System.out.println("Enter the amount to subtract");
		double amountdiscounted = sc.nextDouble();
		finalAmount = finalAmount - amountdiscounted;
	}
	finalAmount = finalAmount * .10 + finalAmount;
	receipt(finalAmount);

	
}
public static void Display() {
	LocalDateTime date = LocalDateTime.now();
	System.out.println("Welcome to George's Gyro");
	System.out.println("__________________________");
	System.out.println("Time of order is " + date);
	System.out.println("__________________________");
	System.out.println("Here is the main course menus");
	System.out.print("1.Gyros Sandwich: $5.50\n");
	System.out.print("2.Italian Beef Sandwich: $4.50\n");
	System.out.print("3.Hot Dog: $3.50\n");
	System.out.print("4.Hamburger: $3.80\n");
	System.out.println("***************************");
	System.out.println("Here is the fries section");
	System.out.println("1. Large Greek fries : $1.50");
	System.out.println("2. Small Greek fries : $1.00");
	System.out.println("***************************");
	System.out.println("Remeber all drinks are $1.00");
	System.out.println("***************************");
	
}
public static void receipt(double finalAmount) {
	LocalDateTime date = LocalDateTime.now();
	System.out.println("__________________________");
	System.out.println("Time of order is " + date);
	System.out.println("__________________________");
	System.out.printf("Final Cost: $%.2f", finalAmount);
	System.out.println("\nThank you for your purchases ");
}
}
