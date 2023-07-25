package multiple;

public class SbiApp {
public static void main(String[] args) {
	Sbi a=new Sbi(3421567890l,1234,8900d);
	a.checkBal();
	System.out.println("--------------------------------");
	a.withdraw();
	System.out.println("------------------------------");
	a.printInterest();
}

}
