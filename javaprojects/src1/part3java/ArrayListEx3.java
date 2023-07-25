package part3java;
import java.util.ArrayList;
public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList<Student> ob=new ArrayList<Student>();
		ob.add(new Student(103,"anu"));
		ob.add(new Student(104,"priya"));
		ob.add(new Student(105,"nimi"));
		System.out.println(ob);
		for(int i=0;i<ob.size();i++)
		{
			System.out.println(ob.get(i));
		}
		for(Student i:ob)
		{
			System.out.println(i);
		}
		
	}

}
