package practice;

import java.util.Scanner;

public class Account1 {

	int pin;
	float bal;
	Scanner s=new Scanner(System.in);
	
	public Account1(int pin,float bal)
	{
		this.pin=pin;
		this.bal=bal;
	}
	public static void main(String[] args) {
		Account1 a=new Account1(1122,8000f);
		a.widthdraw();
		a.checkBal();
		
	}
	public void widthdraw()
	{
		System.out.println("Enter your pin number to widthdraw");
		int p=s.nextInt();
		if(p==pin)
		{
			System.out.println("enter the amt to widthdraw");
			float w=s.nextFloat();
			bal=bal-w;
			System.out.println("collect your cash");
		}
		else
			System.out.println("You have entered wrong pin");
	}
	public void checkBal()
	{
		System.out.println("enter your pin number to check balance");
		int p=s.nextInt();
		if(p==pin)
			System.out.println("your current bal is "+bal);
		else
			System.out.println("you have entered wrong pin number");
	}
}
