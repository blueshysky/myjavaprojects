import java.util.Arrays;

public class ArrayDemoEquals 
{
	 public static void main(String args[])
	 {
		  float student1Grades [] = new float[4];
		  student1Grades [0] = 90;
		  student1Grades [1] = 80;
		  student1Grades [2] = 70;
		  student1Grades [3] = 100;
		  
		  float student2Grades [] = new float[4];
		  student2Grades [0] = 90;
		  student2Grades [1] = 80;
		  student2Grades [2] = 70;
		  student2Grades [3] = 100;
		  
		  if (Arrays.equals(student1Grades, student2Grades))
			   System.out.println("Match!");
		  else
			  System.out.println("No Match!");
	 }

}
