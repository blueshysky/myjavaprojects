import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class testing 
{
	static BufferedReader keyboard = new
	        BufferedReader(new InputStreamReader(System.in));
	 
	public static void main(String args[]) throws Exception, IOException 
	{
	final int SIZE = 4;
	int [] orginalArray = new int[SIZE];
	int[] reverseArray = new int[SIZE];
	for( int i = 0; i< orginalArray.length; i++)
	{
		System.out.println("enter an interger: ");
		orginalArray[i] = Integer.parseInt(keyboard.readLine());
	}
	int index = SIZE - 1;
	for (int i = 0; i < reverseArray.length; i++)
	{
		reverseArray[i] = orginalArray[index];
		System.out.println(reverseArray[i]);
		index--;
	}
	}
}
