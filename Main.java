import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner myObj = new Scanner(System.in);
    	String userName,password,email;
    	DataBase DB=DataBase.getdb();
    	int input,input2,input3,input4,admininput1,admininput2;
    	Admin admin=Admin.getAdmin();
    	 //Account a=new Account();
    	Customer c=new Customer();
    	 ProviderCreator vo=new VodafoneCreator();
    	 ProviderCreator we=new WeCreator();
    	 ProviderCreator or=new OrangeCreator();
    	 ProviderCreator et=new EtisalatCreator();
    	 Service mr=new mobileRechargeService();
    	 Service ip=new InternetPaymentServices();
    	 Service d=new Donations();
    	 Service qr=new QuarterReceipt ();
    	 Service more=new  MonthlyReceipt();
    	 Payment fundswallet;
    	 //static Service provider already exist
    	// vo.creatProvider().addService(mr);
//		vo.creatProvider().provideService(mr); 		      					
//		Admin.getAdmin().addProvider(vo);
//		
//		we.creatProvider().addService(mr);
//		we.creatProvider().addService(ip);	 
//		Admin.getAdmin().addProvider(we);
			

    	do {
    		
    		System.out.println("Choose your option:");
   		  System.out.println("1-Admin");
   		  System.out.println("2-CUstomer");
   		  System.out.println("3-Exit");
   		  input=myObj.nextInt();
   		if(input==1) {
			  do {
				  System.out.println("1-Sign Up ");
	        		 System.out.println("2-Sign In ");
	        		 System.out.println("4-Exit ");
	        		 System.out.println("Choose your option");
	        		 admininput1=myObj.nextInt();
	        		 //Admin Sign Up
	        		 if(admininput1==1) {
	        			 String adminusername,adminpassword;
	        			 System.out.println("username");
	        			 adminusername=myObj.next();
	        			 System.out.println("password");
	        			 adminpassword=myObj.next();
	        			 admin.setAdminUserName(adminusername);
	        			 admin.setAdminPassword(adminpassword);
	        		 }
	        		 
	        		 else if(admininput1==2) {
	        			 String usernameIn,passwordIn;
	        			 System.out.println("username");
	        			 usernameIn=myObj.next();
	        			 System.out.println("password");
	        			 passwordIn=myObj.next();
	        			// if(usernameIn==DB.getAdminName() && usernameIn==DB.getAdminPassword()) {
	        				 
	        				 do {
	        					 System.out.println("1- Add Provider");
	        					 System.out.println("2-Add Discount");
	        					 System.out.println("3-view refund list");
	        	        		 System.out.println("4-Exit ");
	        					 System.out.println("Choose your Option");
	        					 admininput1=myObj.nextInt();
	        					 int discount,option,pr,refund;
	        					 double disval;
	        					 
	        					 if(admininput1==1) {    
	        						 System.out.println("Choose provider you want to add:");
	        						 System.out.println("1- Vodafone");
		        					 System.out.println("2-We");
		        					 System.out.println("3-Orange");
		        					 System.out.println("4-Etisalat");
		        					 pr=myObj.nextInt();
		        					
		        					 if(pr==1)
		        					 {
		        						 
		        						vo.creatProvider().addService(mr);
		        						vo.creatProvider().addService(ip);		      					
		        						Admin.getAdmin().addProvider(vo);
		        						
		        						
		        					 }
		        					 else if(pr==2)
		        					 {
		        						
		        						 we.creatProvider().addService(mr);
			        					we.creatProvider().addService(ip);	
		        						 
		        							Admin.getAdmin().addProvider(we);		        						 
		        						 
		        					 }else if(pr==3)
		        					 {
		        						 or.creatProvider().addService(mr);
			        					or.creatProvider().addService(ip);	
		        							Admin.getAdmin().addProvider(or);			        						 
		        					 }
		        					 else if(pr==4)
		        					 {
		        						 et.creatProvider().addService(mr);
			        					et.creatProvider().addService(ip);	
		        						Admin.getAdmin().addProvider(et);			        						 
		        						 
		        					 }		        						        							        					        	
	        					 }
	        				    
	        					 else if(admininput1==2)
	        					 {
	        						 System.out.println("do you want add discount to mobile Recharge Service write 1 for yes and 2 for no");
	        						 option=myObj.nextInt();
	        						 if(option==1)
	        						 {
	        							 System.out.println("1-SpecificDiscount");
		        						 System.out.println("2-OverAllDiscount");
		        						 System.out.println("choose number of discount");
		        						 discount=myObj.nextInt();
		        						 if(discount==1)
		        						 {
		        							 System.out.println("enter discount precentage Ex(0.2)");
		        							 disval=myObj.nextDouble();
		        							 Admin.getAdmin().setspecificdiscount(disval);
		        							mr=new SpecificDiscount(mr,Admin.getAdmin().getdicount());		        	
		        						 }
		        						 else {
		        							 System.out.println("enter discount precentage Ex(0.2)");
		        							 disval=myObj.nextDouble();
		        							 Admin.getAdmin().setoveralldiscount(disval);
		        							mr=new OverAllDiscount(mr,Admin.getAdmin().getdicount());
		        						 }	
	        						 }	        						 
	        						 
	        						 System.out.println("do you want add discount to Internet Payment services choose 1 for yes or 2 for no");
	        						 option=myObj.nextInt();
	        						 if(option==1)
	        						 {
	        							 System.out.println("1-SpecificDiscount");
		        						 System.out.println("2-OverAllDiscount");
		        						 System.out.println("choose number of discount");
		        						 discount=myObj.nextInt();
		        						 if(discount==1)
		        						 {
		        							 System.out.println("enter discount precentage Ex(0.2)");
		        							 disval=myObj.nextDouble();
		        							 Admin.getAdmin().setspecificdiscount(disval);
		        							ip=new SpecificDiscount(ip,Admin.getAdmin().getdicount());		        	
		        						 }
		        						 else {
		        							 System.out.println("enter discount precentage Ex(0.2)");
		        							 disval=myObj.nextDouble();
		        							 Admin.getAdmin().setoveralldiscount(disval);
		        							ip=new OverAllDiscount(ip,Admin.getAdmin().getdicount());
		        						 }
		        						 System.out.println("do you want add discount to Landline Quarter receipt choose 1 for yes or 2 for no");
		        						 option=myObj.nextInt();
		        						 if(option==1)
		        						 {
		        							 System.out.println("1-SpecificDiscount");
			        						 System.out.println("2-OverAllDiscount");
			        						 System.out.println("choose number of discount");
			        						 discount=myObj.nextInt();
			        						 if(discount==1)
			        						 {
			        							 System.out.println("enter discount precentage Ex(0.2)");
			        							 disval=myObj.nextDouble();
			        							 Admin.getAdmin().setspecificdiscount(disval);
			        							qr=new SpecificDiscount(qr,Admin.getAdmin().getdicount());		        	
			        						 }
			        						 else {
			        							 System.out.println("enter discount precentage Ex(0.2)");
			        							 disval=myObj.nextDouble();
			        							 Admin.getAdmin().setoveralldiscount(disval);
			        							qr=new OverAllDiscount(qr,Admin.getAdmin().getdicount());
			        						 }
		        						 }
			        						 System.out.println("do you want add discount to Landline month receipt choose 1 for yes or 2 for no");
			        						 option=myObj.nextInt();
			        						 if(option==1)
			        						 {
			        							 System.out.println("1-SpecificDiscount");
				        						 System.out.println("2-OverAllDiscount");
				        						 System.out.println("choose number of discount");
				        						 discount=myObj.nextInt();
				        						 if(discount==1)
				        						 {
				        							 System.out.println("enter discount precentage Ex(0.2)");
				        							 disval=myObj.nextDouble();
				        							 Admin.getAdmin().setspecificdiscount(disval);
				        							more=new SpecificDiscount(more,Admin.getAdmin().getdicount());		        	
				        						 }
				        						 else {
				        							 System.out.println("enter discount precentage Ex(0.2)");
				        							 disval=myObj.nextDouble();
				        							 Admin.getAdmin().setoveralldiscount(disval);
				        							more=new OverAllDiscount(more,Admin.getAdmin().getdicount());
				        						 }		   
	        		 
	        						 }	
	        						 }
	     
	        					 }
	        					 else if(admininput1==3)
	        					 {
	        						 DB.print();
	        						 Request r=new Request();
	        						 r.setrefundCustomer(c);
	        						 RequestActionCommand rac=new ActionAccept(r);
	        						 RequestActionCommand rac2=new ActionDecline(r);
	        						 RefundMenu rm=new RefundMenu(rac,rac2);
	        						 Admin.getAdmin().setRefundMenu(rm);
	        						 System.out.println("choose 1 for accept or 2 for decline");
	        						 refund=myObj.nextInt();
	        						 if(refund==1)
	        						 {
	        							 Admin.getAdmin().acceptrefund();
	        						 }
	        						 else if(refund==2)
	        						 {
	        							 Admin.getAdmin().declinerefund();
	        						 }	        						         						 
	        					 }	        				
	        		
	        				 }while(admininput1!=4);
	        				 
	        			// }
	        		 
	        		 }
    	}while(admininput1!=4);
   		}
   		//for customer;
   		
   		else if(input==2)
   		{
   			int cust,option,provid,pay,ser;

   			System.out.println("1-Sign Up ");
   		 System.out.println("2-Sign In ");
   		 System.out.println("3-Exit ");
   		 System.out.println("Choose your option");
   		 cust=myObj.nextInt();
   		if(cust==1) {
			 System.out.println("User Name: ");
			 userName=myObj.next();
			 System.out.println("Password: ");
			 password=myObj.next();
			 System.out.println("Email: ");
			 email=myObj.next();
			 Account a=new Account();
			 a.addAccount(userName, password, email);
			 SignUp s=new SignUp(a,DB);
		     //s.signUp(a);		     
		 }
		  else if(cust==2) {
//			 System.out.println("User Name: ");
//			 userName=myObj.next();
//			 System.out.println("Password: ");
//			 password=myObj.next();
//			 Signin sin=new Signin(DB);
//			 sin.signin(userName, password);
			  
			  
			 System.out.println("Choose Provider");
			 System.out.println("1- Vodafone");
			 System.out.println("2-We");
			 System.out.println("3-Orange");
			 System.out.println("4-Etisalat");
			 provid=myObj.nextInt();
			 if(provid==1)
			 {
				 c.chooseProvider(vo);				
				 
			 }
			 else if(provid==2)
			 {
				 c.chooseProvider(we);
				 
			 }else if(provid==3)
			 {
				 c.chooseProvider(or);
			 }
			 else if(provid==4)
			 {
				 c.chooseProvider(et);
			 }		        	
			 
			 do {
				 Payment pw=new Wallet();
				fundswallet=pw;
				Payment pc=new CreditCard();
			   Payment pcsh=new Cashe();
				 System.out.println("1-Search for A Service");
 				 System.out.println("2-Choose Service");
 				 System.out.println("3-Ask for Refund");
 				 System.out.println("4-Check Discount");
 				 System.out.println("5-Add Funds to Wallet");
 				 System.out.println("6-Exit");
 				 System.out.println("Choose your option:");
 				 option = myObj.nextInt();
 				 if(option==1)
 				 {
 					String serviceName;
					 System.out.println("Enter Service Name:");
					 serviceName=myObj.next();
					 System.out.println(c.searchService(serviceName).getsername());					 
 				 }
 				 else if(option==2)
 				 {
 					System.out.println("1-Mobile recharge services.");
 	 			     System.out.println("2-Internet Payment services.");
 	 				 System.out.println("3-Landline services");
 	 				 System.out.println("4-Donations"); 
 					 
 					 ser=myObj.nextInt();
 					 if(ser==1) {
 					if(provid==1)
 					 {
 						String sin;
 						double am;
 						for(String s: vo.creatProvider().fields)
 						{
 							 System.out.println("Enter:" + s);
 							 sin=myObj.next();
 							vo.creatProvider().inputfields.add(sin);
 						}
 						 System.out.println("Enter your amount: ");
 						 am=myObj.nextDouble();
 						 
 						vo.creatProvider().setForm(vo.creatProvider().inputfields, am);
 						vo.creatProvider().provideService(mr);
 						
 						 System.out.println("choose payment way");
 		 				 System.out.println("1-Cridet Card");
 		 				 System.out.println("2-Wallet");
 		 				 System.out.println("3-Cashe");
 		 				 pay=myObj.nextInt();
 		 				 if(pay==1)
 		 				 {
 		 					 c.pay(pc,mr.cost());
 		 					 
 		 				 }else if(pay==2)
 		 				 {
 		 					 c.pay(pw,mr.cost());		 
 		 					 
 		 				 }
 		 				 else
 		 				 {
 		 					 c.pay(pcsh,mr.cost());
 		 				 }	
 					 }
 					 else if(provid==2)
 					 {
 						String sin;
 						double am;
 						for(String s: we.creatProvider().fields)
 						{
 							 System.out.println("Enter:" + s);
 							 sin=myObj.next();
 							we.creatProvider().inputfields.add(sin);
 						}
 						 System.out.println("Enter your amount: ");
 						 am=myObj.nextDouble();
 						we.creatProvider().setForm(we.creatProvider().inputfields, am);
 						we.creatProvider().provideService(mr);
 						 System.out.println("choose payment way");
 		 				 System.out.println("1-Cridet Card");
 		 				 System.out.println("2-Wallet");
 		 				 System.out.println("3-Cashe");
 		 				 pay=myObj.nextInt();
 		 				 if(pay==1)
 		 				 {
 		 					 c.pay(pc,mr.cost());
 		 					 
 		 				 }else if(pay==2)
 		 				 {
 		 					 c.pay(pw,mr.cost());
 		 				 }
 		 				 else
 		 				 {
 		 					 c.pay(pcsh,mr.cost());
 		 				 }	
 						 
 					 }
 					 else if(provid==3)
 					 {
 						String sin;
 						double am;
 						for(String s: or.creatProvider().fields)
 						{
 							 System.out.println("Enter:" + s);
 							 sin=myObj.next();
 							or.creatProvider().inputfields.add(sin);
 						}
 						 System.out.println("Enter your amount: ");
 						 am=myObj.nextDouble();
 						or.creatProvider().setForm(or.creatProvider().inputfields, am);
 						or.creatProvider().provideService(mr);
 						 System.out.println("choose payment way");
 		 				 System.out.println("1-Cridet Card");
 		 				 System.out.println("2-Wallet");
 		 				 System.out.println("3-Cashe");
 		 				 pay=myObj.nextInt();
 		 				 if(pay==1)
 		 				 {
 		 					 c.pay(pc,mr.cost());
 		 					 
 		 				 }else if(pay==2)
 		 				 {
 		 					 c.pay(pw,mr.cost());
 		 				 }
 		 				 else
 		 				 {
 		 					 c.pay(pcsh,mr.cost());
 		 				 }	 
 					 }
 					 else if(provid==4)
 					 {
 						String sin;
 						double am;
 						for(String s: et.creatProvider().fields)
 						{
 							 System.out.println("Enter:" + s);
 							 sin=myObj.next();
 							et.creatProvider().inputfields.add(sin);
 						}
 						 System.out.println("Enter your amount: ");
 						 am=myObj.nextDouble();
 						et.creatProvider().setForm(et.creatProvider().inputfields, am);
 						et.creatProvider().provideService(mr);
 						 System.out.println("choose payment way");
 		 				 System.out.println("1-Cridet Card");
 		 				 System.out.println("2-Wallet");
 		 				 System.out.println("3-Cashe");
 		 				 pay=myObj.nextInt();
 		 				 if(pay==1)
 		 				 {
 		 					 c.pay(pc,mr.cost());
 		 					 
 		 				 }else if(pay==2)
 		 				 {
 		 					 c.pay(pw,mr.cost());
 		 				 }
 		 				 else
 		 				 {
 		 					 c.pay(pcsh,mr.cost());
 		 				 }	 
 					 }	
 			 	}
 					 else if(ser==2)
 					 {
 						if(provid==1)
 	 					 {
 	 						String sin;
 	 						double am;
 	 						for(String s: vo.creatProvider().fields)
 	 						{
 	 							 System.out.println("Enter:" + s);
 	 							 sin=myObj.next();
 	 							vo.creatProvider().inputfields.add(sin);
 	 						}
 	 						 System.out.println("Enter your amount: ");
 	 						 am=myObj.nextDouble();
 	 						 
 	 						vo.creatProvider().setForm(vo.creatProvider().inputfields, am);
 	 						vo.creatProvider().provideService(ip);
 	 						
 	 						 System.out.println("choose payment way");
 	 		 				 System.out.println("1-Cridet Card");
 	 		 				 System.out.println("2-Wallet");
 	 		 				 System.out.println("3-Cashe");
 	 		 				 pay=myObj.nextInt();
 	 		 				 if(pay==1)
 	 		 				 {
 	 		 					 c.pay(pc,ip.cost());
 	 		 					 
 	 		 				 }else if(pay==2)
 	 		 				 {
 	 		 					 c.pay(pw,ip.cost());		 
 	 		 					 
 	 		 				 }
 	 		 				 else
 	 		 				 {
 	 		 					 c.pay(pcsh,ip.cost());
 	 		 				 }	
 	 					 }
 	 					 else if(provid==2)
 	 					 {
 	 						String sin;
 	 						double am;
 	 						for(String s: we.creatProvider().fields)
 	 						{
 	 							 System.out.println("Enter:" + s);
 	 							 sin=myObj.next();
 	 							we.creatProvider().inputfields.add(sin);
 	 						}
 	 						 System.out.println("Enter your amount: ");
 	 						 am=myObj.nextDouble();
 	 						we.creatProvider().setForm(we.creatProvider().inputfields, am);
 	 						we.creatProvider().provideService(ip);
 	 						 System.out.println("choose payment way");
 	 		 				 System.out.println("1-Cridet Card");
 	 		 				 System.out.println("2-Wallet");
 	 		 				 System.out.println("3-Cashe");
 	 		 				 pay=myObj.nextInt();
 	 		 				 if(pay==1)
 	 		 				 {
 	 		 					 c.pay(pc,ip.cost());
 	 		 					 
 	 		 				 }else if(pay==2)
 	 		 				 {
 	 		 					 c.pay(pw,ip.cost());
 	 		 				 }
 	 		 				 else
 	 		 				 {
 	 		 					 c.pay(pcsh,ip.cost());
 	 		 				 }	
 	 						 
 	 					 }
 	 					 else if(provid==3)
 	 					 {
 	 						String sin;
 	 						double am;
 	 						for(String s: or.creatProvider().fields)
 	 						{
 	 							 System.out.println("Enter:" + s);
 	 							 sin=myObj.next();
 	 							or.creatProvider().inputfields.add(sin);
 	 						}
 	 						 System.out.println("Enter your amount: ");
 	 						 am=myObj.nextDouble();
 	 						or.creatProvider().setForm(or.creatProvider().inputfields, am);
 	 						or.creatProvider().provideService(ip);
 	 						 System.out.println("choose payment way");
 	 		 				 System.out.println("1-Cridet Card");
 	 		 				 System.out.println("2-Wallet");
 	 		 				 System.out.println("3-Cashe");
 	 		 				 pay=myObj.nextInt();
 	 		 				 if(pay==1)
 	 		 				 {
 	 		 					 c.pay(pc,ip.cost());
 	 		 					 
 	 		 				 }else if(pay==2)
 	 		 				 {
 	 		 					 c.pay(pw,ip.cost());
 	 		 				 }
 	 		 				 else
 	 		 				 {
 	 		 					 c.pay(pcsh,ip.cost());
 	 		 				 }	 
 	 					 }
 	 					 else if(provid==4)
 	 					 {
 	 						String sin;
 	 						double am;
 	 						for(String s: et.creatProvider().fields)
 	 						{
 	 							 System.out.println("Enter:" + s);
 	 							 sin=myObj.next();
 	 							et.creatProvider().inputfields.add(sin);
 	 						}
 	 						 System.out.println("Enter your amount: ");
 	 						 am=myObj.nextDouble();
 	 						et.creatProvider().setForm(et.creatProvider().inputfields, am);
 	 						et.creatProvider().provideService(ip);
 	 						 System.out.println("choose payment way");
 	 		 				 System.out.println("1-Cridet Card");
 	 		 				 System.out.println("2-Wallet");
 	 		 				 System.out.println("3-Cashe");
 	 		 				 pay=myObj.nextInt();
 	 		 				 if(pay==1)
 	 		 				 {
 	 		 					 c.pay(pc,ip.cost());
 	 		 					 
 	 		 				 }else if(pay==2)
 	 		 				 {
 	 		 					 c.pay(pw,ip.cost());
 	 		 				 }
 	 		 				 else
 	 		 				 {
 	 		 					 c.pay(pcsh,ip.cost());
 	 		 				 }	 
 	 					 }	
 						 
 					 }
 					 else if(ser==3)
 					 {
 						System.out.println("1-Monthly receipt");
		 				 System.out.println("2-Quarter receipt");
 						 int m=myObj.nextInt();
 						 if(m==1) {
 							 
 							String sin;
	 						double am;
	 						for(String s: we.creatProvider().fields)
	 						{
	 							 System.out.println("Enter:" + s);
	 							 sin=myObj.next();
	 							we.creatProvider().inputfields.add(sin);
	 						}
	 						 System.out.println("Enter your amount: ");
	 						 am=myObj.nextDouble();
	 						we.creatProvider().setForm(we.creatProvider().inputfields, am);
	 						we.creatProvider().provideService(more);
	 						 System.out.println("choose payment way");
	 		 				 System.out.println("1-Cridet Card");
	 		 				 System.out.println("2-Wallet");
	 		 				 System.out.println("3-Cashe");
	 		 				 pay=myObj.nextInt();
	 		 				 if(pay==1)
	 		 				 {
	 		 					 c.pay(pc,more.cost());
	 		 					 
	 		 				 }else if(pay==2)
	 		 				 {
	 		 					 c.pay(pw,more.cost());
	 		 				 }
	 		 				 else
	 		 				 {
	 		 					 c.pay(pcsh,more.cost());
	 		 				 }	
 						 }
 						 else {
 							String sin;
	 						double am;
	 						for(String s: we.creatProvider().fields)
	 						{
	 							 System.out.println("Enter:" + s);
	 							 sin=myObj.next();
	 							we.creatProvider().inputfields.add(sin);
	 						}
	 						 System.out.println("Enter your amount: ");
	 						 am=myObj.nextDouble();
	 						we.creatProvider().setForm(we.creatProvider().inputfields, am);
	 						we.creatProvider().provideService(qr);
	 						 System.out.println("choose payment way");
	 		 				 System.out.println("1-Cridet Card");
	 		 				 System.out.println("2-Wallet");
	 		 				 System.out.println("3-Cashe");
	 		 				 pay=myObj.nextInt();
	 		 				 if(pay==1)
	 		 				 {
	 		 					 c.pay(pc,qr.cost());
	 		 					 
	 		 				 }else if(pay==2)
	 		 				 {
	 		 					 c.pay(pw,qr.cost());
	 		 				 }
	 		 				 else
	 		 				 {
	 		 					 c.pay(pcsh,qr.cost());
	 		 				 }	
 						 }
 						
	 						 
 					 }
 					 else {
 						System.out.println("enter amount: ");
 						double n=myObj.nextDouble();
 						System.out.println("enter your destination");
 						String mn=myObj.next();
 						 System.out.println("choose payment way");
 		 				 System.out.println("1-Cridet Card");
 		 				 System.out.println("2-Wallet");
 		 				 System.out.println("3-Cashe");
 		 				 pay=myObj.nextInt();
 		 				 if(pay==1)
 		 				 {
 		 					 c.pay(pc,n);
 		 					 
 		 				 }else if(pay==2)
 		 				 {
 		 					 c.pay(pw,n);
 		 				 }
 		 				 else
 		 				 {
 		 					 c.pay(pcsh,n);
 		 				 }	
 						 
 					 }
 				 }
 				 else if(option==3)
 				 {
 					 BaseCommand bc=new AskforRefund();
 					 c.setCommand(bc);
 					System.out.println("enter id for your transactions ");
 					int in=myObj.nextInt();
 					 c.refundRequest(in);		 
 				 }
 				else if(option==4) {
 					System.out.println("Discount is:"+ c.checkDiscount());
 					
 				}
 				else if(option==5)
 				{
 					System.out.println("enter amount of money ");
 					int in=myObj.nextInt();
 					fundswallet.addfunds(in);			
 				}

			 }while(option!=6);
			 
   	}
   		}
   		
    	}while(input!=3);
        
   		}
    			  
    	} 

			  
			  
			
    

