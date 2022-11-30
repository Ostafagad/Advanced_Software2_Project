
public class Customer {
	//public Account Acc;
	   private String user_name;
	    private String password;
	    private String email;
	    
	  public Customer()
	  {
	      
	     
	      
	  }
	  public Customer(String username,String pass,String email)
	  {
	      user_name=username;
	      
	      password=pass;
	      this.email=email;
	      
	  }
	  public void setEmail(String email) {
	        this.email = email;

	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void setUser_name(String user_name) {
	        this.user_name = user_name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getUser_name() {
	        return user_name;
	    }


	
}
