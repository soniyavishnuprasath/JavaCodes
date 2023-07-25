package part3java;

public class ExceptionEx3 {
	public static void main(String[] args) {
		try
		{
			div();
		}
		catch(Exception b)
		{
			
		}
		System.out.println("handled");
	}
public static void div()
{
	System.out.println(10/2);
	System.out.println(10/0);
}
}
