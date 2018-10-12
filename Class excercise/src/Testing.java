
import java.io.File;
import java.io.PrintWriter;

public class Testing {
    public static void main(String[] args) throws Exception {
	// associate a file with a file object
	File fileExample = new File("data.txt");
	// associate the file with a PrintWriter object
	PrintWriter pwInput = new PrintWriter(fileExample);
	// write string data to the file
	pwInput.println("Sammy Student");
	// write string data to the file
   	pwInput.println("Engineer");
	// write a double - precision number to the file
	pwInput.println(35.50);
	// write a Boolean value to the file
	pwInput.print(true);
	// de - allocate the PrintWriter object memory 
	pwInput.close();
 	// inform user that the file has been created
	System.out.println("The data file has been created!");   
    }
}

