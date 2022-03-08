package Methods;



public class Methods1 {

	int a=10;
	int b=20;
	int total;
	
	public int sum()
	{
		int total=a+b;
		return total;
	}
	public int multi(int x,int y)
	{
		int product=x*y;
		return product;
		
	}
		
	public static void main(String[] args) {
		// Write a program to print the sum of two numbers entered by user by defining your own method
		Methods1 m=new Methods1();
		System.out.println("Sum"+ m.sum());
		
		System.out.println(m.multi(20,30));
		
	}

}
