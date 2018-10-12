public class FacePrinterSimple {
   public static void printFaceB() {
      char faceChar = 'o';
      System.out.println("  " + faceChar + " " + faceChar );     // Eyes
      System.out.println("   " + faceChar);                      // Nose
      System.out.println("  " + faceChar + " " + faceChar +  faceChar); // Mouth
      return;
   }

   public static void printFaceA() {
      char faceChar = 'o';
      System.out.println("  " + faceChar + " " + faceChar );     // Eyes
      System.out.println("   " + faceChar);                      // Nose
      System.out.println("  " + faceChar + faceChar + faceChar); // Mouth
      return;
   }
   
	   
   
   public static void main (String [] args) {
      printFaceA();
      printFaceB();
      return;
   
   }
}