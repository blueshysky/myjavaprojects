import java.io.*;
//Create a class WriteFile
class WriteFile
 {
    public static void main (String[] args)

    {
//try catch block
      try 
       {
        //create a FileWriter object  to create a file
        FileWriter file = new FileWriter("Frost.txt");
//can also use "Frost.txt"
	 
  //create a BufferedWriter object to write 
  //to the file

   BufferedWriter buffer = new BufferedWriter(file);

  //add statements to write lines of text 
  buffer.write("What are little boys made of? ");
	buffer.newLine();
  buffer.write("By Robert Southey");
	buffer.newLine();

  buffer.write("What are little boys made of? ");
	buffer.newLine();
  buffer.write("What are little boys made of? ");
	buffer.newLine();
  buffer.write("Snips and snails");
	buffer.newLine();
  buffer.write("And puppy-dogs' tails ");
	buffer.newLine();
  buffer.write("That's what little boys are made of ");
	buffer.newLine();
	  buffer.write(" ");
		buffer.newLine();
  buffer.write("What are little girls made of? ");
	buffer.newLine();
  buffer.write("What are little girls made of? ");
	buffer.newLine();
  buffer.write("Surgar and spice ");
	buffer.newLine();
  buffer.write("And everything nice");
	buffer.newLine();
  buffer.write("That's what little girls are made of ");

  //close the BufferedWriter Object
        buffer.close();
       }
      catch (IOException e)
       {
         System.out.println("A write error has occurred");
	  }
    }
 }
