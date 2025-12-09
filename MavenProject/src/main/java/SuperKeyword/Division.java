package SuperKeyword;

public class Division extends AdditionOfNumbers{
	
	int t;
	
	public Division()
	{
		t=super.Addition();
		
		if((t%10)==0)
		{
			System.out.println("The total value "+t+"  is divisible by 10");
		}
		else
		{
			System.out.println("The total value "+t+"  is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division d=new Division();
	}

}
