/*WAJP to find the biggest element in the user entered array*/
package programming;
import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		int big=ar[3];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>big)
				big=ar[i];
		}
		System.out.println(big);
	}

}
