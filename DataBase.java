
import java.util.ArrayList;

public class DataBase {
    protected ArrayList<Account> accounts;
    private static DataBase database=null;
    private DataBase()
    {
        this.accounts = new ArrayList<Account>();
        
    }
    public static DataBase getdb()
    {
    	if(database==null)
    		database=new DataBase();
    	return database;
    }
    
    
}