import java.sql.ResultSet;
import java.sql.SQLException;
//Coded By Xionghui Huang
public class LoanProcessing {

	public static void main(String[] args) {
		BankRecords br = new BankRecords();
		br.readData();
		Dao dao = new Dao();
		//dao.createTable();
		//dao.insertRecords(br.robjs); // perform inserts
		ResultSet rs = dao.retrieveRecords(); // fill result set object

		// Create heading for display
		System.out.println("ID\t\t Income\t\t Pep");
		
		// Extract data from result set
			try {
				while (rs.next()) {
				// Retrieve data by column name (i.e., for id,income,pep)
					  String ID = rs.getString("id");
			          double income = rs.getDouble("income");
			          String pep = rs.getString("pep");
			          String s = String.format("%s\t%-10s\t%-10s\t", ID, income, pep);
			          
			          System.out.println(s);


				// Display values for id,income,pep
				
				  }
				
				rs.close(); // closes result set object
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		


	}

}
