import java.util.*;
import java.lang.Math;
public class RNGArray 
{
	public static void main(String args[])
	{	
		int average = 0;
		int array[] = new int [5];
		for (int i = 0 ; i < array.length; i++)
	    {
	     array[i] = (int) (Math.random() * 100);
	     System.out.println(array[i]);
	    }
		System.out.println(" ");
		Arrays.sort(array);
	    System.out.println(array[0]);
	    System.out.println(array[1]);
	    System.out.println(array[2]);
	    System.out.println(array[3]);
	    System.out.println(array[4]);
		System.out.println(" ");
		if (array[0] >= 70 && array[1] < 70 && array[2] < 70 && array[3] < 70 && array[4] < 70)
        {
            average = array[0];
            System.out.println("average is " + average);
        }
        if (array[1] >= 70 && array[0] < 70 && array[2] < 70 && array[3] < 70 && array[4] < 70)
        {
         average = array[1];
         System.out.println("average is " + average);
        }
        if (array[2] >= 70 && array[1] < 70 && array[0] < 70 && array[3] < 70 && array[4] < 70)
        {
         average = array[2];
         System.out.println("average is " + average);
        }
        if (array[3] >= 70 && array[1] < 70 && array[2] < 70 && array[0] < 70 && array[4] < 70)
        {
         average = array[3];
         System.out.println("average is " + average);
        }
        if (array[4] >= 70 && array[1] < 70 && array[2] < 70 && array[3] < 70 && array[0] < 70)
        {
         average = array[4];
         System.out.println("average is " + average);
        }
        if (array[0] > 70 && array[1] >= 70 )
        {
            average = (array [0] + array[1]) / 2;
            System.out.println("average is " + average);
        }
        if (array[0] > 70 && array[1] >= 70 && array[2] >= 70)
        {
            average = (array[0] + array[1] + array[3]) / 3;
            System.out.println("average is " + average);
        }
        if(array[0] > 70 && array[1] > 70 && array[2] > 70 && array[3] > 70)
        {
            average = (array [0] + array[1] + array[3] + array[4]) / 4;
            System.out.println("average is " + average);
        }
        if(array[0] > 70 && array[1] > 70 && array[2] > 70 && array[3] > 70 && array[4] >= 70)
        {
            average = (array [0] + array[1] + array[3] + array[4] + array[5]) / 5;
            System.out.println("average is " + average);
        }
        
        else
        {
        	System.out.println("There isn't any average for these number ");
        }

	}
}
