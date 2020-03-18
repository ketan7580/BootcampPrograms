package com.bridgelabz.bootcampprograms.day1;

import java.util.Scanner;

public class MatrixAddition
{
public static void main(String args[])
{
			int rows,columns,i,j;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter rows and columns");
			rows=scanner.nextInt();
			columns=scanner.nextInt();
			
			int first[][]=new int[rows][columns];
			int second[][]=new int[rows][columns];
			int sum[][]=new int[rows][columns];
			
			System.out.println("Enter elements in 1st matrix ");
			for(i=0;i<rows;i++)
			{
				for(j=0;j<columns;j++) 
				{
					first[i][j]=scanner.nextInt();
				}
			}
			for(i=0;i<rows;i++) 
			{
				for(j=0;j<columns;j++)
				{
				System.out.print(first[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Enter elements in 2nd matrix ");
			for(i=0;i<rows;i++)
			{
				for(j=0;j<columns;j++)
				{
					second[i][j]=scanner.nextInt();
				}
			}

			for(i=0;i<rows;i++)
			{
				for(j=0;j<columns;j++)
				{
				System.out.print(second[i][j]+" ");
	
				}
				System.out.println();
	
			}
			for(i=0;i<rows;i++) 
			{
				for(j=0;j<columns;j++) 
				{
					sum[i][j]=first[i][j]+second[i][j];
				}
			}
			System.out.println("Addition of matrix ");
			for(i=0;i<rows;i++) 
			{
				for(j=0;j<columns;j++)
				{
				System.out.println(sum[i][j]+" ");
				}
				System.out.println();
			 
			}		
			
}	
}
