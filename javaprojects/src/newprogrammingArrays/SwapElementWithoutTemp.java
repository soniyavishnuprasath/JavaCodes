package newprogrammingArrays;

public class SwapElementWithoutTemp {
	public static void main(String[] args) {
		int a[]= {23,65,34,21,9,5,2,4};
		int start=0,end=a.length-1;
		while(start<end)
		{
			
			a[start]=a[start]+a[end];
			a[end]=a[start]-a[end];
			a[start]=a[start]-a[end];
			start++;
			end--;
		}
		System.out.println("reverse elements are ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
