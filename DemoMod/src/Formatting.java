import java.util.*;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
//substitute for class Format
class Formatting {
 public static void main(String args[])
 {
		 //for number and group separators
	 	NumberFormat nf = NumberFormat.getNumberInstance();
		 System.out.println("\nNumber: " + nf.format(123456789));
	 
	 	//format for currency
	 	NumberFormat cf = NumberFormat.getCurrencyInstance();
	 	System.out.println("\nCurrency: " + cf.format(1234.50f));
	 
		 //format to place percentage sign
		 NumberFormat pf = NumberFormat.getPercentInstance();
	 	System.out.println("\nPercent: " + pf.format(0.75f));
	 
	 	//format for local time
		 java.time.LocalDateTime now = java.time.LocalDateTime.now();
	 
		 //format for numerical date
		 DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM d, yyy");
	 	System.out.println("\nTime: " + now.format( df));
	 
	 	//format for numerical time
	 	DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:m a");
	 	System.out.println("\nTime: " + now.format(tf));
 	 }
}
