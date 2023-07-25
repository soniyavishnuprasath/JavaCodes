package part3java;

public class ExceptionEx2 {
public static void main(String[] args) {
	div();
	System.out.println("hello");
}
public static void div()
{
	try
	{
		System.out.println(10+2);
		System.out.println(10/0);
		System.out.println(10/2);
	}
	catch(ArithmeticException ob)
	{
		
	}
	System.out.println(("handled"));
}
}
