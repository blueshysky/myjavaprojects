
public class Stuff {
public static void main(String[] args) {
	int a = 4;
	int b = 4;
	System.out.println(sumElems(a,b));

}
public static double sumElems(int a, int b) {
	double[][] array = new double [a][b];
	double sum = 0;
	for (int i = 0 ; i < array.length; i++)
		for (int j = 0; j < array.length; j++)
	{
		sum += array[i][j];
		
	}
	return sum;
	
}
}




