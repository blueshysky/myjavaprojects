import java.util.Scanner;
public class GPA 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter F for full time student or P for part time");
		String status = sc.nextLine();
		if (status == "P" || status == "p")
		{
			System.out.println("Sorry part-time students can't be in Dean's list");
		}
		System.out.println("Please enter your GPA betweek 0.0 - 4.0");
		double gpa = sc.nextDouble();
		if (gpa > 3.5)
		{
			System.out.println("Welcome to the Dean's list");
		}
		else 
		{
			System.out.println("Oh, sorry you didn't make it. ");
		}
		}
}
