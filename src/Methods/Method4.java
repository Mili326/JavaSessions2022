package Methods;

public class Method4 {

	public void checkEvenOdd(int a) {
		
		if(a%2 ==0) {
			System.out.println(a+ " " + "Number is even");
		}
		else {
			System.out.println(a + " " +"Number is odd");
		}
		
		
	}
		public static void main(String[] args) {
		// Define a program to find out whether a given number is even or odd
			Method4 m4=new Method4();
			m4.checkEvenOdd(33);
			m4.checkEvenOdd(56);
			
			
			
			
	}

}
