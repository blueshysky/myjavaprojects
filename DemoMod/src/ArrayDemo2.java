
public class ArrayDemo2 
{
	public static void main (String args[])
	{
		 float grade;
		 float rawTest[] = {70,100};
		  grade = gradeCalc(rawTest);
		System.out.println("Your grade is: " + grade);
		}
		static float gradeCalc(float test[])
		{
		  return (test[0]/test[1] * 100);
	}
}


