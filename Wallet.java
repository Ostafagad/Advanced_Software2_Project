public class Wallet implements Payment {
	private double balance=100000.0;

	@Override
	public void pay(double amount) {
		
		balance-=amount;
		
	}
	//Adding funds to the wallet should be done via credit card.
	//the refund then the refund process should complete successfully
	public void addfunds(double d)
	{
		balance+=d;
	}
	public double getbalance() {
		return this.balance;
	}
	
	

}
