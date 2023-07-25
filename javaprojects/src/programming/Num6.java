package programming;

public class Num6 {
	public static void main(String[] args) {
		int n=5,x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				System.out.print(x+" ");
				x++;
				if(x>9)
					x=1;
			}
			System.out.println();
		}
	}
}
