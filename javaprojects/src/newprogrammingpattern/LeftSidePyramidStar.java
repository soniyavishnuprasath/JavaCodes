package newprogrammingpattern;

public class LeftSidePyramidStar {
	public static void main(String[] args) {
		int n=9,mid=(n/2)+1,space=mid-1,star=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=mid;j<space;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			{
				space--;
				star++;
				
			}
			else
			{
				space++;
				star--;
			}
		}
	}

}
