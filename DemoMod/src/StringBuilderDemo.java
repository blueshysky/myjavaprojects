import javax.swing.JOptionPane; 
//Eclipse will state that JoptionPane in the package is not used anymore
public class StringBuilderDemo
{
	public static void main(String[] args)
	{
		StringBuilder nameString = new StringBuilder("Barbara");
	//determine the capacity of the nameString object
		int nameStringCapacity = nameString.capacity();
	//display the capacity
		System.out.println("Capacity of nameString is " + 
		  nameStringCapacity);
		  StringBuilder addressString = null;
		  addressString = new StringBuilder("6311 Hickory Nut Grove Road");
		//display the capacity for the addressString  
int addStringCapacity = addressString.capacity();
		  System.out.println("Capacity of addressString is " + addStringCapacity);
		//set the length of nameString (no. of char)
		  nameString.setLength(20);
		  System.out.println("The name is " + nameString + "end");
		  addressString.setLength(20);
		  System.out.println("The address is " + addressString);
		  
	}
}
