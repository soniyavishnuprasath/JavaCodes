package polymorphism;

public class DrinkApp {
	public static void main(String[] args)
	{
	Drink d1=new Coffee(); //upcasting
	d1.welcome();
	d1.ready();

	Coffee c1=(Coffee)d1; //downcasting
	c1.typeC();

	System.out.println("-------------------------------------");

	Drink d2=new Tea(); //upcasting
	d2.welcome();
	d2.ready();

	Tea t1=(Tea)d2;
	t1.typeT();
	}

}
