package part3java;

public class Employee {
	String eid;
	float sal;
	long contact;
	
	public Employee(String eid, float sal, long contact) {
		this.eid = eid;
		this.sal = sal;
		this.contact = contact;
	}
	
	public String toString()
	{
		return eid+" "+sal+" "+contact;
	}
	

}
