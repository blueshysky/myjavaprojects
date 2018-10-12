import java.util.*;
import java.lang.*;
import java.io.*;

public class Temperatures {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		double[] temperatures;
		int days = 0;
		// Enter days
		boolean temp = false;

		System.out.println("How many days worth of high temperatures do you have to enter? ");
		do {
			try {
				
				days = scan.nextInt();
				
				temp = true;

				// Create temperatures array of size days
				temperatures = new double[days];

				// Enter temperature values
				boolean temp2 = false;
				for (int i = 1; i < days + 1; i++) {
					while (!temp2) {
						System.out.println("Enter high temperature for day #" + i + ": ");
						try {
							temp2 = scan.hasNextDouble();
							if (temp2 == true) {
								temperatures[i - 1] = scan.nextDouble();
							}
						} catch (InputMismatchException ime) {
							System.out.println("Invalid input, please try again.");
						}
					}
				}

				// Calculate maximum change
				double max = 0.0;

				double[] changes = new double[days - 1];
				for (int i = 0; i < changes.length; i++) {
					changes[i] = temperatures[i + 1] - temperatures[i];
					if (Math.abs(changes[i]) > Math.abs(max)) {
						max = changes[i];
					}
				}

				for (int i = 0; i < days - 1; i++) {
					if ((temperatures[i + 1] - temperatures[i]) == max) {
						System.out.println("The maximum day to day high temperature change is " + max
								+ " and occured between days " + (i + 1) + " and " + (i + 2));
					}
				}
			} catch (InputMismatchException ime) {
				System.out.println("Invalid input, please try again.");
				temp = false;
			}
		}while(temp = false);
	}
}