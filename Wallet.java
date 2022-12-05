public class Wallet implements Payment {
	private double balance;

	@Override
	public void pay(double amount) {
		
		balance-=amount;
		Form.handler=true;
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
	
	public void setBalance(double balance) {
		this.balance=balance;
	}

}
