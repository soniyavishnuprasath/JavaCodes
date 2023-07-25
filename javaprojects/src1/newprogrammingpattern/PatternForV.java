package newprogrammingpattern;

public class PatternForV {
public static void main(String[] args) {
	int fp=1,lp=9;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=9;j++)
		{
			if(j==fp||j==lp)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		fp++;
		lp--;
	}
}
}
