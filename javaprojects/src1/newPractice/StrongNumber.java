package newPractice;

public class StrongNumber {
	public static void main(String[] args) {
		// sum of factorial of given number which is equal to the same num

		int num = 234, temp = num, sum = 0;
		while (num != 0) {
			int k = num % 10;
			sum = sum + factorial(k);
			num=num/10;
		}
		if(temp==sum)
			System.out.println("its a strong number");
		else
			System.out.println("its not a strong number");

	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
