package newprogrammingArrays;

public class SecondLargestElementInArray {
public static void main(String[] args) {
	int a[]= {7,23,54,86,74,15};
	int fl=Integer.MIN_VALUE;
	int sl=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>=fl)
		{
			sl=fl;
			fl=a[i];
		}
		else if(a[i]>=sl)
		{
			sl=a[i];
		}
	}
	System.out.println("Second largest values is "+sl);
}
}
