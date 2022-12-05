import java.util.ArrayList;

public class Etisalat extends Provider {
private static Etisalat v=null;

	
	private Etisalat() {
		System.out.println("Etisalat");
		name="Etisalat";
		fields.add("phone number");
		fields.add("zip code");
		fields.add("address");
		fields.add("amount of money");
	}
	public static Etisalat getEtisalat()
	{
		if(v==null)
			v=new Etisalat();
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
