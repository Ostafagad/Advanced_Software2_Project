import java.util.ArrayList;

public class Orange extends Provider {
private static Orange v=null;

	
	private Orange() {
		System.out.println("Orange");
		name="Orange";
		fields.add("phone number");
		fields.add("City");
		fields.add("amount of money");
	}
	public static Orange getOrange()
	{
		if(v==null)
			v=new Orange();
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
