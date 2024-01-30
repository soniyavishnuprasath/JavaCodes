package hackerRank;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Arrays2D {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	       
	    	 Scanner s=new Scanner(System.in);
	         ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
	        
	         int n=s.nextInt();
	         for(int i=0;i<n;i++)
	         {
	              ArrayList<Integer> al=new ArrayList<>();
	             for(int j=0;j<n;j++)
	             {
	                 al.add(s.nextInt());
	             }
	             matrix.add(al);
	         }
	         
	         
	         int row=s.nextInt();
	         int col=s.nextInt();
	         if(row>=0 && row<matrix.size() && col>=0 && col<matrix.get(row).size())
	         {
	             int value=matrix.get(row).get(col);
	             System.out.println(value);
	         }
	         else
	         System.out.println("ERROR!");
	    }
	}

