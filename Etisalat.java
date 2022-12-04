import java.util.ArrayList;

public class Etisalat extends Provider {
private static Etisalat v=null;

	
	private Etisalat() {
		System.out.println("Etisalat");
		name="Etisalat";

	}
	public static Etisalat getEtisalat()
	{
		if(v==null)
			v=new Etisalat();
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
