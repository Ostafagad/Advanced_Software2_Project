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
    	
    	  Admin.getAdmin().setspecificdiscount(.2);
      	service=new SpecificDiscount(service,Admin.getAdmin().getdicount());
      	
          Admin.getAdmin().setoveralldiscount(.1); 
         
    	
    	service=new OverAllDiscount(service,Admin.getAdmin().getdicount());
//    	  Admin.getAdmin().setspecificdiscount(.2);
//    	service=new SpecificDiscount(service,Admin.getAdmin().getdicount());
    	
    	
    	
    	//Admin.getAdmin().addProvider(obj,service);
    	obj.creatProvider().addService(service);
    	ArrayList<String> list=new ArrayList<String>();
    	list.add("name");
    	list.add("city");
    	obj.creatProvider().setForm(list, amount);
    	//System.out.println(obj.creatProvider().get());
    	obj.creatProvider().addService(service);
    	//System.out.println(service.cost());
        Customer c=new Customer();
        c.chooseProvider(obj);
        c.chooseService(service);
        Wallet w=new Wallet();
        c.pay(w, service.cost());
       //System.out.println(w.getbalance()) ;
       BaseCommand bc=new AskforRefund();
       c.setCommand(bc);
       c.refundRequest(1);
       Request r=new Request();
       r.setrefundCustomer(c);
       RequestActionCommand rac=new ActionAccept(r);
       RequestActionCommand rac2=new ActionDecline(r);
       RefundMenu rm=new RefundMenu(rac,rac2);
       Admin.getAdmin().setRefundMenu(rm);
       DataBase.getdb().print();
        Admin.getAdmin().acceptrefund();
        System.out.println(w.getbalance()) ;
        service.getDiscountValue();
    	System.out.println(c.searchService("Mobile Recharge Service").getsername());
    	System.out.println( String.format("%.2f",c.checkDiscount()));
    	c.handlerMethod();
    }
}
