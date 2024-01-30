package newPractice;

public class CharacterOccurance {
public static void main(String[] args) {
	String str="welcome to java practice programs";
	int totLen=str.length();
	int charLen=str.replace("a", "").length();
	System.out.println(totLen-charLen);	
}
}
