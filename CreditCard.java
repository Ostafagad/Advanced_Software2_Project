
public class CreditCard implements Payment {
	private String cardnumber;
	private String password;
	private double cardBalance;

	@Override
	public void pay(double amount) {
		cardBalance-=amount;
		Form.handler=true;
		
	}
	public void setcardinfo(String num,String pass)
	{
		this.cardnumber=num;
		this.password=pass;
	}
	public String getcardnum()
	{
		return cardnumber;
	}
	public String getpass()
	{
		return password;
	}
	@Override
	public void addfunds(double d) {
		// TODO Auto-generated method stub
		cardBalance+=d;
	}
	public double getCardBalance() {
		return this.cardBalance;
	}
	
	public void setCardBalance(double cardBalance) {
		this.cardBalance=cardBalance;
	}

}
