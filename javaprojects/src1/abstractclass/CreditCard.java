package abstractclass;

public class CreditCard extends Card{
	double limit;
	
	public CreditCard(long cardno,int cvv,int pin,String exp,double limit)
	{
		super(cardno,cvv,pin,exp);
		this.limit=limit;
		
	}
	
	public void payment()
	{
		System.out.println("this payment is done using creditcard");
	}
	public void view()
	{
		System.out.println("cardno="+cardno);
		System.out.println("cvv="+cvv);
		System.out.println("pin="+pin);
		System.out.println("exp="+exp);
		System.out.println("limit="+limit);
	}

}
