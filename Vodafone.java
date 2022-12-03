
public class Vodafone extends Provider {
	private static Vodafone v=null;
	
	private Vodafone() {
		//System.out.println("vodafone Vodafone");
		name="Vodafone";

	}
	public static Vodafone getvodafone()
	{
		if(v==null)
			v=new Vodafone();
		return v;
	}
	
	public void setForm(String num,String city,double amount)
	{
		fields.add(num);
		fields.add(city);
		super.amount=amount;
		}
	

	@Override
	public void provideService(Service service) {
	  
		super.addService(service);
		
	}

}
