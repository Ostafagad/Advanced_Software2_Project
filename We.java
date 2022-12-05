import java.util.ArrayList;

public class We extends Provider {
private static We v=null;

	
	private We() {
		System.out.println("We");
		name="We";
		fields.add("phone number");
		fields.add("zip code");
		fields.add("address");
		fields.add("amount of money");
		
	}
	public static We getWe()
	{
		if(v==null)
			v=new We();
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
