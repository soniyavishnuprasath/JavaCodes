package programming;

public class V1star {

public static void main(String[] args) {
	int n=5,x=1,y=2*n-1;
	for(int i=n;i>=1;i--)
	{
		for(int j=n;j>=1;j--)
		{
			if(j==x||j==y)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		x--;
		y++;
		System.out.println();
	}
}
}
