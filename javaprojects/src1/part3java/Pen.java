package part3java;

public class Pen implements Comparable<Pen> {
String brand;
float price;

public Pen(String brand, float price) {
	this.brand = brand;
	this.price = price;
}

public String toString()
{
	return brand+" "+price;
}
/*public int compareTo(Pen s)
{
	if(this.price==s.price)
		return 0;
	else if(this.price>s.price)
		return 1;
	else
		return -1;
}*/
public int compareTo(Pen s)
{
	if(this.brand.compareTo(s.brand)==0)
		return 0;
	else if(this.brand.compareTo(s.brand)>0)
		return 1;
	else
		return -1;
}

}
