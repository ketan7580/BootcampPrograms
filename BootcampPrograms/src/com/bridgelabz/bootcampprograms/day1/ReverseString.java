package com.bridgelabz.bootcampprograms.day1;
import java.util.*;
public class ReverseString {
public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter String :");
	String str=scanner.nextLine();
	String str1[]=str.split("");
	//for(int i=0;i<str1.length;i++)
	
	for(int j=str1.length-1;j>=0;j--)
	{
		String reverse="";
		reverse=str1[j]+reverse;
		System.out.print(reverse+"");

	}
}
}