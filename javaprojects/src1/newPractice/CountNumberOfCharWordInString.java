package newPractice;

public class CountNumberOfCharWordInString {
public static void main(String[] args) {
	String str="The Ram Mandir is a Hindu temple under construction in Ayodhya, Uttar Pradesh, India. It is located at the site of Ram Janmabhoomi, the hypothesized birthplace of Rama, a principal deity of Hinduism.";
	int wCount=1,chCunt=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			chCunt++;
		if(ch==' '&&str.charAt(i+1)!=' ')
			wCount++;
	}
	System.out.println("number of char "+chCunt);
	System.out.println("Number of words "+wCount);
	
}
}
