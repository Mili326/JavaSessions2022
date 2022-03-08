package javaBasics;

public class Loops3ReverseNumber {

	public static void main(String[] args) {
		
		for(int i=10;i>=1;i--) {
			
			System.out.println("Reverse order of numbers from 10 to 1 :" + i);
		}
      System.out.println("--------------------");
      
      int i=10;
      while(i>=1) {
    	  System.out.println(i);
    	  i--;
      }
      System.out.println("---------------------");
      int j=10;
       do {
    	   System.out.println(j);
    	   j--;
    	   }while(j>=1);
      
	}

}
