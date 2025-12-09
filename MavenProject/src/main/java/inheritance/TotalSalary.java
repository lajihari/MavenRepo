package inheritance;

public class TotalSalary extends Calculation{
	
	double total;
	public TotalSalary()
	{
		System.out.println("Name:"+name);
		 System.out.println("Basic Pay:"+bp);
		 System.out.println("Deduction:"+ded);
		 System.out.println("Bonus:"+bonus);
		 System.out.println("HRA:"+hra);
		 System.out.println("PF:"+pf);
		 total=bp+hra-pf-ded+bonus;
		 System.out.println("Total Salary By Hand:"+total);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalSalary ts=new TotalSalary();

	}

}
