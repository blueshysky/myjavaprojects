//Author: Xionghui "vincent" Huang @ 8/30/2017
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
//define the class
public class JavaNotes 
{
	//Here is that math problem written in the Java language.
	//assign a method 
	public static void main(String args[]) 
	{
	  //set formatting of decimals numbers	
	  DecimalFormat twoPlace = new DecimalFormat("0.00");
	  //First, knowing that the area of a circle is 
	  double A = 62.80, r = 0, C = 0, B = 0; 
	  //compute the radius r
	  r = Math.sqrt(A / 3.1416); 
	  //compute the circumference C 
	  C  =  2 * 3.1416 * r;
	  //compute the surface area B
	  B  =  4 * 3.1416 * r * r;
	  //display the circumference
	  JOptionPane.showMessageDialog(null, "the circumference: " + twoPlace.format(C), "Result", JOptionPane.PLAIN_MESSAGE);
	  JOptionPane.showMessageDialog(null, "the surface area: " + twoPlace.format(B), "Result", JOptionPane.PLAIN_MESSAGE);
	}
}
