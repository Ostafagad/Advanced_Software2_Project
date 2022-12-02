

import java.util.ArrayList;

public class Admin {
	private ArrayList<ProviderCreator>providers;
	private double discount;

	public Admin() {
		providers=new ArrayList<ProviderCreator>();
		
	}
	public void addProvider(ProviderCreator obj,Service service) {
		service.setCost(100);
		 obj.creatProvider().addService(service);
		this.providers.add(obj);
	}
	
	public void setdicount(double d)
	{
		this.discount=d;
	}
	public double getdicount()
	{
		return this.discount;
	}
public void addService(Service s) {
		
	  s.setCost(100);
	}
//	public void print() {
//		
//		for(ProviderCreator obj: providers) {
//			System.out.println(obj.creatProvider());
//		}
//			
//			
//	}
}
