package march9th;

public class SwipeMachine {
	public static void swipe(Card ob)
	{
		ob.payment();
		if(ob instanceof DebitCard)
		{
			DebitCard d=(DebitCard)ob;
			d.displayDebit();
		}
		else
		{
			CreditCard c=(CreditCard)ob;
			c.displayCredit();
		}
	}
	public static void main(String[] args) {
		CreditCard x=new CreditCard();
		swipe(x);
		DebitCard y=new DebitCard();
		swipe(y);
	}

}
