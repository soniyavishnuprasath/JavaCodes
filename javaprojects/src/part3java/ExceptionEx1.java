package part3java;

public class ExceptionEx1 {
	public static void main(String[] args) {
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException ob)
		{
			
		}
		System.out.println("Exception handled");
	}

}
