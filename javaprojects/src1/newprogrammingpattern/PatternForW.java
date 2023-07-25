package newprogrammingpattern;

public class PatternForW {
public static void main(String[] args) {
	int n=5,fp=0,lp=0,mid=n/2+1;
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=1;j--)
		{
			if(j==1||j==n||((j==fp||j==lp)&&i>=mid))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		if(i==1)
		{
			fp=1;
			lp=n;
		}
		System.out.println();
		fp++;
		lp--;
	}
}
}
