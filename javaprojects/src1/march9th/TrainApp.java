package march9th;

public class TrainApp {
	public static void ticket(Train ob)
	{
		ob.welcome();
		ob.purpose();
		if(ob instanceof GoodsTrain)
		{
			GoodsTrain g1=(GoodsTrain)ob;
			g1.printCapacity();
		}
		else
		{
			PassengerTrain p1=(PassengerTrain)ob;
			p1.printTicketRate();
		}
		
	}
public static void main(String[] args) {
	GoodsTrain g=new GoodsTrain();
	ticket(g);
	PassengerTrain p=new PassengerTrain();
	ticket(p);
}
}
