package Test;

// Java program to demonstrate working of Collections.sort() 
import java.util.*; 
  
public class CollectionTest { 
    public static void main(String[] args) { 
        // Create a list of strings 
        ArrayList<String> trendList = new ArrayList<String>(); 
        trendList.add("data science"); 
        trendList.add("digital forensics"); 
        trendList.add("cloud computing"); 
        trendList.add("cyber security");
        System.out.println("List before the use of" + 
                " Collection.sort() :\n" + trendList); 
     
  
        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(trendList); 
        System.out.println("List after the use of" + 
                " Collection.sort() :\n" + trendList); 
        
        Collections.reverse(trendList);
  
        // Let us print the sorted list;
        System.out.println("List after the use of" + 
                           " Collection.reverse() :\n" + trendList); 
        
        // Create copies of some objects. 
        int count = Collections.frequency(trendList, "cyber security"); 
        System.out.println("cyber security count : " + count); 

    } 
} 
