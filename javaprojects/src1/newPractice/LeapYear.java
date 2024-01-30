package newPractice;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter year to check");
	int yr=scan.nextInt();
	if(yr%4==0 && yr%100!=0 || yr%400==0)
		System.out.println("Yes "+yr+" is a leap year");
	else
		System.out.println("Yes "+yr+" is not a leap year");
	
}
}
