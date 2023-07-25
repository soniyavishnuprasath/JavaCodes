package part3java;

public class ArrayOfObject {
	public static void main(String[] args) {
		Mobile ob[]=new Mobile[5];
		Mobile m1=new Mobile("redme",12000d);
		Mobile m2=new Mobile("oppo",21000d);
		Mobile m3=new Mobile("nokia",15000d);
		Mobile m4=new Mobile("samsung",25000d);
		Mobile m5=new Mobile("i-phone",50000d);

		ob[0]=m1;
		ob[1]=m2;
		ob[2]=m3;
		ob[3]=m4;
		ob[4]=m5;
		
		for(int i=0;i<5;i++)
		{
			if(ob[i].brand=="oppo")
			{
			System.out.println(ob[i]);
			}	
		}
		System.out.println("********************");
		for(int i=0;i<5;i++)
		{
			if(ob[i].brand.length()>6)
			{
				System.out.println(ob[i]);
			}
		}
		System.out.println("********************");
		for(int i=0;i<5;i++)
		{
			String s=ob[i].brand;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='p')
				{
					System.out.println(s);
					break;
				}
			}
					}
	}

}
