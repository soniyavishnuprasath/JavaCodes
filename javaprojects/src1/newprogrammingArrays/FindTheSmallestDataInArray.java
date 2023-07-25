package newprogrammingArrays;

public class FindTheSmallestDataInArray {
	public static void main(String[] args) {
		int a[]= {12,45,32,14,76,32,43};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("greatest num in this array is "+min);
	}

}
