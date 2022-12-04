
public class Request {
      private Customer c;
	  public Request() {
		
	  }
	  public void accept(){
	       System.out.println("Document accepted");
	    
	       Admin.getAdmin().refunds.remove();
	       c.getPayment().addfunds(c.getCustomerAmount());
	   }
	   public void decline(){
	       System.out.println("Document declined");
	       Admin.getAdmin().refunds.remove();
	   }
	public void setrefundCustomer(Customer c) {
		this.c=c;
	}

}
