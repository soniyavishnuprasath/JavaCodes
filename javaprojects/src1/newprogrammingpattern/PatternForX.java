package newprogrammingpattern;

public class PatternForX {
public static void main(String[] args) {
	int n=5,fp=1,lp=n;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
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
