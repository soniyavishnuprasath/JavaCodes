package newprogrammingpattern;

public class HallowDiamondStar {
public static void main(String[] args) {
	int n=11,mid=(n/2)+1,space=mid-1,star=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			if(k==1||k==star)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		if(i<mid)
		{
			space--;star+=2;
		}
		else
		{
			space++;star-=2;
		}
	}
}
}
