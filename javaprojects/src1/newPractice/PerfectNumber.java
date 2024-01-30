package newPractice;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	
	/*perfect number
	 * int num=6,per=0; for(int i=1;i<num;i++) { if(num%i==0) per=per+i; }
	 * if(per==num) System.out.println(num+ " is a perfect number"); else
	 * System.out.println(num+ " is not a perfect number");
	 */
	
	/*print the perfect number in range
	 * for(int j=1;j<=100;j++) { int num=j,per=0; for(int i=1;i<num;i++) {
	 * if(num%i==0) per=per+i; } if(per==num) System.out.println(per); }
	 */
	
	//nth perfect number
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the nth position");
	int pCount=0,nth=scan.nextInt();
	for(int j=1;true;j++)
	{
	int num=j,per=0;
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
			per=per+i;
	}
	if(per==num)
	{
		pCount++;
		if(pCount==nth)
		{
			System.out.println(per);
		break;
		}
		
	}

	}
	
}
}
