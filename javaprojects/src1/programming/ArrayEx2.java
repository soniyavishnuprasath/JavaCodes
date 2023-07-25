/* WAJP to find the smallest number from the user entered array*/
package programming;
import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			 ar[i]=s.nextInt();
		}
		int small=ar[2];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<small)
			small=ar[i];
		}
		System.out.println(small);
	}

}
