
public class CreditCard implements Payment {
	private String cardnumber;
	private String password;
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		
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

}
