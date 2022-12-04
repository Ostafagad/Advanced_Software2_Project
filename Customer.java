import java.util.ArrayList;
public class Customer {
    private String user_name;
    private String password;
    private  String email;
    private Account acount;
    private Payment payment;
    private ProviderCreator pc;
    private Service ser;
    private ArrayList<Transaction>transactions;
    private static int custid=0;
    public Customer() {
    	
    	this.transactions= new ArrayList<Transaction>();
    	Customer.custid++;
    	
    }
    public void pay(Payment payment,double cost) {
    	/*if(type=="Credit")
    		payment= new CreditCard();
    	else if(type=="Wallet")
    		payment= new Wallet();
    	else if(type=="Cashe")
    		payment= new Cashe();
    	return payment;
    	*/
    	this.payment=payment;
    	payment.pay(cost);
    	this.transactions.add(new Transaction(Customer.custid,this.ser.sername,cost));
    	
    }
    public void chooseProvider(ProviderCreator pc) {
    	this.pc=pc;
    }
    
    public void chooseService(Service ser) {
    	this.ser=ser;
    }
    public void getTransaction(int id) {
 	   for(Transaction t: transactions)
 	   {  
 		   if(id==Transaction.transid) {
 			   System.out.println(t);
 		   }
 		   
 	   }
    }

}
