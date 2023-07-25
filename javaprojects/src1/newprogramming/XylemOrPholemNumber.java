package newprogramming;

import java.util.Scanner;

/*if the sum of first and last digits and sum of middle digits are equal
 * then its xylem num or pholem num*/
public class XylemOrPholemNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");;
		int n=s.nextInt();
		int temp=n;
		int sfl=n%10,sm=0;
		n=n/10;
		while(n!=0)
		{
			int k=n%10;
			if(n<=9)
				sfl=sfl+k;
			else
				sm=sm+k;
			n=n/10;
		}
		if(sfl==sm)
			System.out.println(temp+" is xylem num ");
		else
			System.out.println(temp+" is pholem num");
	}

}
