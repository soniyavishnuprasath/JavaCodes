package newPractice;

import java.util.Scanner;

public class MaxAndMinElementInArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array elements");
	int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	/*
	 * int max=a[0],min=a[0]; for(int i=0;i<a.length;i++) { if(a[i]>max) { max=a[i];
	 * } if(a[i]<min) { min=a[i]; } }
	 * System.out.println("max number in array is "+max);
	 * System.out.println("min number in array is "+min);
	 */
	
	//find the 2nd max and min number
	
	int fMax=a[0],fMin=a[0],sMax=a[0],sMin=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>=fMax)
		{
			sMax=fMax;
			fMax=a[i];
		}
		else if(a[i]>=sMax)
		{
			sMax=a[i];
		}
		if(a[i]<=fMin)
		{
			sMin=fMin;
			fMin=a[i];
		}
		else if(a[i]<=sMin)
		{
			sMin=a[i];
		}
	}
	System.out.println("2nd max number in array is "+sMax);
	System.out.println("2nd min number in array is "+sMin);
	
}
}
