package practice;

public class Employee {
	int eid;
	String name;
	
	public Employee(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	public void display()
	{
		System.out.println(eid);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Employee e[]=new Employee[5];
		e[0]=new Employee(101,"turner");
		e[1]=new Employee(103,"allen");
		e[2]=new Employee(104,"ward");
		e[0].display();
		e[1].display();
		e[2].display();
	}

}
