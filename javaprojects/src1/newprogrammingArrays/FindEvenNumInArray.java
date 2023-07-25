package newprogrammingArrays;

import java.util.Scanner;

public class FindEvenNumInArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even numbers in array are "+a[i]);
			}
		}
	}

}
