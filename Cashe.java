
public class Cashe implements Payment {
	private double cashValue;
	@Override
	public void pay(double amount) {
		cashValue-=amount;
		Form.handler=true;
	}

	@Override
	public void addfunds(double d) {
		cashValue+=d;
		
	}
	
	public double getCashValue() {
		return this.cashValue;
	}
	public void setCashValue(double cash) {
		this.cashValue=cash;
	}

}
