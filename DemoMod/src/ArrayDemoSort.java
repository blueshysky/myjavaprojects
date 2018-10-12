import java.util.*;
public class ArrayDemoSort 
{
	 public static void main(String args[])
	 {
		 //before sorting
		  String myArray[] = new String[5];
		  myArray[0] = "Katherine";
		  myArray[1] = "Luke";
		  myArray[2] = "James";
		  myArray[3] = "Bob";
		  myArray[4] = "Callie";
		  for (int i = 0; i < 5; i++)
			  System.out.println(myArray[i]);
		  System.out.println(" ");
		  //after sort
		  Arrays.sort(myArray);
		  for (int i = 0; i<5; i++)
			  System.out.println(myArray[i]);
		  System.out.println(" ");
		  for (int i = 0; i < 5; i++)
			  System.out.println(myArray[i]);
		  
	 }

}
