package newprogramming;

public class AmstrongNumberBtwnrange {
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
		{
			int n=i,temp=n,count=count(n),sum=0;
			while(n!=0)
			{
				int k=n%10;
				sum=sum+power(k,count);
				n=n/10;
			}
			if(sum==temp)
				System.out.println(temp);
		}
		
	}
	public static int power(int m,int n)
	{
		int pow=1;
		for(int i=1;i<=n;i++)
		{
			pow=pow*m;
		}
		return pow;
	}
	public static int count(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}

}
