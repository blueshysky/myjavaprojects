public class TestBankAccount {
private int acctNum;
private double balance;
private TestBankAccount(int num, double bal)
{
	acctNum = num;
	balance = bal;
	}
@Override
public String toString()
{
	String info = "BankAccount acct Num = " + acctNum + " Balance = $" + balance;
	return info;
}
public boolean equals(TestBankAccount secondAcct)
{  
	boolean result;
	if(acctNum ==secondAcct.acctNum && balance == secondAcct.balance)
		result = true;
	else
		result = false;
	return result;
}

//public class TestBankAccount
//{
	public static void main(String[] args)
	{
		TestBankAccount myAccount = new TestBankAccount(123, 4567.89);
		System.out.println(myAccount.toString());
	}
}
	

