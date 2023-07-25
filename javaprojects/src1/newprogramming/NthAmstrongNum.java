package newprogramming;

public class NthAmstrongNum {
	public static void main(String[] args) {
		int nth=11,aCount=0;
		for(int i=1;i<=1000;i++)
		{
			int n=i,temp=n,sum=0,count=count(n);
			while(n!=0)
			{
				int k=n%10;
				sum=sum+power(k,count);
				n=n/10;
			}
			if(sum==temp)
			{
				aCount++;
				if(aCount==nth)
				{
					System.out.println(temp);
					break;
				}
			}
		}
		
	}
	public static int power(int m,int n)
	{
		int power=1;
		for(int i=1;i<=n;i++)
		{
			power=power*m;
		}
		return power;
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
