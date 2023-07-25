package programming;

public class Number6 {
	public static void main(String[] args) {
		int n=7,sp=n/2,num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
			System.out.print(" ");
			}
		
			for(int j=1;j<=num;j++)
			{
			System.out.print(j);
			}
			if(i<=n/2)
			{
				sp--;
				num=num+2;
			}
			else
			{
				sp++;
				num=num-2;
			}
			System.out.println();
		
	}
	}
}
