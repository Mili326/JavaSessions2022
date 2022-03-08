package javaBasics;

import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {
		/*Take three numbers from the user and print the greatest number. 
		Test Data
		Input the 1st number: 25 
		Input the 2nd number: 78 
		Input the 3rd number: 87
		Expected Output :The greatest: 87
		*/
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Input the 1st number- ");
		int num1= sc.nextInt();
		System.out.print("Input the 2nd number- ");
		int num2= sc.nextInt();
		System.out.print("Input the 3rd number- ");
		int num3= sc.nextInt();
		
		if(num1 > num2 && num1>num3) {
			                			System.out.println("Num " + num1 + "is greatest");
		    						 }
			else if(num2>num3) {
								System.out.println("Num" + num2 + " is greatest");
								}
				else {
						System.out.println("Num"+num3+" is greatest");
					 }
				
			}
		

		
	}


