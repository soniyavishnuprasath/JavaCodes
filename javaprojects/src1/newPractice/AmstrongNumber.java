package newPractice;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		// sum of power(number of digits) of each digits is equal to the same number

		/*Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int temp = num, count = count(num), sum = 0;
		while (num != 0) {
			int k = num % 10;
			sum = sum + power(k, count);
			num = num / 10;
		}
		if (temp == sum)
			System.out.println(temp + " is an amstrong number");
		else
			System.out.println(temp + " is not an amstrong number");
	}

	public static int count(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	public static int power(int m, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * m;
		}
		return pow;
	}*/
		for(int i=1;i<=1000;i++)
		{
		//Scanner scan = new Scanner(System.in);
		//System.out.println("enter a number");
		int num = i;
		int temp = num, count = count(num), sum = 0;
		while (num != 0) {
			int k = num % 10;
			sum = sum + power(k, count);
			num = num / 10;
		}
		if (temp == sum)
			System.out.println(temp);
		
	}
	}

	public static int count(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	public static int power(int m, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * m;
		}
		return pow;
	}
}
