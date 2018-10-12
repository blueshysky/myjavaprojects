import java.io.*;
public class openFIle {
	public static void main(String args[]) {
	    try {
	        // constructor may throw FileNotFoundException
	    	File file = new File("someFile.txt");
	    	FileWriter write = new FileWriter("someFile.txt");
	        FileReader reader = new FileReader("someFile");
	        int i=0;
	        while(i != -1){
	            //reader.read() may throw IOException
	            i = reader.read();
	            System.out.println((char) i );
	        }
	        reader.close();
	        System.out.println("--- File End ---");
	    } catch (FileNotFoundException e) {
	        //do something clever with the exception
	    } catch (IOException e) {
	        //do something clever with the exception
	    }
	    finally {
	    System.out.println("done");
	    }
	}

}
