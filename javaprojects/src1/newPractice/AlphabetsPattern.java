package newPractice;

public class AlphabetsPattern {
public static void main(String[] args) {
	 //alphabet X
	/*
	 * int n=5,fp=1,lp=n; for(int i=1;i<=n;i++) { for(int j=1;j<=n;j++) { if(j==fp
	 * || j==lp) System.out.print("*"); else System.out.print(" ");
	 * 
	 * } System.out.println(); fp++; lp--; }
	 */
	
	/* alphabet V
	 * int n=9,fp=1,lp=n; for(int i=1;i<=5;i++) { for(int j=1;j<=n;j++) { if(j==fp
	 * || j==lp) System.out.print("*"); else System.out.print(" ");
	 * 
	 * } System.out.println(); fp++; lp--; }
	 */
	
	int n=5,fp=0,lp=0;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1 || j==n || (j==fp || j==lp )&&i<=n/2+1)
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
