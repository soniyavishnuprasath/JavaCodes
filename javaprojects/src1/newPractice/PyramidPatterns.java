package newPractice;

public class PyramidPatterns {
public static void main(String[] args) {
	/*
	 * int n=5,space=n-1,star=1; for(int i=1;i<=n;i++) { for(int j=1;j<=space;j++) {
	 * System.out.print(" "); } for(int k=1;k<=star;k++) { System.out.print("*"); }
	 * star+=2; space--; System.out.println();
	 * 
	 * }
	 
							    *
							   ***
							  *****
							 *******
							*********
	 */
	
	/*
	 * int n=5,mid=n/2+1,space=mid-1,star=1; for(int i=1;i<=n;i++) { for(int
	 * j=1;j<=space;j++) { System.out.print(" "); } for(int k=1;k<=star;k++) {
	 * System.out.print("*"); } System.out.println(); if(i<mid) { star+=2; space--;
	 * } else { star-=2; space++; } }
	 * 
								  *
								 ***
								*****
								 ***
								  *
	 */
	
	/*
	 * int n=5,mid=n/2+1,space=mid-1,star=1; for(int i=1;i<=n;i++) { for(int
	 * j=1;j<=space;j++) { System.out.print(" "); } for(int k=1;k<=star;k++) {
	 * System.out.print("*"); } System.out.println(); if(i<mid) { star++; space--; }
	 * else { star--; space++; } }
	 
								  *
								 **
								***
								 **
								  *

	 */
	
	int n=5,mid=n/2+1,space=mid-1,star=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=mid;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		if(i<mid)
		{
			star++;
			space--;
		}
		else
		{
			star--;
			space++;
		}
	}
	/*

							*
							**
							***
							**
							*
	 */
}
}
