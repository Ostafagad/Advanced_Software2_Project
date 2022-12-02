
public class Wallet implements Payment {
	private double balance=0.0;

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		balance-=amount;
	}
	//Adding funds to the wallet should be done via credit card.
	//the refund then the refund process should complete successfully
	public void addbalance(double d)
	{
		balance+=d;
	}
	
	

}
