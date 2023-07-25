package multiple;

import java.util.Scanner;

public class Sbi extends Rbi implements Atm{
	long accno;
	private int pin;
	private double bal;
	Scanner s=new Scanner(System.in);
	
	public Sbi(long accno, int pin, double bal) {
		super();
		this.accno = accno;
		this.pin = pin;
		this.bal = bal;
	}
	
	public void checkBal()
	{
		System.out.println("enter your pin no to know ur balance");
		int p=s.nextInt();
		if(pin==p)
		{
			System.out.println("your balance is  "+bal);
		}
		else
		{
			System.out.println("you have entered wrong pin");
		}
	}
	public void withdraw()
	{
		System.out.println("enter the pin num to withdraw");
		int p=s.nextInt();
		if(pin==p)
		{
			System.out.println("enter the amt to withdraw");
			double amt=s.nextDouble();
			bal=bal-amt;
			System.out.println("withdraw is done your current balance is  "+bal);
		}
		else
		{
			System.out.println("you have entered wrong pin");
		}
	}

}
