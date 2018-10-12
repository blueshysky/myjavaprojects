/* File name : Animal.java */
//Superclass Animal
  class Animal {
	public Animal() { }
	String style;
	String eatstyle;
}
	
//Subclass Mammal
  class Mammal extends Animal{

   public void eat(){
      System.out.println("Mammals eat plants and or animals");
   }

   public void travel(){
      System.out.println("Mammal travels walking, swimming, flying");
   } 

   public int noOfLegs(){
      return 0;
   }
 
}
   //Subclass Birds
     class Birds extends Animal{

	   public void eat(){
	      System.out.println("Birds eat seeds");
	   }

	   public void travel(){
	      System.out.println("Birds fly");
	   } 

	   public int noOfLegs(){
	      return 0;
	   }
   }
   //Subclass Reptiles
	    class Reptiles extends Animal{

		   public void eat(){
		      System.out.println("Reptiles eat little mammals");
		   }

		   public void travel(){
		      System.out.println("Reptiles crawl");
		   } 

		   public int noOfLegs(){
		      return 0;
		   }
	   }
   //Subclass Amphibians
		     class Amphibians extends Animal{

			   public void eat(){
			      System.out.println("Amphibians eat insects");
			   }

			   public void travel(){
			      System.out.println("Amphibians travel in the water and on land");
			   } 

			   public int noOfLegs(){
			      return 0;
			   }
		   }
   //Subclass Teleosts (Bony Fish)
			  class Teleosts extends Animal{

				   public void eat(){
				      System.out.println("Teleosts eat other teleosts");
				   }

				   public void travel(){
				      System.out.println("Teleosts swim");
				   } 

				   public int noOfLegs(){
				      return 0;
				   }
			   
      }
		//defined the parent and the subclasses above	


			   public class TestClass  { 
				   public TestClass() {}
			 //Call main
			   public static void main(String args[]){
			      Mammal m = new Mammal();
			      m.eat();
			      m.travel();
			      Birds b = new Birds();
			      b.eat();
			      b.travel();
			      Reptiles r = new Reptiles();
			      r.eat();
			      r.travel();
			      Amphibians a = new Amphibians();
			      a.eat();
			      a.travel();
			      Teleosts t = new Teleosts();
			      t.eat();
			      t.travel();
			      
			    }
			   }//end class TestClass
