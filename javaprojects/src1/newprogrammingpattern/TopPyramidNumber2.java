package newprogrammingpattern;

public class TopPyramidNumber2 {
public static void main(String[] args) {
	int n=5,space=n-1,star=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			if(k%2==0)
				System.out.print(i);
			else
				System.out.print(k);
		}
		System.out.println();
		space--;
		star+=2;
		
	}
}
}
