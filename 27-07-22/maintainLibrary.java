
import static java.lang.System.*;
import java.util.*;
class maintainLibrary
{
public static void main(String args[])
{
	int price=100,code=23;
	String bookName = "Rich Dad Poor Dad";
	library book1 = new library();
	book1.insertBook(code,bookName,price); 
	book1.getBook(bookName);
}
}
public class library
{
private String bookName;
private int bookCode;
private int bookPrice; 
public void insertBook(int code,String name,int price)
{
	bookCode = code;
	bookName = name;
	bookPrice = price;
	out.println("Book Inserted in the library");
}
public void getBook(String name)
{
	if(bookName == name)
	{
		out.println("Here is "+bookName+" book");
		out.println("Thanks Visit again.");
	}
	else
	{
		out.println("Sorry we don't have "+name+" you can try searching some other book.");
	}
}
}
