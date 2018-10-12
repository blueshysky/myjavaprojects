//Made by Xionghui "Vincent" Huang
import java.util.Scanner;
public class Demographic {
	
	public static void main(String args[]) 
	{ 	//set keyboard input
		Scanner sc = new Scanner (System.in);
		//set variables 
		int credits = 0, courses = 0;
		//prompt user for it's name
		System.out.println("Please enter your name ");
		String name = sc.nextLine();
		System.out.println("Hi "+ name);
		//prompt user for their city
		System.out.println("What is the city that you live in? ");
		String city = sc.nextLine();
		//prompt user for it's state
		System.out.println("What is the state that you live in? ");
		String state = sc.nextLine();
		//prompt user for it's country
		System.out.println("What is the country that you live in? ");
		String country = sc.nextLine();
		//repay the location back to the user
		System.out.println("So you live at " + city + ", " + state + " in " + country);
		//prompt user for it's courses amount
		System.out.println("How many courses are you taking ");
		int courses1 = sc.nextInt();
		//relay the courses amount to the user
		System.out.println("So you are taking " + courses1 + " courses ");
		//prompt user for it's credit amount
		System.out.println("So how many credit hours are you taking?");
		int credits1 = sc.nextInt();
		//relay credits back to the user
		System.out.println("So you are taking " + credits1 + " credit hours");
		//call forth the method
		method1();
	}
	//declare new method
	public static void method1()
	{	//set scanner
		Scanner sc = new Scanner (System.in);
		//set string a
		String a;
		//prompt user the question
		System.out.println("do you like java? type y for yes or n for no");
		String a1 = sc.nextLine();
		//relay the answer 
		if (a1.equalsIgnoreCase("y")) System.out.println("awesome");
		if (a1.equalsIgnoreCase("n")) System.out.println("Oh no");
		}
	}


