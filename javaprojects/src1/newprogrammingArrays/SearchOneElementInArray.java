
package newprogrammingArrays;

public class SearchOneElementInArray {
	public static void main(String[] args) {
	int a[]= {10,13,56,43,76};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==56)
		{
			System.out.println("found");
			return;
		}
	}
	System.out.println("not found");
	}
}
