import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;


public class Admin {
	private ArrayList<ProviderCreator>providers;
	private double discount;
	private static Admin admin=null;
	public Queue<Transaction>refunds;
	private RefundMenu rm; 
	private Admin() {
		providers=new ArrayList<ProviderCreator>();
		refunds= new  LinkedList<Transaction>();
		
	}
	public void addProvider(ProviderCreator obj) { //,Service service
		
		this.providers.add(obj);
	}
	public void setRefundMenu( RefundMenu rm) {
		this.rm=rm;
	} 
	public void acceptrefund() {
		rm.clickAccept();
	}
	public void declinerefund() {
		rm.clickDecline();
	}
	/*public void addRefund(double ) {
		
	}
	*/
	public void setdicount(double d)
	{
		this.discount=d;
	}
	public double getdicount()
	{
		return this.discount;
	}

	public static Admin getAdmin() {
		if(admin==null)
			admin=new Admin();
		return admin;
	}
	public void print() {
		for(Transaction t:refunds) {
			System.out.println(t.getamount());
			System.out.println(t.getservicename());
			System.out.println(Transaction.gettranid());
			System.out.println(t.getcustid());
		}
	}

}
