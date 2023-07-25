package newprogrammingArrays;

//import java.util.Scanner;

public class FindTheGreatestNumInArray {
public static void main(String[] args) {
	int a[]= {12,45,32,14,76,32,43};
	int max=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
			max=a[i];
	}
	System.out.println("greatest num in this array is "+max);
}
}
