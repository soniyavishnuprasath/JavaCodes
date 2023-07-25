package newprogrammingpattern;

public class VinayagaSymbol {
public static void main(String[] args) {
	int n=5,mid=n/2+1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==mid||j==mid||(j==1&&i<mid)||(i==1&&j>mid)||(j==5&&i>mid)||(i==5&&j<mid))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
