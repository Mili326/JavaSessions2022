package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ArrayList3 {
	
//extract portion of Arraylist
	
	public static void main(String[] args) {
		//extract portion of ArrayList
		
		String arr[]= {"A","B","C","D","E"};
		List<String> li=new ArrayList<String>(Arrays.asList(arr));
		for(int k=2;k<=3;k++)
		{
			System.out.println(li.get(k));
		}
System.out.println("-------------------------");
	//	Write a Java program to print all the elements of a ArrayList using the position of the elements
		
		for(int k=0;k<li.size();k++)
		{
			System.out.println(li.get(k));
		}
		
		System.out.println("---------------------");
		//Write a Java program of swap two elements in an array list
		Collections.swap(li,3,1);
		
		System.out.println("Swapped list:"+" "+li);
		
		//Write a Java program to empty an array list.
	//	li.clear();
		li.removeAll(li);
		System.out.println("Empty list"+""+li);
		
		//Write a Java program to trim the virtual capacity of an array list instance to the current list size.
		//java.util.ArrayList.trimToSize() method trims the capacity of this ArrayList instance to be the list's current size
	      ArrayList<String> ar1=new ArrayList<String>();
	      ar1.add("Tom");
	      ar1.add("Peter");
	      ar1.add("Lisa");
	      
	      ar1.trimToSize();
	      System.out.println("Size of trimmed list"+" :"+ ar1.size());
	
	}

}
