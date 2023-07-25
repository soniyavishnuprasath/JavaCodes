package newprogramming;

public class NthPrimeNum {
	public static void main(String[] args) {
		int pCount=0;
		for(int i=1;i<=100;i++)
		{
			int count=0,n=i,nth=5;
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
					count++;
			}
			if(count==2)
				{
				pCount++;
				if(pCount==nth)
				{
					System.out.println(n);
				break;
				}
				}
		}
	}

}
