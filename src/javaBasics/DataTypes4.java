package javaBasics;

public class DataTypes4 {

	public static void main(String[] args) {
	/*Write a Java program to print the result of the following operations. Change your test data accordingly.
		Test Data:
			a. -5 + 8 * 6  =43 
			b. (55+9) % 9  = 1 
			c. 20 + -3*5 / 8 =19
			d. 5 + 15 / 3 * 2 - 8 % 3  =13 
			e.((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
			*/
		
		int i=-5;
		int j=8;
		int k=6;
		System.out.println(i+j*k);
		System.out.println("-------------");
		
		System.out.println((55+9)%9);
		System.out.println(20 + -3*5 / 8);
		System.out.println( 5 + 15 / 3 * 2 - 8 % 3);
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
		//Try to concat "Hello Selenium" with a character 't'.
		String s= "Hello Selenium";
		char c='t';
		System.out.println(s+c);
		
		//Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
		//"Your Toal amount is. 3700".
		
		int a=100;
		int b=200;
		int c1=3400;
		System.out.println("Your Total amount is :"+(a+b+c1));
		
		//What should be the output for :
            byte b3 = 065;
             System.out.println(b3);
		
		
		
		
	}

}
