package practice;

public class MobileExecute {
	public static void main(String[] args) {
		Mobile m[]=new Mobile[5];
		m[0]=new Mobile("oppo",345267d);
		m[1]=new Mobile("samsung",654321d);
		m[2]=new Mobile("i-phone",120000d);
		m[3]=new Mobile("redme",25000d);
		m[4]=new Mobile("realme",45321d);
		
		for(int i=0;i<m.length;i++)
		{
			if(m[i].brand=="oppo")
				System.out.println(m[i]);
		}
		System.out.println("*************************");
		for(int i=0;i<m.length;i++)
		{
			if(m[i].brand.length()>6)
				System.out.println(m[i]);
		}
		System.out.println("*************************");
		for(int i=0;i<m.length;i++)
		{
			String s=m[i].brand;
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
