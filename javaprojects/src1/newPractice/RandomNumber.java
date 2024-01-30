package newPractice;

import java.util.Random;

public class RandomNumber {
public static void main(String[] args) {
	Random rd=new Random();
	int rnum=rd.nextInt(1000);
	System.out.println(rnum);
	//for double
	System.out.println(Math.random());
}
}
