package programming;

public class Vinayagar {
	public static void main(String[] args) {
		int n=5,m=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==m||j==m||(i==1&&j>=m)||(j==n&&i>=m)||(i==n&&j<=m)||(j==1&&i<=m))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
