package newprogrammingpattern;

public class HallowPyramidStar {
	public static void main(String[] args) {
		int n=5,star=1,space=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k==1||k==star||i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			star+=2;
			space--;
		}
	}

}
