package Methods;

public class Methods3 {

	
	public static int max(int a,int b, int c) {
	   int max= a;
	   if(b>max)
	   {
		   max=b;
	   }
	   else if (c>max);
	   {  	   max=c;
	   }
	   return max;
		
		
	  									}
	   public static int min(int x, int y, int z) {
		   int min=x;
		   if(y<x) {
			   min=y;
		   }
		   else if(z<x) {
			   min=z;
		   }
		   return min;
		   
		   
	   }
	public static void main(String[] args) {
// Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

		
		System.out.println("Max:"+ " " + max(10,20,30));
		System.out.println("Min:" + " " +min(10,20,30));
		
		
		
		
		
		
	}

}
