package Methods;

public class Method6 {

	public boolean isPrime(int n) {
		//corner case
		if(n<=1)
		return false;
		
		
		for(int i=2; i<n; i++)
			  if(n%i==0)
				  return false;
			return true;
		
		}
	
	
	
	public static void main(String[] args) {
		//Define a method to find out if number ﻿is prime or not
		
		Method6 m6=new Method6();
		System.out.println("No is :"+ m6.isPrime(54));
		System.out.println("No is :"+ m6.isPrime(23));

	}

}
