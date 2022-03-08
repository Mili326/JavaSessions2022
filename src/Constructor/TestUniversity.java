package Constructor;

import java.util.ArrayList;

public class TestUniversity {

	public static void main(String[] args) {
		
		University univ=new University("A","London");
		System.out.println(univ.name+" "+ univ.country);
		
		ArrayList<String> courses=new ArrayList<String>();
		courses.add("Arts");
		courses.add("Electrical");
		courses.add("Computer");
		courses.add("Electronics");
		
		University univ1 = new University("B","USA","03-04-1982",courses);
		System.out.println("Univ name:" + " "+univ1.name+","+ "Univ country:"+"" + univ1.country+", "+ "Univ established date:"+ ""+ univ1.establishedDate);
		System.out.println(univ1.courses);
		
		String c0=univ1.courses.get(0);
		System.out.println(c0);
		String c1=univ1.courses.get(1);
		System.out.println(c1);
		String c2=univ1.courses.get(2);
		System.out.println(c2);
		String c3=univ1.courses.get(3);
		System.out.println(c3);
		
		
	}

}
