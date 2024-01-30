package hackerRank;
import java.util.Scanner;

public class InOutFormatGuvi {

	    public static void main(String[] args)
	    {
	        Scanner scan=new Scanner(System.in);
	        int a[]=new int[2];
	        int b[]=new int[5];
	        
	        for(int i=0;i<2;i++)
	        {
	            a[i]=scan.nextInt();
	        }
	        for(int i=0;i<2;i++)
	        {
	            System.out.print(a[i]);
	            if(i<1)
	            System.out.print(" ");
	        }
	        if(b.length==5)
	        {
	        for(int i=0;i<5;i++)
	        {
	            b[i]=scan.nextInt();
	        }
	        System.out.println();
	        for(int i=0;i<5;i++)
	        {
	            System.out.print(b[i]);
	            if(i<4)
	            System.out.print(" ");
	        }
	        }
	        if(b.length==4)
	        {
	        for(int i=0;i<4;i++)
	        {
	            b[i]=scan.nextInt();
	        }
	        System.out.println();
	        for(int i=0;i<4;i++)
	        {
	            System.out.print(b[i]);
	            if(i<3)
	            System.out.print(" ");
	        }
	        }
	    
	    
	}
}
