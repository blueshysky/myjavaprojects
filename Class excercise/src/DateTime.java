//Program to understand & manage Dates
//declare the package
import java.time.LocalDateTime;
//declare the class
public class DateTime
{
//add main
  public static void main(String [] args)
{
LocalDateTime date = LocalDateTime.now();
System.out.println("\nlt is now " + date);
date=date.withYear(1998);
System.out.println("\nDate is now" + date);
//output of individual LocalDateTime fields for date
//"\t" is the tab

String fields = "\nYear:\t\t\t" + date.getYear();
fields += "\nMonth:\t\t\t" + date.getMonth();
fields += "\nMonth Number:\t\t" + date.getMonthValue();
fields += "\nDay\t\t\t" + date.getDayOfWeek();
fields += "\nDay Number:\t\t" + date.getDayOfMonth();
fields += "\nDay Number of Year:\t" + date.getDayOfYear();
fields += "\nHour (0-23):\t\t" + date.getHour();
fields += "\nMinute:\t\t\t" + date.getMinute();
fields += "\nSecond:\t\t\t" + date.getSecond();

System.out.println(fields);


}
}
