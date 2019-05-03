import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	// Declare DB objects
	DBConnect conn = null;
	Statement stmt = null;

	// constructor
	public Dao() { // create db object instance
		conn = new DBConnect();
	}

	// CREATE TABLE METHOD
	public void createTable() {
		try {
			// Open a connection
			System.out.println("Connecting to a selected database to create Table...");
			System.out.println("Connected database successfully...");

			// Execute create query
			System.out.println("Creating table in given database...");

			stmt = conn.connect().createStatement();

			String sql = "CREATE TABLE BigData" + "(pid INTEGER not NULL AUTO_INCREMENT, "
					+ " id VARCHAR(10), " + " income numeric(8,2), " + " pep VARCHAR(4), " + " PRIMARY KEY ( pid ))";

			//stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
			conn.connect().close(); // close db connection
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		}
	}

	public void insertRecords(BankRecords[] robjs) {
		try {
			// Execute a query
			System.out.println("Inserting records into the table...");
			stmt = conn.connect().createStatement();
			String sql = null;

			// Include all object data to the database table
			for (int i = 0; i < robjs.length; ++i) {

				// finish string assignment to insert all object data
				// (id, income, pep) into your database table

				sql =  "INSERT INTO BigData(id, income, pep)" +
						"VALUES (' "+ robjs[i].getId() +" ', ' "+ robjs[i].getIncome()+" ', ' "+robjs[i].getPep()+" ' )";
				
				stmt.executeUpdate(sql);
			}
			conn.connect().close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	
	public ResultSet retrieveRecords() {
		 ResultSet rs = null;
		 System.out.println("Connecting to a selected Database for Record Retrival...");
		 try {
		 stmt = conn.connect().createStatement();
		 System.out.println("Connected to database successfully...");
		 System.out.println("Making Select Statement...");
		 String sql = "SELECT id, income, pep from BigData order by pep desc";
		 rs = stmt.executeQuery(sql);
		 conn.connect().close();
		 }catch(SQLException e) 
		 {
			 e.printStackTrace();
		 }
		 return rs;
		}


}
