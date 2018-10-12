public class exchangeSortArray
{
 
final static int SIZE = 6;
static int[] array = { 50, -30, 20, -30, 60, 10 };

public static void main(String args[]) {
//display unsorted array
  System.out.println("\nunsorted..... \n");

//call the method to print the array
  PrintArray();

//call the method to sort the array 
 Exchange();

//display the sorted array
  System.out.println("\nsorted....... \n");
  PrintArray();
}
//method to print the elements of an array
//use a for loop
static void PrintArray() {
  for (int index = 0; index <= SIZE - 1; index++) 
    System.out.println("array[ " + index + " ] = " + array[index]);  
}
//method to sort the elements of the array
//use of the variable “temp”
static void Exchange() {
  
  int a, b, temp;
//used for nested loops
  //outer loop to pass
  for(a = 0; a < SIZE - 1; a++)  { //pass through the array
 //inner loop to compare consecutive elements
    for(b = a + 1; b < SIZE; b++) { //compare consecutive elements
      if(array[a] < array[b])
      {
	    temp = array[a];     //store array element temporarily
	    array[a] = array[b]; //exchange the values
	    array[b] = temp;
      }
    }
  }
}
}//end class
