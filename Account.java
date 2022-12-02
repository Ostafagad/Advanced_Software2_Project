


import java.util.ArrayList;

public class Account {
    private String user_name;
    private String password;
    private String email;

//
    public Account()
    {
    // this.accounts = new ArrayList<Account>();

    }
    public void addAccount(String name,String pass,String email)
    {
        this.user_name=name;
        this.email=email;
        this.password=pass;
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

