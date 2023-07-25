package programming;

public class Num9 {
	public static void main(String[] args) {
		int n=3,x=n,y=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n*2;j++)
			{
				if(j<=x)
					System.out.print(j);
				else if(j>=y)
					System.out.print(2*n-j);
				else
				System.out.print(" ");
			}
			x--;
			y++;
			System.out.println();
		}
	}

}
