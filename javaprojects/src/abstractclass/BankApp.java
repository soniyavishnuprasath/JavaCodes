
package abstractclass;

public class BankApp {
	public static void main(String[] args) {
		CreditCard c=new CreditCard(8765432210l,123,4455,"may23",100000);
		swipe(c);
		c.payment(); //both way is possible
		DebitCard d=new DebitCard(45678489423l,980,8899,"dec23",50000.99);
		swipe(d);
		d.payment();
	}
	public static void swipe(Card ob)
	{
		ob.payment();
		if(ob instanceof CreditCard)
		{
			CreditCard c1=(CreditCard)ob;
			c1.view();
			
		}
		else
		{
			DebitCard d1=(DebitCard)ob;
			d1.details();
			
		}
	}

}
