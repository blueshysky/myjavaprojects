class ExcDemo1 {
 public static void main(String args[]){
   int nums[]= new int[4];



  //create try block
   try 
     {
    System.out.println("IndBefore exception is generated.");
   //Generate an index out-of-bounds exception.
   nums[10] = 10;
  System.out.println("This won’t be displayed");
   }
  //create catch block
  catch (ArrayIndexOutOfBoundsException exc) 
    {
  //catch the exception
  System.out.println("Index out-of-bounds!");
    }
System.out.println("After catch statement.");
   }
}
