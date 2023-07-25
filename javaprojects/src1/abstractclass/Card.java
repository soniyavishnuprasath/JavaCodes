package abstractclass;

abstract public class Card {
	long cardno;
	int cvv,pin;
	String exp;
	
	public Card(long cardno,int cvv,int pin,String exp)
	{
		this.cardno=cardno;
		this.cvv=cvv;
		this.pin=pin;
		this.exp=exp;
	}
	abstract public void payment();
	
}
