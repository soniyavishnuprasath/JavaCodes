package newprogramming;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("enter the year to check its leap or not");
				int year=s.nextInt();
				if(year%4==0&&year%100!=0||year%400==0)
				System.out.println(year +" leap year");
				else
					System.out.println(year +" not a leap year");
			}
			catch(Exception ob)
			{
				
			}
	}

}
