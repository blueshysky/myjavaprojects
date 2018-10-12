import java.util.*;
public class ArrayDemoFill 
{
	public static void main(String args[])
	 {
		//array not populated but is created.
		  float studentIDs[] = new float[2000];
		//Fill array first with all 1.0 values
		
		    Arrays.fill(studentIDs, 3);
		  //now populated and is filled
		 
		  for (int i=0; i<studentIDs.length; i++)
			   System.out.println(studentIDs [i]);
		
		  //Choose to fill the array selectively with the value 0
		//for the index positions 200 through 301
		  Arrays.fill(studentIDs, 200, 301,0);
		  for (int i=0; i<studentIDs.length; i++)
			   System.out.println(studentIDs [i]);
		  
	 }

}
