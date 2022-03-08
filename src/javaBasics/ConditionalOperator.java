package javaBasics;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		//Write a Java program to test a number is positive or negative.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		sc.close();
		
		if(num>=0)
		{
			System.out.println(num+" is positive");
		}
		else {
			System.out.println(num + "is negative");
		}

	}

}
