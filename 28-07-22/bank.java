//Program to Display Bank details of a customer
import java.util.*;
class Bank              						//It's my main class
{
public static void main(String args[])
{
	int amount=500,accountNumber=3465146,accountBalance=6000;
	String customerName="Bhaskar";             //Here our teacher is our Customer.
	Scanner ns = new Scanner(System.in);
	customerDetails customer1 = new customerDetails();				
	customer1.createAccount(accountNumber,customerName,accountBalance);		//Method call from customerDetails class.
	customer1.getAmount();
	customer1.depositAmount(amount);
	customer1.getAmount();
	customer1.withdrawAmount(amount);
	customer1.getAmount();
	customerDetails customer2 = new customerDetails();
	sc.close();
}
}			//1st class ends here.

class customerDetails     //It's My 2nd class.
{
	private int accNumber;             //here I have decleared 3 Instance variables.
	private String accHolderName;
	private int accBalance;
public void createAccount(int accountNumber, String customerName, int accountBalance)
{
	accNumber = accountNumber;             //At this step we are storing the details of the customer.
	accHolderName = customerName;        
	accBalance = accountBalance;
}
public void depositAmount(int amount)		//Here In this method we are depositing the amount to customer's bank account
{	
	System.out.println("You are depositing. "+amount);		
	accBalance += amount;
}
public void withdrawAmount(int Amount)		//In this method we are withdrawing the customer's required amount from his bank account.	
{
	System.out.println("You are withdrawing "+Amount); 	
 	accBalance -= Amount;									
	
}
public void getAmount()			//In this method we are displaying the customer bank account details.			
{
	System.out.println(accHolderName+" Sir You Have "+accBalance+" in Your Account");
}
}