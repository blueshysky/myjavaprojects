import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Records extends BankRecords {

//create formatted object to write output directly to console & file
	static FileWriter fw = null;

	public Records() {
		try {
			fw = new FileWriter("BankRecords.txt");

		} catch (IOException e) {
			e.printStackTrace();
		}
	};

	public static void main(String[] args) {

		Records br = new Records();
		br.readData();

		// call functions to perform analytics
		AvgComp();     // analyze average income per loc
		//femsComp();  // female count w. mort/savings accounts 
		//malesComp(); // male counts per loc. w. car & 1 child 

		// *** close out file object ***//

		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	};

	private static void AvgComp() {

		Arrays.sort(robjs, new SexComparative());

		// set up needed variables to gather counts & income by sex 
		// to determine average income by sex
          
		int maleCt = 0, femCt = 0;
           double maleInc =0, femInc = 0;
        
		for (int i = 0; i < robjs.length; i++) {
			if (robjs[i].getSex().equals("FEMALE")) {
				++femCt;
				femInc += robjs[i].getIncome();
			}  
			else if (robjs[i].getSex().equals("MALE")){
				++maleCt;
				maleInc += robjs[i].getIncome();
			}
		}
		
		int count = 0;
		for (int i = 0; i < robjs.length; i ++) {
			if(robjs[i].getSex().equals("FEMALE") && 
					robjs[i].getMortage().equals("YES") && 
					robjs[i].getSave_act().equals("YES")){
				++count;
			}
		}
		
		
		int inner = 0, rural = 0, subarban = 0, town = 0;;
		for (int i = 0; i < robjs.length; i ++) {
			if(robjs[i].getSex().equals("MALE") && robjs[i].getRegion().contentEquals("INNER_CITY") && robjs[i].getCar().equals("YES") && robjs[i].getChildren() == 1)
			{
				++inner;
			}
			if(robjs[i].getSex().equals("MALE") && robjs[i].getRegion().contentEquals("RURAL") && robjs[i].getCar().equals("YES") && robjs[i].getChildren() == 1)
			{
				++rural;
			}
		
			if(robjs[i].getSex().equals("MALE") && robjs[i].getRegion().contentEquals("SUBURBAN") && robjs[i].getCar().equals("YES") && robjs[i].getChildren() == 1)
			{
				++subarban;
			}
		
			if(robjs[i].getSex().equals("MALE") && robjs[i].getRegion().contentEquals("TOWN") && robjs[i].getCar().equals("YES") && robjs[i].getChildren() == 1)
			{
				++town;
			}
		}
		String time = "\nTime stamp: " + new SimpleDateFormat("yyyy-MM-dd, hh:mm").format(new Date()) + "\nMade By Xionghui Huang";
;
		
		// display resulting averages to console and to file
		try {
		String s = String.format("Data analytic results: \n\nAvg inc. for Females: $ %.02f \nAvg inc. for Males: $ %.02f", (femInc/femCt) , (maleInc/maleCt));
		System.out.println(s);
		System.out.println("\nNum. of Females with mortage & saving accts : " + count);
		System.out.println("Inner region males with a car & 1 child : " + inner);
		System.out.println("Rural region males with a car & 1 child : " + rural);
		System.out.println("Subarban region males with a car & 1 child : " + subarban);
		System.out.println("Town region males with a car & 1 child : " + town);
		System.out.println(time);
		
		fw.write(s);
		fw.write("\nNum. of Females with mortage & saving accts : " + count);
		fw.write("\nInner region males with a car & 1 child : " + inner);
		fw.write("\nRural region males with a car & 1 child : " + rural);
		fw.write("\nSubarban region males with a car & 1 child : " + subarban);
		fw.write("\nTown region males with a car & 1 child : " + town);
		fw.write(time);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}

	
