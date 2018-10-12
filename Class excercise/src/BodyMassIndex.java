import java.util.Scanner;
import java.time.LocalDateTime;

public class BodyMassIndex 
{
	public static void main(String args[]) 
	{   double feet, lb, bmi1, bmi2, inches, in, kg, m;
	
		
	Scanner scnr =  new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scnr.nextLine();
		System.out.println("Hi " + name);
		System.out.println("\nplease enter your height in ft  ");
		feet = scnr.nextDouble();
		System.out.println("and your remaining inches" );
		in = scnr.nextDouble();
		System.out.println("Enter your weight in pounds");
		lb = scnr.nextDouble();
		inches = (feet * 12) + in;
		//English setting
		bmi1 = (lb/(inches * inches))*703;
		//metric
		kg = lb / 2.2;
		m = inches / 32.4;
		bmi2 = kg / (m * m);
		System.out.println("Bmi in English units " + bmi1 );
		System.out.println("Bmi in Metic units " + bmi2 );
		System.out.println(" ");
		System.out.println("In English units");
		if (bmi1 < 18.5)
			System.out.println("your bmi is " + bmi1 + " you are underweight");
		else if (bmi1 > 18.5 && bmi1 <24.9)
			System.out.println("Your bmi is " + bmi1 + " you are normal");
		else if (bmi1 > 24.9 && bmi1 < 29.9)
			System.out.println("Your bmi is" + bmi1 + "  you are overweight");
		else if (bmi1 > 30)
			System.out.println("Your bmi is "+ bmi1 + " you are obese ");
		System.out.println(" ");
		System.out.println("In metric units");
		if (bmi2 < 18.5)
			System.out.println("your bmi is " + bmi2 + " you are underweight");
		else if (bmi2 > 18.5 && bmi2 <24.9)
			System.out.println("Your bmi is " + bmi2 + " you are normal");
		else if (bmi2 > 24.9 && bmi2 < 29.9)
			System.out.println("Your bmi is" + bmi2 + "  you are overweight");
		else if (bmi2 > 30)
			System.out.println("Your bmi is "+ bmi2 + " you are obese ");
		LocalDateTime date = LocalDateTime.now();
		System.out.println("\nThis is summited on " + date);
		
	}

}
