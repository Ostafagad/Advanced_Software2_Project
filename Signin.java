
public class Signin {
	private String user_name;
    private String password;

    public Signin()
    {

    }
    public Signin(String name,String pass)
    {
        this.password=pass;
        this.user_name=name;
    }

    public void validate_date(String name,String pass)
    {
        // should validate user data from data base
    }
   
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }
}



