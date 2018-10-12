//import appropriate packages
import java.util.Scanner;

public class DemoMod {
	public static void main(String args[]) {
		//prompt user for num1
		System.out.println ("Enter an integer");
		int num1=0;
		Scanner input = new Scanner(System.in);
		num1=input.nextInt();
		System.out.println ("Enter a Float");
        double num3 =0.0;
		Scanner input1 = new Scanner(System.in);
		num3 = input1.nextDouble();
		
		int num2 = 3;
		int result = num2 % num1;
	    System.out.println ("num2 % num is " + result);
	    
	    System.out.println("num3/num2 " +num2/num3);
	}
	
}