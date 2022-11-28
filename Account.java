package com.company;

public class Account {
    private String user_name;
    private String password;
    private String email;
   public SignUp signUp;

//
    public Account(SignUp s)
    {
        this.user_name=s.getUser_name();
        this.password=s.getPassword();
        this.email=s.getEmail();
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public void setPassword(String password) {
        password = password;
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
