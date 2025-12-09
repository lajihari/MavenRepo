package encapsulation;
public class SetPin {
	
	private int pin[]=new int[3];
	public void set()
	{
		pin[0]=1001;
		pin[1]=1234;
		pin[2]=1212;
	}
	
	public void validate(int u)
	{
		int[] p=this.pin;
		boolean found=false;
		for(int r:p)
		{
			if(u==r)
			{
				found=true;
				break;
			}	
		}
		if(found==true)
		{
			System.out.println(u+" valid pin");
		}
		else
		{
			System.out.println(u+" Not a valid pin");
		}
	}

}
