
public class Customer {
    private String user_name;
    private String password;
    private  String email;
    private Account acount;
    private Payment payment;
    private ProviderCreator pc;
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
    }
    public void chooseProvider(ProviderCreator pc) {
    	this.pc=pc;
    }
    
    


}
