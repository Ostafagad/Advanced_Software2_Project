public class Transaction {
    private int custid;
    private String sername; 
    private double amountpaid;
    public static int transid=0;
	public Transaction(int custid,String sername,double amountpaid) {
		Transaction.transid++;
		this.custid=custid;
		this.sername=sername;
		this.amountpaid=amountpaid;
	}
  
}
