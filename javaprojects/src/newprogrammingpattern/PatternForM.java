package newprogrammingpattern;

public class PatternForM {
	public static void main(String[] args) {
		int n=7,fp=0,lp=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n||(j==fp||j==lp)&&i<=n/2+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			if(i==1)
			{
				fp=1;
				lp=n;
			}
			fp++;
			lp--;
			System.out.println();
		}
	}

}
