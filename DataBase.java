
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DataBase {
    protected ArrayList<Account> accounts;
    private static DataBase database=null;
    private ArrayList<ProviderCreator>providers;
    public Queue<Transaction>refunds;
    private DataBase()
    {
        this.accounts = new ArrayList<Account>();
        providers=new ArrayList<ProviderCreator>();
		refunds= new  LinkedList<Transaction>();
    }
    public static DataBase getdb()
    {
    	if(database==null)
    		database=new DataBase();
    	return database;
    }
    public void addProviderToDB(ProviderCreator p) {
    	this.providers.add(p);
    }
    
    public void addRefundToDB(Transaction t) {
    	this.refunds.add(t);
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