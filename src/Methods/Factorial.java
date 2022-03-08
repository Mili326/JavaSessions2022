package Methods;

public class Factorial {
	
	public int factorial(int n) {
		
		if(n==1 || n==0) 
			return 1;
		
		return n*factorial(n-1);
		}
	
		
	public static void main(String[] args) {
//Write a program to print the factorial of a number by defining a method named 'Factorial'.
	/*	Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
		4! = 1*2*3*4 = 24
		3! = 3*2*1 = 6
		2! = 2*1 = 2
		Also,
		1! = 1
		0! = 0
     */
	/*	int num=4;
		int factorial=1;
		  		
			for(int i=1;i<=num;++i) {
				factorial=factorial*i;
				
				}
			System.out.println("Factorial of "+ num +":"+ factorial);
		*/
		Factorial f=new Factorial();
		int num=4;
		System.out.println("Factorial of"+num+ ":"+f.factorial(4));
	}

}
