import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner myObj = new Scanner(System.in);
    	 double amount = myObj.nextDouble();
	// write your code here
//        DataBase c=new DataBase();
//        Account a=new Account();
//        SignUp s=new SignUp(a,c);
//        Signin sin=new Signin(a,c);
//        a.addAccount("mena","1234","addsd");
//        s.signUp(a);
//        Account b=new Account();
//        b.addAccount("alaa","1s4","agdssd");
//        s.signUp(b);
//        Account n=new Account();
//        n.addAccount("alaa","1s4","agdssd");
//        s.signUp(n);
//        sin.signin("alaa","hkk");
    	Service service=new mobileRechargeService();
    	ProviderCreator obj=new VodafoneCreator();
    	obj.creatProvider();
    	

    	
    	Admin.getAdmin().setdicount(.1);
    	service=new OverAllDiscount(service,Admin.getAdmin().getdicount());
    	//Admin.getAdmin().addProvider(obj,service);
    	obj.creatProvider().addService(service);
    	ArrayList<String> list=new ArrayList<String>();
    	list.add("name");
    	list.add("city");
    	obj.creatProvider().setForm(list, amount);
    	System.out.println(obj.creatProvider().get());
    	obj.creatProvider().addService(service);
    	System.out.println(service.cost());
        Customer c=new Customer();
        Wallet w=new Wallet();
        c.pay(w, service.cost());
       System.out.println(w.getbalance()) ;
        
        
    	
    	
    	
    }
}
