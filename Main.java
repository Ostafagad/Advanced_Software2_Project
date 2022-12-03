import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
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
    	
//   	    Admin admin=new Admin();
//    	Admin admin1=new Admin();
    	
    	Admin.getAdmin().setdicount(.1);
    	service=new OverAllDiscount(service,Admin.getAdmin().getdicount());
    	//Admin.getAdmin().addProvider(obj,service);
    	obj.creatProvider().addService(service);
    	ArrayList<String> list=new ArrayList();
    	list.add("name");
    	list.add("city");
    	obj.creatProvider().setForm(list, 1000);
    	System.out.println(service.cost());
    	System.out.println(obj.creatProvider().get());
    	
    	
    	//admin.print();
    }
}
