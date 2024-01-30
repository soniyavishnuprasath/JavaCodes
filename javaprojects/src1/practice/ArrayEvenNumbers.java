package practice;

public class ArrayEvenNumbers {
public static void main(String[] args) {
	int a[]= {5,7,2,34,12,45,87,67};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
			System.out.println(a[i]);
	}
}
}
