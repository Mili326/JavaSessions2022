package javaBasics;

public class Array3 {
	// Try to print the following pattern on the console: n = 4
	/*												n = 3
													n = 2
													n = 1
													n = 0
	 */
	
	public static void main(String[] args) {
		
		
		int arr[] =new int[6];
		  arr[0]=0;
		  arr[1]=1;
		  arr[2]=2;
		  arr[3]=3;
		  arr[4]=4;
		  
		int len=arr.length;
		System.out.println(len);
		
		for(int k=len-1;k>=0;k--) {
			System.out.println("n="+ arr[k]);
			
		}
		
		
		
	}

}
