package programming;

public class Star {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=(9-i);j++)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j>=1;j--)
			{
				if(j==1||j==n)
					
			System.out.println("*"+" ");
			}
	}

}
}
