package newprogrammingstring;

public class DifferenceBtwnSCPAndHeap {
	public static void main(String[] args) {
		/*String class- its an in build class defined in java.lang package
		 * its an example for final class
		 * inside string class toString,equals and hashcode methods are overridden
		 * constructors of string class
		 * 1.String();
		 * 2.String(String original)
		 * 3.String(StringBuffer buffer)
		 * 4.String(StringBuilder builder)
		 * 5.String(char[] value)
		 * characteristics of a string-string objects are immutable in nature 
		 * once string object s created we can't modify it 
		 * if u wants to change the string literals often then use stringBuffer and stringBuilder*/
		String s1=new String("hi");
		String s2=new String("hi");
		String s3=new String("hi");
		String s4="hi";
		String s5="hi";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s4==s5);
	}

}
