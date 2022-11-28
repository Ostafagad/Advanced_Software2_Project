package com.company;

public class SignUp {
    private String user_name;
    private String password;
    private  String email;
    public SignUp()
    {

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
