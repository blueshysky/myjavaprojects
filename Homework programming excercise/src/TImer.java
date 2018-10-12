import java.util.Scanner;
public class TImer {
	public static void main(String args[])
	{
		int time, hours, min, sec ;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the amount of time in second ");
		time = sc.nextInt();
		hours = time / 3600;
		System.out.println("time in hours " + hours);
		min = (time % 3600) / 60;
		System.out.println("time in minutes " + min);
		sec = (time % 3600)% 60;
		System.out.println("time in sec " + sec);
		System.out.println("your time is " + hours + " hour(s) " + min + " min(s) and " + sec + " sec(s)");
		
	}

}
