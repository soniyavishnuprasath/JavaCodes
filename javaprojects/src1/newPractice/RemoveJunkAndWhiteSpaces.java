package newPractice;

public class RemoveJunkAndWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove junk or print only the alphabets and numbers
		String str="@#%^YF   SCVBNM<        >835381h  fgh n";
		//str=str.replaceAll("[^a-zA-Z0-9]", "");
		//System.out.println(str);
		
		//white space removal
		
		str=str.replaceAll(" ", "");
		System.out.println(str);

	}

}
