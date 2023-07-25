package practice;

import java.util.Scanner;

public class Account {
	float bal;
	int pin;
	Scanner s=new Scanner(System.in);
	
	public Account(int pin,float bal) {
		this.pin=pin;
		this.bal=bal;
	}
	
	public void widthDraw()
	{
		System.out.println("enter your pin");
		int p=s.nextInt();
		if(p==pin)
		{
			System.out.println("enter the amt to widthdraw");
			float f=s.nextFloat();
			if(f>bal)
			{
				throw new InSufficientFundException("invalid bal in your account");
				
			}
			else
			{
			bal=bal-f;
			System.out.println("collect your cash");
			}
		}
		else
			System.out.println("you have entered wrong pin");
	}
	public void checkBal() {
		System.out.println("your balance is "+bal);
	}
public static void main(String[] args) {
	Account a=new Account(1122,7000f);
	try {
		a.widthDraw();
		a.checkBal();
	} 
	finally
	{
		System.out.println("thank you for using");
	}
	
}
}
