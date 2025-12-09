package aggregation;

public class Book {
	
	String BookName;
	int num;
	Author obj;
	
	public Book(String name,int n,Author ob)
	{
		this.BookName=name;
		this.num=n;
		this.obj=ob;
	}
	public void view()
	{
		System.out.println(BookName);
		System.out.println(num);
		obj.display();
		System.out.println(obj.name);
		System.out.println(obj.place);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author authObj=new Author("Hari","Kollam");
       Book obj1=new Book("Helen",20,authObj);
       obj1.view();
       
	}

}
