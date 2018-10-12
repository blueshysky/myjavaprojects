import java.io.*;

public class LinearSearchArray {

 static BufferedReader keyboard = new
        BufferedReader(new InputStreamReader(System.in));

public static void main(String args[]) throws IOException {
  final int SIZE = 6;
  
  char[] array = { 'a','b','k','l','j','z' };
 
  char found = 'n';
  System.out.println("Please enter the character you wish to search. ");
  

 char key = keyboard.readLine().charAt(0);  
//use for loop to traverse across the array
//check termination condition
  for ( int index = 0; index <= SIZE - 1 && found == 'n'; index++ ) 
  {
    if (array[index] == key) {
      found = 'y';
      System.out.println("the character is located at index " + index);
    }
  }
  
    if(found == 'n') {
      System.out.println("item not found");
  }
}
}
