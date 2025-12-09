package aggregation;

public class Author {
	
	String name;
	String place;
	public Author(String name,String place)
	{
		this.name=name;
		this.place=place;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(place);
	}

}
