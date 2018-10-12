
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//Xionghui Huang
public class GiftCards
{
  static NumberFormat nf = NumberFormat.getCurrencyInstance();
  Date myDate = new Date();
  String myDateFormat = "MM/dd/yyyy";
  SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);
  
    
  // define the class data members 
  public int expires;
  private double balance;
  public int cardNum;
  private char cardType;
  public String issueDate;
  private String holder; 
  
  // define the member methods
  // default constructor
  public GiftCards() {}
  // overloaded constructor
  public GiftCards(String n, double amt) 
  {
    holder = n;
    balance = amt;
  }
  public void IssueGiftCard() 
  {
	  System.out.println("");
	  System.out.println(" Card Issued" + dtToday.format(myDate));
	  System.out.println(" Today's Date is: " + dtToday.format(myDate));
	  System.out.println(" Card Holder . . . " + holder);
	  System.out.println(" Card Number . . . " + cardNum);
	  System.out.println(" Card Amount . . . " + nf.format(balance));
	  System.out.println(" Expires . . . " + expires);
  }
  		

  public double getBalance()
  {
    return balance;
  }
  public void setBalance(double b) 
  {
    balance = b;
  }
  public String getHolder()
  {
    return holder;
  }
  public void setHolder(String h) 
  {
    holder = h;
  }
  public char getCardType()
  {
	  return cardType;
  }
  public void setCardType(char c) {
	  cardType = c;
  }
  public int getYear() {
	  return expires;
  }
  public void setYear(int e) {
	  expires = e;
  }
  public void printCurrentGiftCardInfo(double spend) 
  {
	  System.out.println("");
	  System.out.println(" Card Balance");
	  System.out.println(" Today's Date is: " + dtToday.format(myDate));
	  System.out.println(" Deducted . . . " + nf.format(spend));
	  System.out.println(" Card Amount . . . " + nf.format(balance - spend));
  }
  public void warning(double spend) {
	  if (spend > balance) {
		  System.out.println(" ");
		  System.out.println("Error negative balance can not contiune!!");
	  }
  }
}
		
