import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;


public class Admin {
	//private ArrayList<ProviderCreator>providers;
	private double discount;
	private static Admin admin=null;
	//public Queue<Transaction>refunds;
	private RefundMenu rm;
//	private ProviderCreator p;
//	private Transaction t;
	private Admin() {
//		providers=new ArrayList<ProviderCreator>();
//		refunds= new  LinkedList<Transaction>();
		
	}
	public void addProvider(ProviderCreator obj) { //,Service service
		
		//this.p=obj;
		DataBase.getdb().addProviderToDB(obj);
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
	public void setoveralldiscount(double d)
	{
		this.discount=d;
	}
	public void setspecificdiscount(double d)
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
	public void setAdminUserName(String name) {
		DataBase.getdb().setAdminUserName(name);
	}
	 public void setAdminPassword(String pass) {
		 DataBase.getdb().setAdminPassword(pass);
		}
}


