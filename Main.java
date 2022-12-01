package Advanced_Software2_Project;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DataBase c=new DataBase();
        Account a=new Account();
        SignUp s=new SignUp(a,c);
        Signin sin=new Signin(a,c);
        a.addAccount("mena","1234","addsd");
        s.signUp(a);
        Account b=new Account();
        b.addAccount("alaa","1s4","agdssd");
        s.signUp(b);
        Account n=new Account();
        n.addAccount("alaa","1s4","agdssd");
        s.signUp(n);
        sin.signin("alaa","hkk");



    }
}
