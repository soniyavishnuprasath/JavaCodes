package newprogrammingpattern;

public class TopPyramidnumber3 {
public static void main(String[] args) {
	int n=5,space=n-1,star=1;
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
		space--;
		star+=2;
		
	}
}
}
