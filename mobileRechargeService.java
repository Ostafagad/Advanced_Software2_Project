public class mobileRechargeService extends Service {
	
	public mobileRechargeService () {
		super.sername="Mobile Recharge Service";
	}
	
	public double cost() {
		
		return this.cost;
	}

	@Override
	public void setCost(double cost) {
		super.cost=cost;
		
	}

}
