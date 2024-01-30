package hackerRank;

import java.util.Scanner;

public class EndOfLineProgram {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
     
     
     while(s.hasNext())
     {
         String str=s.nextLine();        
         if(str.contains("end-of-file"))
         {
         break;
         }
     }
}
}
