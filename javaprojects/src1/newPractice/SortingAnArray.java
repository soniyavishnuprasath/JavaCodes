package newPractice;

import java.util.Scanner;

public class SortingAnArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the elements to sort");
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) { //for ascending order,  use < for descending order 
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("after sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
