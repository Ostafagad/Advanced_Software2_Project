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
	        		 System.out.println("3-Exit ");
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
	        			 if(usernameIn==DB.getAdminName() && usernameIn==DB.getAdminPassword()) {
	        				 
//	        				 do {
//	        					 System.out.println("1- Add Provider");
//	        					 System.out.println("2-Add Discount");
//	        					 System.out.println("3-Exit");
//	        					 System.out.println("Choose your Option");
//	        					 admininput2=myObj.nextInt();
//	        					 if(admininput2==1) {
//	        						 
//	        					 }
//	        					 
//	        				 }while(admininput2!=3);
	        				 
	        			 }
	        		 
	        		 }
    	}while(admininput1!=3);
   		}
    	}while(input!=3);
        
   		}
    			  
    	} 
			  
			  
			
    

