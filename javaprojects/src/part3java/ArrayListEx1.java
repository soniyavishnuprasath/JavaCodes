package part3java;
import java.util.ArrayList;
public class ArrayListEx1 {
public static void main(String[] args) {
	ArrayList<Character> ac=new ArrayList<Character>();
	ac.add('q');
	ac.add('w');
	ac.add('e');
	ac.add('r');
	ac.add('t');
	ac.add('y');
	System.out.println(ac.size());
	for(int i=0;i<ac.size();i++)
	{
		System.out.println(ac.get(i));
	}
	ac.add(2,'z');
	System.out.println(ac);
	ArrayList<Object> ao=new ArrayList<Object>();
	//ao.add(12);
	ao.add("hello");
	ao.add(16.75f);
	ao.add('d');
	System.out.println(ao);
	ao.addAll(ac);
	System.out.println(ao);
	ao.clear();
	System.out.println(ao);
}
}

