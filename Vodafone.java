
public class Vodafone extends Provider {
	
	public Vodafone() {
		//System.out.println("vodafone Vodafone");
		name="Vodafone";
		fields.add("phone number");
		fields.add("city");
		amount=30;
	}

	@Override
	public void provideService(Service service) {
	  
		super.addService(service);
		
	}

}
