import java.util.ArrayList;

public class Vodafone extends Provider {
	private static Vodafone v=null;

	
	private Vodafone() {
		System.out.println("vodafone Vodafone");
		name="Vodafone";
		fields.add("phone number");
		fields.add("City");
		fields.add("amount of money");
		
	}
	public static Vodafone getvodafone()
	{
		if(v==null)
			v=new Vodafone();
		return v;
	}
	
	public void setForm(ArrayList <String>inputfields,double amount)
	{
		super.inputfields=inputfields;
		super.amount=amount;
	}
	

	@Override
	public void provideService(Service service) {
	    		super.addService(service);
		
	}

}
