
public class Vodafone extends Provider {
	
	public Vodafone() {
		//System.out.println("vodafone Vodafone");
		name="Vodafone";

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
