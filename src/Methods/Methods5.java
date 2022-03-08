package Methods;

public class Methods5 {

	public void isElibleToVote(int a)
	{
		if(a>=18) {
			System.out.println(a+" "+ "Eligible to vote");
		}
		else {
			System.out.println(a + " " +"Not eleigible to vote");
		}
	}
	
	
	
	public static void main(String[] args) {
//A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
		
        Methods5 m5 =new Methods5();
          m5.isElibleToVote(17);
          m5.isElibleToVote(20);
	}

}
