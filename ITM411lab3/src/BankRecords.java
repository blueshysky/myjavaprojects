import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BankRecords implements Client {

	//array of BankRecords objects
	static BankRecords robjs[] = new BankRecords[600]; 
	//arraylist to hold spreadsheet rows & columns
	static ArrayList<List<String>> list = new ArrayList<>();   
	/*            id {string} 
            age {numeric}
            sex {FEMALE,MALE}
            region {INNER_CITY,TOWN,RURAL,SUBURBAN}
            income {numeric}
            married {NO,YES}
            children {0,1,2,3}
            car {NO,YES}
            save_act {NO,YES}
            current_act {NO,YES}
            mortgage {NO,YES}
            pep {YES,NO}
*/
	private String id;
	private int age;
	private String sex;
	private String region;
	private double income;
	private String maried;
	private int children;
	private String car;
	private String save_act;
	private String current_act;


	private String mortage;
	private String pep;
	
		/**
	 * @return the current_act
	 */
	public String getCurrent_act() {
		return current_act;
	}

	/**
	 * @param current_act the current_act to set
	 */
	public void setCurrent_act(String current_act) {
		this.current_act = current_act;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the income
	 */
	public double getIncome() {
		return income;
	}

	/**
	 * @param income the income to set
	 */
	public void setIncome(double income) {
		this.income = income;
	}

	/**
	 * @return the maried
	 */
	public String getMaried() {
		return maried;
	}

	/**
	 * @param maried the maried to set
	 */
	public void setMaried(String maried) {
		this.maried = maried;
	}

	/**
	 * @return the children
	 */
	public int getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(int children) {
		this.children = children;
	}

	/**
	 * @return the car
	 */
	public String getCar() {
		return car;
	}

	/**
	 * @param car the car to set
	 */
	public void setCar(String car) {
		this.car = car;
	}

	/**
	 * @return the save_act
	 */
	public String getSave_act() {
		return save_act;
	}

	/**
	 * @param save_act the save_act to set
	 */
	public void setSave_act(String save_act) {
		this.save_act = save_act;
	}

	/**
	 * @return the mortage
	 */
	public String getMortage() {
		return mortage;
	}

	/**
	 * @param mortage the mortage to set
	 */
	public void setMortage(String mortage) {
		this.mortage = mortage;
	}

	/**
	 * @return the pep
	 */
	public String getPep() {
		return pep;
	}

	/**
	 * @param pep the pep to set
	 */
	public void setPep(String pep) {
		this.pep = pep;
	}

	@Override
	public void readData() {
		// TODO Auto-generated method stub
	     
		BufferedReader br;
		try { 
	      //initialize reader object and set file path to root of project
	      	     br = new BufferedReader(new FileReader(new File("bank-Detail.csv")));

	 			String line = null;
	             
	               //read each record in csv file
	 			while ((line = br.readLine()) != null) {
	              //parse each record in csv file by a comma ( , )
	              //into a list stored in the arraylist-> Arrays
	 		                  list.add(Arrays.asList(line.split(",")));
	 			}
	 		     
				}catch(Exception e) {
						e.printStackTrace();
					};
					
	      processData();  //call function for processing record data
	 

	}

	@Override
	public void processData() {
		   //create index for array while iterating thru arraylist
		 int idx=0;

			    //create for each loop to cycle thru arraylist of values 
			    //and PASS that data into your record objects' setters 
			    for (List<String> rowData: list) {
			      //initialize array of objects
			    	robjs[idx] = new BankRecords();
			    	//call setters below and populate them, item by item
			    	robjs[idx].setId(rowData.get(0).toString()); //get 1st column
			    	robjs[idx].setAge(Integer.parseInt(rowData.get(1))); //get 2nd column
			    	robjs[idx].setSex(rowData.get(2));
			    	robjs[idx].setRegion(rowData.get(3));
			    	robjs[idx].setIncome(Double.parseDouble(rowData.get(4)));
			    	robjs[idx].setMaried(rowData.get(5));
			    	robjs[idx].setChildren(Integer.parseInt(rowData.get(6)));
			    	robjs[idx].setCar(rowData.get(7));
			    	robjs[idx].setSave_act(rowData.get(8));
			    	robjs[idx].setCurrent_act(rowData.get(9));
			    	robjs[idx].setMortage(rowData.get(10));
			    	robjs[idx].setPep(rowData.get(11));
			    	
	       /*continue processing arraylist item values into each 
	         array object-> robjs[ ] by index*/
	         
	               idx++;
	      }
	 printData();  //call function to print objects held in memory
		
	}

	@Override
	public void printData() {
//		System.out.println("hey me");
//		//Bankrecords [] array = new Bankrecords();
//		System.out.println("ID\t\tAGE\t\tSEX\t\tREGION\t\t\tINCOME\t\t\tMORTGAGE");
//
//	for(int i= 0 ; i < 25; i++) {
//		String s = String.format("%s\t\t%s\t\t%s\t\t%-10s\t\t%-10s\t\t%s", robjs[i].getId(),
//							 robjs[i].getAge(),
//							 robjs[i].getSex(), 
//							 robjs[i].getRegion(), 
//							 robjs[i].getIncome(), 
//							 robjs[i].getMortage());
//		System.out.println(s);
//	}	
	}

};
