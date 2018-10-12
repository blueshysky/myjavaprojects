//The author of this is Xionghui "Vincent" Huang
import java.lang.Math; 
import java.util.Scanner;
//declaring the class
public class ScannerClass 
{
	    //setting the method
		public static void main(String args[]) {
	float x= 0, y = 0, a =0, s = 0, w = 0, z = 0, c = 0; 
	long result = 0;
	//declaring scanner class
	Scanner sc = new Scanner (System.in);
	//prompt user it's name
	System.out.println("Please Enter Your Name ");
	String name = sc.nextLine();
	//prompt user for the first number
	System.out.println("Please enter a number ");
	float x1 = sc.nextFloat();
	//prompt user for the second number
	System.out.println("Please enter another number");
	float y1 = sc.nextFloat();
	//all the processes for the inputs
	s = x1 + y1;
	a = x1 / y1;
	z = y1 / x1;
	w = x1 * y1;
	c = y1 - x1;
	//jthe outputs are displayed
	System.out.println("The sum is " + s );
	System.out.println("The quotient of x / y is " + a);
	System.out.println("The quotient of y / x is " + z);
	//reassigning w to display as a modulus
	System.out.println("The product is " + w);
	w = x1 % y1;
	System.out.println("The modulus is " + w);
	//setting up exponent and displaying it
	long result1 = (long)Math.pow(x1, y1);
	System.out.println("The exponential output is " + result1 ); 
	}
}
