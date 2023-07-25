package abstractclass;

public class DebitCard extends Card{
	double bal;
	
	public DebitCard(long cardno,int cvv,int pin,String exp,double bal)
	{
		super(cardno,cvv,pin,exp);
		this.bal=bal;
	}
	public void payment()
	{
		System.out.println("payment is done using debitcard");
	}
	public void details()
	{
		System.out.println("cardno="+cardno);
		System.out.println("cvv="+cvv);
		System.out.println("pin="+pin);
		System.out.println("exp="+exp);
		System.out.println("bal="+bal);
	}

}
