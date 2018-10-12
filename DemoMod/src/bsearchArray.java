import java.util.*;

public class bsearchArray {
	
	public static void main(String [] args)
	{
	//declare and populate the array
	char []myArray={'g','d','k','x','a','p'};
	//always sort the array
	Arrays.sort(myArray);
	//perform binary search
	int result = Arrays.binarySearch(myArray, 'k');
	
	System.out.println((result >= 0 ? "Is found " : "Is not found ") +
	                   " \nfound at position " + result);
	
	}

}
