

public class Signin{
//  private String user_name;
//  private String password;
private Account account;
  private DataBase arr;
  public Signin(Account a,DataBase c)
  {
      this.account=a;
      this.arr=c;


  }
  public void signin(String name,String pass)
  {
      if(validate_date(name,pass))
          System.out.println("welcome");
      else
          System.out.println("Sorry, you entered invalid data");
  }

  public boolean validate_date(String name,String pass)
  {
      boolean flag=false;
      for (int i=0;i<arr.accounts.size();i++)
      {
          if(name==arr.accounts.get(i).getUser_name() &&pass==arr.accounts.get(i).getPassword() ) {
              flag = true;

          }
      }
      return  flag;
  }


}