package newprogrammingpattern;

public class DiamondNumbers {
	public static void main(String[] args) {
		int n=7;
		int mid=(n/2)+1,star=1,space=mid-1;
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k==1||k==star)
					System.out.print("1");
				else
					System.out.print(ch++);
			}
			System.out.println();
			if(i<mid)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
		}
	}
	

}
