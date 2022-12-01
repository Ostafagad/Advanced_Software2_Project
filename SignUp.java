package myproject;

public class SignUp {
//  private String user_name;
//  private String password;
//  private  String email;

  private Account account;
  private DataBase arr;
  public SignUp(Account a,DataBase c)
  {
      this.account=a;
      this.arr=c;


  }
  public void signUp(Account a)
  {
      if(checkSignup(a))
          this.arr.accounts.add(a);
      else
          System.out.println("these account already exits.");


  }
      public boolean checkSignup(Account c)
  {
      boolean flag=true;
      for (int i=0;i<arr.accounts.size();i++)
      {
          if(c.getUser_name()==arr.accounts.get(i).getUser_name() &&c.getPassword()==arr.accounts.get(i).getPassword() &&c.getEmail()==arr.accounts.get(i).getEmail()) {
              flag = false;
          }
      }
      return  flag;
  }


}
