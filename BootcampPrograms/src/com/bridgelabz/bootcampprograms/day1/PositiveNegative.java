package com.bridgelabz.bootcampprograms.day1;
import java.util.*;
public class PositiveNegative {
public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Number");
		int number=scanner.nextInt();
		if(number>0) {
			System.out.println("Number is Positive");
		}
		else if(number<0) {
			System.out.println("Number is Negative");
		}
		else
			System.out.println("Number is Zero");
}
}
