package programming;

import java.util.Scanner;

public class Alphabets {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
			System.out.print(" ");
			}
			int x=1;
			for(int j=1;j<=(2*i-1);j++)
			{
			System.out.print((char)(x+64));
			if(j<i)
				x++;
			else
				x--;
			}
			System.out.println();
		}
	}


}
