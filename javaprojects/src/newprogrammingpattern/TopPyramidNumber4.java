package newprogrammingpattern;

public class TopPyramidNumber4 {
	public static void main(String[] args) {
		int n=5,space=n-1,star=1;
		for(int i=1;i<=n;i++)
		{
			int m=1;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k<=star/2)
					System.out.print(m++);
				else
					System.out.print(m--);
			}
			System.out.println();
			space--;
			star+=2;
		}
	}

}
