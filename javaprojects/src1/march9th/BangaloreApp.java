package march9th;

public class BangaloreApp {
	public static void register(PeopleOfBangalore ob)
	{
		ob.display();
		if(ob instanceof Student)
		{
			Student s1=(Student)ob;
			s1.detailsS();
		}
		else
		{
			Employee e1=(Employee)ob;
			e1.detailsE();
		}
		
	}
public static void main(String[] args) {
	Student s=new Student("soniya",30,9876543210l,101,"ME");
	register(s);
	System.out.println("-----------------------------------");
	Employee e=new Employee("vishnu",33,8967452310l,103,"Test lead");
	register(e);
}
}
