package march9th;

public class Employee extends PeopleOfBangalore{
	int eid;
	String designation;
	
	public Employee(String name,int age,long contact,int eid,String designation)
	{
		super(name,age,contact);
		this.eid=eid;
		this.designation=designation;
	}
	public void display() {
		System.out.println("welcome employee");
	}
	public void detailsE()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("contact="+contact);
		System.out.println("eid="+eid);
		System.out.println("desgination="+designation);
		System.out.println(district);
	}

}
