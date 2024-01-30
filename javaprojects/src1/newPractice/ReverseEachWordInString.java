package newPractice;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		String str = "The Ram Mandir is a Hindu temple under construction in Ayodhya, Uttar Pradesh, India. It is located at the site of Ram Janmabhoomi, the hypothesized birthplace of Rama, a principal deity of Hinduism.";
		String word[]=str.split(" "),revStr="";
		for (String each : word) {
			String revWord="";
			for(int i=each.length()-1;i>=0;i--)
			{
				revWord=revWord+each.charAt(i);
			}
			revStr=revStr+revWord+" ";
		}
		System.out.println(revStr);

	}
}
