
import java.util.Scanner;
public class JavaMethods {

	//declare a Scanner class object
	static Scanner sc = new Scanner(System.in);
			
	// define a method
	public static double AverageValue(double a, double b)
	{
		return (a + b) / 2.0;
	}
	
	public static void main(String[] args) 
	{
	  // declare local variable(s)..also initializing to zero
	  double num1 = 0, num2 = 0;
	  // request and receive two decimal values
	  System.out.println("please enter a real number");
	  num1 = sc.nextDouble();
	  System.out.println("please enter another real number");
	  num2 = sc.nextDouble();
		
	  // call the method
	  System.out.println("the average value is " + 
		AverageValue(num1, num2));
	}
}

