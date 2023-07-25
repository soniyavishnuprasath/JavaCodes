package newprogramming;

import java.util.Scanner;

public class CheckSignOfaNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num to check the sign");
		int num=s.nextInt();
		if(num>0)
			System.out.println(num+" is positive number ");
		else if(num<0)
			System.out.println(num+" is negative num");
		else
			System.out.println(num+" is zero");
	}

}
