import java.util.ArrayList;

public class SignUp {
	 private String user_name;
	    private String password;
	    private  String email;
	    private ArrayList<Customer>customers;
	    public SignUp() {}
	    public void signUp(Customer obj)
	    {
	    	if(!checkSignup(obj)) {
	    		this.customers.add(obj);
	    	}
	    	else {
	    		System.out.println("Customer exisiting");
	    	}
	    }
	    
	    public boolean checkSignup(Customer c)
	    {
	        return (customers.contains(c)||customers.size()==0);
	    }
	    public Customer signIn(String name,String pass) {
    		Customer target=new Customer();
        for (int i=0;i<customers.size();i++)
        {
            if(name==customers.get(i).getUser_name() &&pass==customers.get(i).getPassword()) {
                
                target=customers.get(i);

            }
        }
        return target;
        
    }
	    public SignUp(String name,String pass,String email)
	    {
	        this.user_name=name;
	        this.password=pass;
	        this.email=email;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void setUser_name(String user_name) {
	        this.user_name = user_name;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getUser_name() {
	        return user_name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void send_to_database(String name, String pass, String email)
	    {
	        //should send customer data to data base
	    }
}
