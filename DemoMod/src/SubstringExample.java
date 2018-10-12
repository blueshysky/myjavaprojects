import java.util.*;
public class SubstringExample
{  
  public static void main(String args[])
{  int thing = 0, middle ;
	  Scanner sc = new Scanner(System.in);
	  
	  String name = sc.nextLine(); 
String s1= name;  //create and assign a string value 
 int thing1 = Integer.parseInt(name);
 middle = thing1 % 2;
System.out.println(s1.substring(middle));//returns th  
 
}
}  
