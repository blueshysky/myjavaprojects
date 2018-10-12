import java.util.*;
public class ExtraCredit 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String array[] = new String [1];
		int array1[] = new int [1];
		char array2[] = new char [1];
		
		System.out.println("Please enter a string ");
		String word = sc.nextLine();
		array[0] = word;
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		array1[0] = num;
		System.out.println("Please enter a single character ");
		char letter = sc.next().charAt(0);
		array2[0] = letter;
		System.out.println("Now which one do you want to recall? \nType W for your string; Type N for your number; Type C for your letter");
		char answer = sc.next().charAt(0);
		switch(answer)
		{
		case 'W': case 'w': System.out.println("Your String was" + array[0]); break;
		case 'N': case'n': System.out.println("Your Number was" + array1[0]); break;
		case 'X': case'x': System.out.println("Your letter was " + array2[0]); break;
		default: System.out.println(array);
		}
		
	}
}
