package practice;

public class ObjectArray {
	public static void main(String[] args) {
		Object ob[]=new Object[5];
		ob[0]=new Student(101,"tina");
		ob[1]=new Student(105,"meena");
		ob[2]=new Student(104,"ria");
		ob[3]=new Pen("cello",50);
		ob[4]=new Pen("doms",90);
		
		for(int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i]);
		}
		
	}

}
