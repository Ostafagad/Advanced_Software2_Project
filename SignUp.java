

public class SignUp {
//  private String user_name;
//  private String password;
//  private  String email;

  private Account account;
  private DataBase arr=DataBase.getdb();
  private boolean flag=false;
  public SignUp(Account a,DataBase c)
  {
      //this.account=a;
      this.arr=c;
      if(!checkSignup(a)) {
    	  //this.arr.accounts.add(a);
    	  this.arr.accounts.add(a);

    	  System.out.println("Account has been created Successfully.Now you can Sign In.");
         
      }
      else
          System.out.println("This account already exits.");
      
  }
//  public void signUp(Account a)
//  {
//      if(checkSignup(a)) {
//    	  //this.arr.accounts.add(a);
//    	  System.out.println("Account has been created Successfully.Now you can Sign In.");
//
//      }
//          
//      else
//          System.out.println("This account already exits.");
//
//
//  }
      public boolean checkSignup(Account c)
  {
      
//      for (int i=0;i<arr.accounts.size();i++)
//      {
//          if(c.getUser_name()==arr.accounts.get(i).getUser_name() &&c.getPassword()==arr.accounts.get(i).getPassword() &&c.getEmail()==arr.accounts.get(i).getEmail()) {
//              this.flag = false;
//          }
//      }
    	  
    	  for(Account a:this.arr.accounts) {
        	  if(a.getUser_name()==c.getUser_name() && a.getPassword()==c.getPassword() && a.getEmail()==c.getEmail())//&& && a.getPassword()==pass   
        		  this.flag=true;
          }
      return  this.flag;
  }


}
