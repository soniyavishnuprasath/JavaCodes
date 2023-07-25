package part3java;
import java.util.ArrayList;
public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<Object> ob=new ArrayList<Object>();
		ob.add(new Student(101,"tina"));
		ob.add(new Pen("cello",23.5f));
		ob.add(new Employee("Eid101",12000f,9876504321l));
		ob.add(new Student(102,"ria"));
		System.out.println(ob);
		System.out.println("*********************");
		
		for(int i=0;i<ob.size();i++)
		{
			System.out.println(ob.get(i));
		}
		System.out.println("*********************");
		
		for(Object i:ob)
		{
			System.out.println(i);
		}
	}

}
