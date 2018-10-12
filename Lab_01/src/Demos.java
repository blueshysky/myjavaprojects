import java.io.*;
import java.util.*;

public class Demos 
{
  public static void main(String[] args) throws java.io.IOException
  {
    String s1;
    String s2;
    double num1, num2, product;

    // declare a BufferedReader object to read from the keyboard
    BufferedReader br = 
	     	new BufferedReader (new InputStreamReader(System.in));

    System.out.println ("Please input a line of characters!");

    s1 = br.readLine();

    System.out.println ("Your line has " + s1.length() + " characters!");

    System.out.println ();
    System.out.println ("Breaking the line into tokens we get:");

    int numTokens = 0;
    StringTokenizer st = new StringTokenizer (s1);

    while (st.hasMoreTokens())
    {
      s2 = st.nextToken();
	numTokens++;
      System.out.println ("    Token " + numTokens + " is: " + s2);
    }

    // use a BufferedReader object to read a number from the keyboard	
    System.out.println ("Please input a number!");	 
    s1 = br.readLine();
    num1 =  Double.parseDouble(s1);	 
		
    }
} 

