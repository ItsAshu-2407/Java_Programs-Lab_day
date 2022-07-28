//Program to get transpose of a matrix.

import java.util.Scanner;
class transposeMatrix
{
public static void main(String args[])
{
	int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rows of your matrix.");
	int row = sc.nextInt();			//Taking input of rows of Matrix.
	System.out.println("Enter the columns of your matrix.");
	int col = sc.nextInt();		//Taking input of columns of matrix.
	int arr[][] = new int[row][col];
	System.out.println("--Enter the elements of your matrix--");
	for(i=0;i<row;i++)
	{  
		for(j=0;j<col;j++)
		{
			arr[i][j] = sc.nextInt();			//Taking input of elements of matrix
		}
	}
	System.out.println("Here are the matrix elements which you entered");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)	
		{
			System.out.print(arr[i][j]+" ");	//Printing the elements of matrix so that we can see the entered matrix and it's transpose together on output screen.
		}
		System.out.println(" ");			//Leaving space here so that array elements can be displayed in matrix form.
	}
	changeArray(row,col,arr);
	sc.close();				//Scanner object closed.
}
public static void changeArray(int len,int size,int brr[][])
{
	int m,n;
	System.out.println("--Here is the Transpose of your matrix.--");
	for(m=0;m<len;m++)
	{
		for(n=0;n<size;n++)
		{
			System.out.print(brr[n][m]+" ");			//Doing Transpose of entered matrix.
		}
		System.out.println(" ");					//Leaving space here so that array elements can be displayed in matrix form.
	}
}
}