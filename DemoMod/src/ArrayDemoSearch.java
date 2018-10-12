import java.util.*;
public class ArrayDemoSearch 
{
	 public static void main(String args[])
	 {
		 int index; 
		 String myArray[] = new String[5];
		  myArray[0] = "Katherine";
		  myArray[1] = "Luke";
		  myArray[2] = "James";
		  myArray[3] = "Bob";
		  myArray[4] = "Callie";
		//First do a sort of the data in the array
		//Then do a binary search
		  Arrays.sort(myArray);
		 // index = Arrays.binarySearch(myArray,  "Katherine");
		  //System.out.println("Katherine is in array element: " + index);
		 //except array
		  index = Arrays.binarySearch(myArray,  "Katheri");
		  if (index == 3)
		  System.out.println("Katherine is in array element: " + index);
		  else
			  System.out.println("wrong value for index");

	 }

}
