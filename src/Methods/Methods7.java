package Methods;

public class Methods7 {

	public void display(int r)
	{
		
		if(r>90 && r<=100)
		{
			System.out.println("Grade AA");
		}else if(r>80 && r<=90) {
			System.out.println("Grade AB");
		}else if(r>70 && r<=80)
		{
			System.out.println("Grade BB");
		}else if (r>60 && r<=70) {
			System.out.println("Grade BC");
		}else if(r>50 && r<=60) {
			System.out.println("Grade CD");
		}else if(r>40 && r<=50) {
			System.out.println("Grade DD");
			}else 
			{
				System.out.println("Grade fail");
				
			}
	}
	
	public static void main(String[] args) {
// Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
	/*Marks        Grade
91-100         AA
81-90          AB
71-80          BB﻿
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
	 * 
	 */
	
	Methods7 m7= new Methods7();
	m7.display(97);
	m7.display(82);
	m7.display(70);
	m7.display(45);
	
	
	
	
	
	
	
	
	
	}

}
