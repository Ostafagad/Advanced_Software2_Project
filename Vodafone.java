import java.util.ArrayList;

public class Vodafone extends Provider {
	private static Vodafone v=null;

	
	private Vodafone() {
		System.out.println("vodafone Vodafone");
		name="Vodafone";

	}
	public static Vodafone getvodafone()
	{
		if(v==null)
			v=new Vodafone();
		return v;
	}
	
	public void setForm(ArrayList <String>fields,double amount)
	{
		super.fields=fields;
		super.amount=amount;
	}
	

	@Override
	public void provideService(Service service) {
	  
		super.addService(service);
		
	}

}
