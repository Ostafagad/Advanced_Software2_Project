import java.util.ArrayList;

public class Orange extends Provider {
private static Orange v=null;

	
	private Orange() {
		System.out.println("Orange");
		name="Orange";

	}
	public static Orange getOrange()
	{
		if(v==null)
			v=new Orange();
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
