//Program to Display Bank details of a customer
import java.util.*;
class Bank
{
public static void main(String args[])
{
	int amount=500,accountNumber=3465146,accountBalance=6000;
	String customerName="Bhaskar";             //Here our teacher is our Customer.
	
	customerDetails customer1 = new customerDetails();
	customer1.createAccount(accountNumber,customerName,accountBalance);
	customer1.getAmount();

	customer1.depositAmount(amount);
	customer1.getAmount();
	customer1.withdrawAmount(amount);
	customer1.getAmount();
}
}

class customerDetails
{
	private int accNumber;
	private String accHolderName;
	private int accBalance;
public void createAccount(int accountNumber, String customerName, int accountBalance)
{
	accNumber = accountNumber;
	accHolderName = customerName;
	accBalance = accountBalance;
}
public void depositAmount(int amount)
{	
	System.out.println("You are depositing. "+amount);	
	accBalance += amount;
}
public void withdrawAmount(int Amount)
{
	System.out.println("You are withdrawing "+Amount);	
 	accBalance -= Amount;
	
}
public void getAmount()
{
	System.out.println(accHolderName+" Sir You Have "+accBalance+" in Your Account");
}
}