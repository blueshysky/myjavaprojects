	// declare the class Employee
	public class Employee
	{
		private int empNum;  //variable to be seen only in that class
		private double empPayRate;
		public void setValues()
		{
			empNum = 111;
			empPayRate = 22.22;
		}
		//displays the instance attributes
		public void methodThatUsesInstanceAttributes()
		{
			System.out.println("Employee number is " + empNum);
			System.out.println("Pay rate is " + empPayRate);
		}
              //method is to display the local variables
		public void methodThatUsesLocalVariables()
		{
			int empNum = 33333;
			double empPayRate = 555.55;
			System.out.println("Employee number is " + empNum);
			System.out.println("Pay rate is " + empPayRate);
		}
		
		public static void main(String[] args)
		{
			Employee aWorker = new Employee(); //constructor
			
			aWorker.setValues();
			aWorker.methodThatUsesInstanceAttributes();
			aWorker.methodThatUsesLocalVariables();
			
		}
	}
