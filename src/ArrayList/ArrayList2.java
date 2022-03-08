package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		//Write a Java program to insert  an element into the array list at the first and last positions

		ArrayList<String> colors=new ArrayList<String>();
		colors.add(0,"Pink");//add at first
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Purple");
		colors.add("Brown");
		
		colors.add(colors.size(),"Yellow");//add at last 
		System.out.println(colors.size());
		
		System.out.println("Color at index 1 :"+ ""+ colors.get(1));//retrieve at index
		//Write a Java program to update specific array element by given element.
		System.out.println("Color set at index 1 :"+""+colors.set(1, "Pink"));
		//Write a Java program to remove the third element from  array list.
		System.out.println(colors.get(0));
		System.out.println(colors.get(1));
		System.out.println(colors.get(2));
		System.out.println(colors.get(3));
		
		System.out.println("Remove third element:"+ colors.remove(2));
		
		
		for(String s:colors)
		{
			System.out.println(s);
		}
		
		if(colors.contains("Yellow")) {
			System.out.println("Yellow color is in the Arraylist");
			}
		else {
			System.out.println("yellow color is not in the Arraylist");
		     }
	
		//Write a Java program to reverse elements in a array list
		
		System.out.println("reverse elements in ArrayList");
		
		Collections.sort(colors,Collections.reverseOrder());
		System.out.println(colors);
	//or	
		Collections.reverse(colors);
		System.out.println(colors);
		
	//or 
		for(int k=colors.size()-1;k>=0;k--) {
			System.out.println(colors.get(k));
		}
		
	
		
		
	}

}
