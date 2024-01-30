package newPractice;

public class Patterns {
public static void main(String[] args) {
	int n=5;
	/*
	 * for(int i=1;i<=n;i++) { for(int j=1;j<=n;j++) { System.out.print("*"); }
	 * System.out.println(); }
	 
						*****
						*****
						*****
						*****
						*****
	 */
	
	/*
	 * for(int i=1;i<=n;i++) { for(int j=1;j<=n;j++) { if(i==j) {
	 * System.out.print("*"); } else System.out.print(" "); } System.out.println();
	 * }

						*    
						 *   
						  *  
						   * 
						    *
	  		
	 */
	
	/*
	 * for(int i=1;i<=n;i++) { for(int j=1;j<=n;j++) { if(i>=j) {
	 * System.out.print("*"); } else System.out.print(" "); } System.out.println();
	 * }
						*    
						**   
						***  
						**** 
						*****
	  
	 */
	
	/*
	 * for(int i=1;i<=n;i++) { for(int j=1;j<=n;j++) { if(i<=j) {
	 * System.out.print("*"); } else System.out.print(" "); } System.out.println();
	 * }
						*****
						 ****
						  ***
						   **
						    *
	 */
	
	/*
	 * for(int i=1;i<=n;i++) { for(int j=n;j>=1;j--) { if(i>=j)
	 * System.out.print("*"); else System.out.print(" "); } System.out.println(); }
						    *
						   **
						  ***
						 ****
						*****	 
	 */
	
	/*
	 * for(int i=1;i<=n;i++) { for(int j=n;j>=1;j--) { if(i<=j)
	 * System.out.print("*"); else System.out.print(" "); } System.out.println(); }
	 
							*****
							**** 
							***  
							**   
							*    

	 */
	
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=1;j--)
		{
			if(i==j || i==1 || j==n)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	
	/*
				    *
				   * 
				  *  
				 *   
				*    
	 
	 */
}
}
