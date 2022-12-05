

public class Signin{
//  private String user_name;
//  private String password;
private Account account;
  private boolean flag=false;
  private DataBase arr=DataBase.getdb();
  public Signin(DataBase c)
  {
      //this.account=a;
      this.arr=c;


  }
  public void signin(String name,String pass)
  {
      if(!validate_date(name,pass))
          System.out.println("welcome");
      else
          System.out.println("Sorry, you entered invalid data");
  }

  public boolean validate_date(String name,String pass)
  {
      

      
      for(Account a:arr.accounts) {
    	  if(a.getUser_name()==name && a.getPassword()==pass)//&& && a.getPassword()==pass   
    		  this.flag=true;
      }
      return  this.flag;
  }


}