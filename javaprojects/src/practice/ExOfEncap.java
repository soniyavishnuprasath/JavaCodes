package practice;
import java.util.Scanner;

public class ExOfEncap {
	private int pin;
	private double bal;
	private long phoneno;
	long accno;
	Scanner s=new Scanner(System.in);
	public ExOfEncap(int pin, double bal, long phoneno, long accno) {
		super();
		this.pin = pin;
		this.bal = bal;
		this.phoneno = phoneno;
		this.accno = accno;
	}
	
	public void setPin()
	{
	System.out.println("enter the old pin");
	int p=s.nextInt();
	if(p==pin)
	{
		System.out.println("enter the new pin to change");
		pin=s.nextInt();
		System.out.println("you have changed your pin successfully");
	}
	else
	{
		System.out.println("you have enter wrong pin");
	}
	}
	
	public void getBal()
	{
		System.out.println("enter the pin num");
		int p=s.nextInt();
		if(p==pin)
		System.out.println("your acc balance is "+bal);
		else
		System.out.println("you have enter wrong pin");
	}
			
	 public void setPhoneno()
	 {
		 System.out.println("enter the old phoneno");
		 long c=s.nextLong();
			
			if(c==phoneno)
			{
				System.out.println("enter the new phoneno to change");
				phoneno=s.nextLong();
				System.out.println("you have changed your phoneno successfully");
			}
			else
			{
				System.out.println("you have enter wrong phoneno");
			}
		 
	 }
	 
}
	 
	
	


