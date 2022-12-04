public class mobileRechargeService extends Service {
	
	public mobileRechargeService () {
		super.description="Mobile Recharge Service";
	}
	
	public double cost() {
		
		return this.cost;
	}

	@Override
	public void setCost(double cost) {
		super.cost=cost;
		
	}
    
	public String getsername() {
		return super.description;
	}
	
}
