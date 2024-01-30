package practice;

public class Student {
	int sid;
	String name;
	 public Student(int sid,String name)
	 {
		 this.sid=sid;
		 this.name=name;
	 }
	 public String toString()
	 {
		 return sid+" "+name;
	 }
	 public static void main(String[] args) {
		Student s=new Student(101, "soniya");
		System.out.println(s);
	}

}
