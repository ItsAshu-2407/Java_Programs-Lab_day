class checkPrime
{
 public static void main(String args[])
 {
  int num=9,i;
  if(num==0||num==1){
  System.out.println("NOT a Prime");}
  for(i=2;i<num;i++)
  {
   if(num%2==0)
   {
    System.out.println("NOT a prime");
   }
   else 
   {
    System.out.println("IT'S a prime");
    break;
   } 		
  }
 }
}