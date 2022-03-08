package javaBasics;

public class Loops5 {

	public static void main(String[] args) {
	//print 1 to 10 using while loop but quit if multiple of 7 is encountered
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
			if(i%7==0) {
			//	System.out.println("Hi");
				break;
				
			}
		}

	}

}
