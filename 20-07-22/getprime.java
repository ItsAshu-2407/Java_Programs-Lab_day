import java.util.*;
class findPrime
{
 public static void main(String args[])
 {
  int getnum,i,temp=0;
  Scanner sc = new Scanner(System.in);
  getnum = sc.nextInt();
   for(i=1;i<=getnum;i++)
   {
	for(i=2;i<=getnum;i++)
	{
		if(getnum%i==0)
  		{
        		 temp+=1;			
 		}
	}
	if(temp==0)
 	{
		System.out.println(getnum+" is a prime number.");
	}   
   }
 }
}