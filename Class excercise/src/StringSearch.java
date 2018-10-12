public class StringSearch {
public static void main (String[] args)
{
	String[]books = 
		{"Great Expectations", "Twenty Thousand Leagues Under the Sea",
			"Crime and Punishment", "Anna Karenina","The Gulag Archipelago",
			"Dinosaurs", "The Old Man and the Sea", "Great Gatsby"};
	int counter1 = 0, counter2 =0, counter3 = 0;
	for(int i=0; i<books.length;i++)
	{
		System.out.print(books[i].substring(0,8) + "|");
	
	//insert statement to count titles with certain ending
	if(books[i].endsWith("Sea")) counter1++;
	//insert statement to count titles with specific beginning
	if(books[i].startsWith("Great")) counter2++;
	//insert statement to count titles found not containing specified substring
	if(books[i].indexOf("Gulag")==-1) counter3++;
	}
	//display search results
	
	System.out.println("\nFound " + counter1 + " titles from this series");
	System.out.println("\nFound " + counter2 + " title with Great");
	System.out.println("\nFound " + counter3 + " other titles");
		
}
}
