package Methods;

public class Methods2 {

	
	public double area(double r) {
		double area=3.14*r*r;
		return area;
		
	}
	
	public double circum(double r) {
		
		double circum =2 *3.14*r;
		return circum;
	}
	
	public static void main(String[] args) {
// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
//radius r, circum =2 *3.14*r ,Area = 3.14*r*r
		
		Methods2 m2=new Methods2();
		System.out.println("Area of circle"+ " "+ m2.area(2));
		
		System.out.println("Circumference of circle"+ " " +m2.circum(4));
		
		
		
		
		
		
		
	}

}
