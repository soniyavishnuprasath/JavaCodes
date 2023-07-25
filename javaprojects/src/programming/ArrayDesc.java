/* WAJP to print the entered array element in descending order*/
package programming;
import java.util.Scanner;
public class ArrayDesc {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
		}
		System.out.println("after sorting in descending order");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}

}
