
public class ArrayDemo3 
{
		public static void main (String args[])
	    {
		     float rawTest[];
		     rawTest = testData();
		System.out.println("Correction Answers: " + rawTest[0]);

		System.out.println("Total Answers Correct: " + rawTest[1]);

		}
		static float[] testData()

		 {
		 float rawTest[] = {70,100};
		 return rawTest;
		 }
}



