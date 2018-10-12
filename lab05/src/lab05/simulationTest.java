package lab05;
import java.lang.Math;
import java.util.Arrays;
public class simulationTest
{
	public static void main(String[] args)
	{
		double[] array1= new double [5];
		double temp = 0;
		double count = 0;
		
		for (int i = 0; i < 5; i++)
		{
			array1[i] = (int) (Math.random() * 100);
			System.out.println(array1[i]);
		}
		System.out.println(" ");
		Arrays.sort(array1);
	for (int k = 0; k < 5; k++ )
	{
		if(array1[k] > 70)
		{
			temp = temp + array1[k];
			count++;
		}
		
	}
	System.out.println("Average is " + temp / count);
	
	}
}
