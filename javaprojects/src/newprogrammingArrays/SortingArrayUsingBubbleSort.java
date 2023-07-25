package newprogrammingArrays;
// in bubble sort if there are n number of datas and n-1 iteration should be perform
//for every iteration one data is sorted
//if n-1 datas are sorted then remaining one data is sorted automatically
//for every iteration of outer loop inner loop iterates number of unsorted elements times
//for every iteration of inner loop one element is compared with the next element
//and based on the condition swapping is done.
public class SortingArrayUsingBubbleSort {
public static void main(String[] args) {
	int a[]= {65,23,14,-45,34};
	int n=a.length-1;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println("elements are sorted using bubble sort concept");
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);	
	}
	
}
}
