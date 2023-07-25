package part3java;

public class Mobile {
	String brand;
	double price;
	
	public Mobile(String brand, double price) {
		
		this.brand = brand;
		this.price = price;
	}
	
	public String toString()
	{
		return brand+" "+price;
	}

}
