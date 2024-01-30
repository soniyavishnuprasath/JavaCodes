package newPractice;

import java.util.Scanner;

public class LargestOf3Numbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int res=c>(a>b?a:b)?c:(a>b?a:b);
	System.out.println(res);
}
}
