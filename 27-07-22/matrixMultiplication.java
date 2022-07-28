//Program to display Matrix Multiplication.

import static java.lang.System.*;
import java.util.Scanner;
class matrixMultiplication
{
public static void main(String args[])
{
	int i,j;
	Scanner sc = new Scanner(System.in);
	int row,col;						 
	out.println("-Enter the number of rows for your matrix.-");
	row = sc.nextInt(); 							 //Taking input for number of rows in the matrix.							
	out.println("-Enter the number of columns for your matrix.-");
	col = sc.nextInt();							//Taking input for the number of columns in the matrix.
	int array1[][] = new int[row][col];
	int array2[][] = new int[row][col];
	int array3[][] = new int[row][col];
 	out.println("Enter the elements of first array. ");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			array1[i][j] = sc.nextInt();				//Taking input for the 1st matrix
		}
	}
	out.println("Enter the elements of second array. ");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			array2[i][j] = sc.nextInt();					//Taking input for the 2nd matrix
		}
	}
	multiplyMatrix(row,col,array1,array2,array3);
	sc.close();								//Scanner object closed.
}
public static void multiplyMatrix(int row,int col,int array1[][],int array2[][],int array3[][])
{
	int i,j,k;
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			for(k=0;k<row;k++)
			{	
				array3[i][j]+= array1[i][k]*array2[k][j]; 				//Here we are multiplying matrix1 and matrix2. 
			}
		}
	}  
	out.println("Resultant matrix after multiplication of matrix1 and matrix2.");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			out.print(array3[i][j]+" ");		//Displaying the output of resultant matrix
		}
		out.println(" ");
	}	
}
}





		
