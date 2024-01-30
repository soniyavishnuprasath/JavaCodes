package hackerRank;
import java.util.*;
import java.io.*;

public class MathsPowerCalculation {
	

	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int count=0;
	            int s = 0;
				try {
					s = a+power(2,i)*b;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            System.out.println(s);
	            count++;	        
                if(count==n)
                break;
                
	        }
	        
           in.close();
	    }
	    public static int power(int m,int n)
	    {
	    	int pow=1;
	    	for(int j=1;j<n;j++)
	    	{
	    		pow=pow*m;
	    	}
	    	return pow;
	    }
	
}
