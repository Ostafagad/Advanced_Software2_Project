import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;


public class Admin {
	private ArrayList<ProviderCreator>providers;
	private double discount;
	private static Admin admin=null;
	//private Queue<Double>refunds;
	private Admin() {
		providers=new ArrayList<ProviderCreator>();
		//refunds= new  LinkedList<Double>();
		
	}
	public void addProvider(ProviderCreator obj) { //,Service service
		//service.setCost(100);
		 //obj.creatProvider().addService(service);
		this.providers.add(obj);
	}
	/*public void addRefund(double ) {
		
	}*/
	public void setdicount(double d)
	{
		this.discount=d;
	}
	public double getdicount()
	{
		return this.discount;
	}
//	public void addService(Service s) {
//		
//	  s.setCost(100);
//	}
	public static Admin getAdmin() {
		if(admin==null)
			admin=new Admin();
		return admin;
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
