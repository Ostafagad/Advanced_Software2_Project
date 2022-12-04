import java.util.ArrayList;
public class Customer {
    private String user_name;
    private String password;
    private  String email;
    private Account acount;
    private Payment payment;
    private ProviderCreator pc;
    private Service ser;
    private double cost;
    private ArrayList<Transaction>transactions;
    private static int custid=0;
    private BaseCommand bc;
    private Service targetService;
    public Customer() {
    	
    	this.transactions= new ArrayList<Transaction>();
    	
    	Customer.custid++;
    	
    }
    public void pay(Payment payment,double cost) {
    	this.cost=cost;
    	this.payment=payment;
    	payment.pay(cost);
    	this.transactions.add(new Transaction(Customer.custid,ser.getsername(),cost));
    	
    }
    public void chooseProvider(ProviderCreator pc) {
    	this.pc=pc;
    }
    
    public void chooseService(Service ser) {
    	this.ser=ser;
    }
    /*public void getTransaction(int id) {
 	   for(Transaction t: transactions)
 	   {  
 		   if(id==Transaction.transid) {
 			   System.out.println(t.getservicename());
 			   System.out.println(Transaction.gettranid());
 			  System.out.println(t.getcustid());
 			  System.out.println(t.getamount());
 		   }
 		   
 	   }
    }*/
   public void refundRequest(int id) {
	   for(Transaction t: transactions)
 	   {  
 		   if(id==Transaction.transid) {
 			  this.bc.execute(t);
 			  break;
 		   }
 	   }
	   
   }
   public void setCommand(BaseCommand bc) {
	   this.bc=bc;
   }
   public double getCustomerAmount() {
	   return this.cost;
   }
   public Payment getPayment() {
	   return this.payment;
   }
   
   public Service searchService(String name) {
	   
	   for(Service service:pc.creatProvider().services) {
		   if(service.getsername()==name)
			   targetService=service;
		   		//System.out.println(service.getsername());
	   }
	   
	   return targetService;
   }
}
