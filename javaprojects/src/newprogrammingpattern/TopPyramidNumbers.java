package newprogrammingpattern;

public class TopPyramidNumbers {
	public static void main(String[] args) {
		int n=7,space=n-1,star=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(i);
			}
			System.out.println();
			space--;
			star+=2;
		}
	}

}
