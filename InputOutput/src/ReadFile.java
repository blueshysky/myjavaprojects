import java.io.*;
public class ReadFile {
  public static BufferedReader buffer;
	public static void main(String[] args)
	{
		try {
		// create a FileReader object
			FileReader file = new FileReader("Frost.txt");
		// create a BufferedReader object to read the file	
			BufferedReader buffer = new BufferedReader(file);
			String line ="";
				while((line=buffer.readLine()) !=null)
				{ 
					System.out.println(line);
					}
					
		
		//close the BufferedReader Object
        buffer.close();
	}
		catch (IOException e)
		{
			System.out.println("A read error has occurred");
		}
		
       }
	}
