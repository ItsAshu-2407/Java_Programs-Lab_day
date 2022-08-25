import static java.lang.System.*;
import java.io.FileWriter;     						//importing file writer package.
import java.util.*;

public class createTextFile{  		
    public static void main(String args[]){    				//Main Method
	Scanner sc = new Scanner(System.in);				//Scanner object is created.
      out.println("Enter the text to save in your file.");
	String input = sc.nextLine();               			//Taking input of text from user.
	try{
           FileWriter fw = new FileWriter("D:\\javaTextFile.txt");    	//Creating Text File in D drive.
           fw.write(input);  
           fw.close();    								//Closing File Writer object
          }catch(Exception e){System.out.println(e);}    
      out.println("File Saved Succesfully.\n"+"You can Check it in D dive.");  
	sc.close(); 							//Scanner Object closed.
 }	     
}  


/*OUTPUT->
   Hello I am Ashutosh. I am Learning Java From Bhaskar Sir in Anudip Foundation.
*/
