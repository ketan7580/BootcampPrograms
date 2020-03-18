package com.bridgelabz.bootcampprograms.day1;

import java.util.Scanner;

public class EvenOdd {
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Number");
	int number=scanner.nextInt();
	if(number==0) {
		System.out.println("Please enter number from 1");
	}
	else if(number%2==0) {
		System.out.println("Number is Even");
	}
	else{
		System.out.println("Nmuber is Odd");
	}
}
}
