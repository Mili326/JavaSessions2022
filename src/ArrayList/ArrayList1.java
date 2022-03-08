package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {

	
	
	public static void main(String[] args) {
	// Write a Java program to create a new array list, add some colors (string) and print out the collection

		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Purple");
		colors.add("Brown");
		System.out.println(colors.size());
		for(String s:colors)
		{
			System.out.println(s);
		}
		System.out.println("----------------");
		for(int k=0;k<colors.size();k++)
		{
			System.out.println(colors.get(k));
		}
	}
}
