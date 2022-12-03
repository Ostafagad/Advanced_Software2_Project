

import java.util.ArrayList;

public abstract class Provider {
	//protected double cost;
	protected ArrayList<Service>services;
	protected Form form;
	protected String name;
	protected ArrayList <String>fields;
	protected double amount;
	public Provider() {
		services=new ArrayList<Service>();
		fields=new ArrayList<String>();
		form=new Form(fields,amount);
	}
	public abstract void provideService(Service service);
	protected void addService(Service service) {
		
		this.services.add(service);
		service.setCost(get());
	}
	public abstract void setForm(ArrayList <String>fields,double amount);
//	public void setCost(double cost) {
//		this.cost=cost;
//	}
	public double get() {
		return this.amount;
	}
}
