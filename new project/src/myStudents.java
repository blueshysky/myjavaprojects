//define the class
public class myStudents
{
//data members for the class
public float tuition;
public int id; 
public boolean honorRoll;
//default constructor (for any student)… notice no parameters
public myStudents()
{
tuition = (float)0.0; 
id = 1234;
}
//overloaded constructor (for the honor student; notice there are parameters)
public myStudents(float a, int b, boolean c)
{
tuition = a;
id = b;
honorRoll = c;
}
//calling main 
public static void main(String args[])
{
//object created or instantiated
 myStudents stud1 = new myStudents();
 boolean honorRoll = true;
 //honors object created
myStudents stud2 = new myStudents(3000, 4444, honorRoll);

// display object values
System.out.println(" " + stud1.tuition);
System.out.println(" " + stud1.id);
System.out.println(" " + stud2.tuition);
System.out.println(" " + stud2.id);
System.out.println(" " + stud2.honorRoll);

// updating a student's tuition using a cast
float myTuition = (float)100.00;
stud1.tuition = myTuition;
System.out.println(stud1.tuition);
}
}
