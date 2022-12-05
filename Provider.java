

import java.util.ArrayList;

public abstract class Provider {
	//protected double cost;
	protected ArrayList<Service>services;
	protected Form form;
	protected String name;
	protected ArrayList <String>fields;
	protected double amount;
	protected ArrayList <String>inputfields;
	public Provider() {
		services=new ArrayList<Service>();
		fields=new ArrayList<String>();
		form=new Form(inputfields,amount);
		inputfields=new ArrayList<String>();
	}
	public abstract void provideService(Service service);
	protected void addService(Service service) {
		
		this.services.add(service);
		service.setCost(amount);
	}
	public abstract void setForm(ArrayList <String>inputfields,double amount);
	 public void handlerMethod() {
		   if(Form.handler)
			   System.out.println("Payment Process Is Successful.");
		   else
			   System.out.println("Payment Process Is Not Completed.");
	   }

	
}
