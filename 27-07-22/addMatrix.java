//Program to add 2D matrix.

import java.util.*;
class addMatrix
{
public static void main(String args[])
{
	int i,j;
	addMatrix obj = new addMatrix();                                	//object created of class addMatrix to call the addition method.
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows that should be in your array:-");	
	int  size = sc.nextInt();
	System.out.println("Enter the number of columns that should be in your array:-");		
	int len = sc.nextInt();
	int array1[][] = new int[size][len];
	int array2[][] = new int[size][len];
	int array3[][] = new int[size][len];
	System.out.println("---Enter the Elements of first matrix:---");
	for(i=0;i<size;i++)
	{
		for(j=0;j<len;j++)
		{
			array1[i][j] = sc.nextInt();					//taking input of first matrix elements.
		}
	}	
	System.out.println("---Enter the elements of second matrix:---");
	for(i=0;i<size;i++)
	{
		for(j=0;j<len;j++)
		{
			array2[i][j] = sc.nextInt();					//taking input of second matrix elements.	
		}
	}
	obj.addition(size,len,array1,array2,array3);
	sc.close();     									 //Scanner object is closed.
}
public void addition(int size, int len, int array1[][], int array2[][], int array3[][])
{
	int m,n;
	for(m=0;m<size;m++)
	{
		for(n=0;n<len;n++)
		{
			array3[m][n] = array1[m][n]+array2[m][n];			//Addition of matrix elements taking place at this step.
		}
	}
	System.out.println("--Here is your final answer after matrix addition--");
	for(m=0;m<size;m++)
	{
		for(n=0;n<len;n++)
		{
			System.out.print(array3[m][n]+" ");				
		}
		System.out.println(" ");
	}
}	
}

