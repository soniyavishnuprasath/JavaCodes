package newprogrammingpattern;

public class LeftTriangleAlphabet2 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					if(j==1||j==i)
					{
						System.out.print(j);
					}
					else
					{
						System.out.print(++ch);
					}
				}
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}
}
