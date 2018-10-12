import java.sql.*;

public class JDBCAccessDemo 
{
  public static void main(String[] args) throws ClassNotFoundException
  {
     try 
     {
       final String fileName = "c:/Users/katherine/workspace/JDBCAccessDemo/MyData.mdb";
       //initiate JDBC driver
       Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
       Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + fileName +  
                                                    ";memory=false"); 

       Statement st = con.createStatement();
       
       // create an execute sql command on database    
       ResultSet rs = st.executeQuery("Select * from students order by RollNo desc");
       ResultSetMetaData rsmd = rs.getMetaData();
       // this getColumnCount return the number of column in the selected table
       int numberOfColumns = rsmd.getColumnCount();
       // while loop and with while loop code use for print the data
       while (rs.next()) 
       {
         for (int i = 1; i <= numberOfColumns; i++) 
         {
           if (i > 1)
             System.out.print(", ");
           String columnValue = rs.getString(i);
           System.out.print(columnValue);
         }
         System.out.println("");
        }
        st.close();
        con.close();
       
      } 
     catch (Exception ex)
        {
          System.err.print("Exception: ");
          System.err.println(ex.getMessage());
        }
      }
}
