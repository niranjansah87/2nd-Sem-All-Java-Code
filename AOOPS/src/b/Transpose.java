package b;

import java.util.Scanner;

public class Transpose {
	static Scanner s=new Scanner(System.in);
	static int r,c;
	
	static int a[][]=new int[r][c];
	static int transpose[][]=new int[100][100];
	public static void main(String[] args) {
		
		
		System.out.println("Enter the row:");
		r=s.nextInt();
		System.out.println("Enter the column:");
		c=s.nextInt();
		
		
		System.out.println("Enter the elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				a[i][j]=s.nextInt();
			}
		}
		
		
		int ch;
		while(true)
		{
			ch=Menu();
			switch(ch)
			{
			case 1:MatrixTranspose();
				break;
			case 2:MatrixMultiplication();
				break;
			case 3:DiagonalDifference();
				break;
			case 4:MatrixAddition();
				break;
			case 5:MatrixSubtraction();
				break;
			case 6:SymmetricOrNot();
				break;
			case 7:RowWiseAndColWiseSum();
				break;
			case 8:System.exit(0);
			}
		}
		
		
	}
	private static void RowWiseAndColWiseSum() {
		// TODO Auto-generated method stub
		
	}
	private static void SymmetricOrNot() {
		// TODO Auto-generated method stub
		
	}
	//Matrix Subtraction Module
	private static void MatrixSubtraction() {
		int b[][]=new int [r][c];
		int sub[][]=new int[r][c];
		System.out.println("Enter the elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				b[i][j]=s.nextInt();
			}
		}
		 for(int i=0;i<r;i++)
		    {
		    for(int j=0;j<c;j++)
		    sub[i][j]=a[i][j]-b[i][j];
		    }
		System.out.println("subtraction of Matrix is");
		for(int m=0;m<r;m++)
		{
			for(int n=0;n<c;n++)
			{
				System.out.print(sub[m][n]+" ");
			}
			System.out.println(); 
		}
		}
	//MatriX Addition
	private static void MatrixAddition() {
		int d[][]=new int [r][c];
		int sum[][]=new int [r][c];
		System.out.println("Enter the elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				d[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<r;i++)
	    {
	    for(int j=0;j<c;j++)
	   {
	    	sum[i][j]=a[i][j]+d[i][j];
	   }
	    }
		System.out.println("sum of Matrix  is");
		for(int m=0;m<r;m++)
		{
			for(int n=0;n<c;n++)
			{
				System.out.print(sum[m][n]+" ");
			}
			System.out.println(); 
		}
		
	}
	//Diagonal Difference
	private static void DiagonalDifference() {
		// TODO Auto-generated method stub
		
	}
	//Matrix Multiplication
	private static void MatrixMultiplication() {
		
		int e[][]=new int [r][c];
		int mul[][]=new int [r][c];
		System.out.println("Enter the elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				e[i][j]=s.nextInt();
			}
		}
		 
		  for (int i = 0; i < r; i++)
		    {
		      for (int j = 0; j < c; j++)
			{
			  mul[i][j] = 0;
			  for (int k = 0; k < c; k++)
			    {
			      mul[i][j] += a[i][j] * e[i][j];
			    }
			}
		    }
		  System.out.println("Multiplication is:");
		  for(int m=0;m<r;m++)
			{
				for(int n=0;n<c;n++)
				{
					System.out.print(mul[m][n]+" ");
				}
				System.out.println(); 
			}
		
	}
	//Matrix Transpose
	public static void MatrixTranspose() {
		for(int i=0;i<r;i++){    
			for(int j=0;j<c;j++){    
			transpose[i][j]=a[j][i];  
			}    
			} 
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<r;i++)
		{    
		for(int j=0;j<c;j++)
		{    
		System.out.print(transpose[i][j]+" ");    
		}    
		System.out.println();   

	}
	}
	//Printing Matrix
	public static void MatrixPrint()
	{
		System.out.println("Matrix is");
		for(int m=0;m<r;m++)
		{
			for(int n=0;n<c;n++)
			{
				System.out.print(a[m][n]+" ");
			}
			System.out.println(); 
		}
	}
	
	public static int Menu()
	{
		System.out.println("*************************Menu Option******************");
		System.out.println("1.Matrix Transpose");
		System.out.println("2.Matrix Multiplication");
		System.out.println("3.Diagonal Difference");
		System.out.println("4.Matrix Addition");
		System.out.println("5.Matrix Subtraction");
		System.out.println("6.Symmetric or not");
		System.out.println("7.Row wise and col wise sum");
		System.out.println("8.Exit");
		System.out.println("Enter the choice(1-8):");
		
		return s.nextInt();
		
	}
	
}


