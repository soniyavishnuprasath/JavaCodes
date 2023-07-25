package programming;

public class Num7 {
	public static void main(String[] args) {
		int n=7,sp=n/2,num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			
			if(i!=n/2+1)
			{
				int x=1;
			for(int j=1;j<=num;j++)
			{
				System.out.print(x);
				if(j<=num/2)
					x++;
				else 
					x--;
			}
			}
			else
			{
				int y=2;
				for(int j=1;j<=num;j++)
				{
					System.out.print(y);
					if(j<=num/2)
						y=y+2;
					else
						y=y-2;
				}
				
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
