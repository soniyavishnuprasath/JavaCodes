package march9th;

public class OlaApp {
	public static void book(Ola ob) //upcasting
	{
		ob.welcome(); //parent method
		ob.ride(); //overridden method of child
		if(ob instanceof Auto)
		{
			Auto a1=(Auto)ob;    //downcasting
			a1.rateA();
		}
		else
		{
			Mini m1=(Mini)ob;
			m1.rateM();
		}
		
	}
	public static void main(String[] args) {
		Auto a=new Auto(); //child object creation
		book(a);
		Mini m=new Mini();
		book(m);
	}

}
