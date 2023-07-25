/*WAJP to handle StringIndexOutOfBoundsException*/
package part3java;

public class ExceptionEx {
	public static void main(String[] args) {
		String s="hello";
		try
		{
		for(int i=0;i<=5;i++)
		{
			System.out.println(s.charAt(i));
		}
		}
		catch(StringIndexOutOfBoundsException ob)
		{
			
		}
		System.out.println("Exception handled");
	}

}
