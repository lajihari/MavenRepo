package abstraction;

public class AbstractC extends P{

	void sum()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractC c=new AbstractC();
		//c.print();
		//c.sum();
		P p=new AbstractC();//parentname objectname=new childclassname;
		p.print();
		p.sum();
	}

}
