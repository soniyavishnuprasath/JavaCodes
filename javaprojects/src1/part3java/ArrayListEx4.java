package part3java;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx4 {
	public static void main(String[] args) {
		ArrayList<Pen> ob=new ArrayList<Pen>();
		ob.add(new Pen("cello",25.5f));
		ob.add(new Pen("lexi",50f));
		ob.add(new Pen("doms",10f));
		ob.add(new Pen("camlin",99.9f));
		System.out.println(ob);
		Collections.sort(ob);
		System.out.println("after sorting " +ob);
		
		
		
	}

}