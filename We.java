import java.util.ArrayList;

public class We extends Provider {
private static We v=null;

	
	private We() {
		System.out.println("We");
		name="We";

	}
	public static We getWe()
	{
		if(v==null)
			v=new We();
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
