package myproject;

public class mobileRechargeService extends Service {
	
	
	public double cost() {
		
		return this.cost;
	}

	@Override
	public void setCost(double cost) {
		super.cost=cost;
		
	}

}
