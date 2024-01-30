package newPractice;

import java.util.Scanner;

public class DuplicatesInArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the elements to sort");
	int a[] = new int[5];
	for (int i = 0; i < a.length; i++) {
		a[i] = scan.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println("duplicate element "+a[i]);
			}
		}
	}
}
}
