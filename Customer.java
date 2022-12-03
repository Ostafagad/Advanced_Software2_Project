
public class Customer {
    private String user_name;
    private String password;
    private  String email;
    private Account acount;
    private Payment payment;
    public Payment choosePayment(String type) {
    	if(type=="Credit")
    		payment= new CreditCard();
    	else if(type=="Wallet")
    		payment= new Wallet();
    	else if(type=="Cashe")
    		payment= new Cashe();
    	return payment;
    }
    


}
