package javaBasics;


/* Write a program to create a static Array, having following cricket data:
--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console using normal for/while loop and for each loop
*/
public class Array2Cricket {
							public String name;
							public int age;
							public String teamName;
							public String dob;
							public char gender;
							public double strikerate;
							public boolean isActive;
							
//constructor
   Array2Cricket(String name,int age,String teamName,String dob,char gender,double strikerate,boolean isActive){
	this.name=name;
	this.age=age;
	this.teamName=teamName;
	this.dob=dob;
	this.gender=gender;
	this.strikerate=strikerate;
	this.isActive=isActive;
}

  public void display()
    {
	  	System.out.println("Student name:"+ name+ "," + "Age:" + age + "," + "TeamName :" + teamName + ","+ "Dob:"+ dob +"," + "Gender:" + gender +","+ "StrikeRate:" + strikerate + "," + "IsActive:"+ isActive);
    }

	public static void main(String[] args) {
		
		
    Array2Cricket obj[]=new Array2Cricket[4];
	obj[0]=new Array2Cricket("Mini",25,"A","04/03/1986",'F',2.01,false);
	obj[1]=new Array2Cricket("MiMi",26,"A","04/03/1981",'F',3.01,true);
	obj[2]=new Array2Cricket("MM",23,"B","04/03/1982",'M',5.01,true);
	obj[3]=new Array2Cricket("Mi",27,"B","04/03/1983",'M',4.01,false);
	
	
	
	for(int i=0;i<4;i++)
	{
		System.out.println("Player data");
		obj[i].display();
	}
	
	
	
	
	
	
	
	}

}
