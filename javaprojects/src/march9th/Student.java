package march9th;

public class Student extends PeopleOfBangalore{
	int sid;
	String degree;
	
	public Student(String name,int age,long contact,int sid,String degree)
	{
		super(name,age,contact);
		this.sid=sid;
		this.degree=degree;
	}
	public void display()
	{
		System.out.println("welcome students");
	}
	public void detailsS()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("contact="+contact);
		System.out.println("sid="+sid);
		System.out.println("degree="+degree);
		System.out.println(district);
	}

}
