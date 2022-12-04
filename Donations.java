
public class Donations extends Service {
	public Donations () {
		this.description="Donations";
	}
	
	public double cost() {
		
		return this.cost;
	}

	@Override
	public void setCost(double cost) {
		super.cost=cost;
		
	}
    
	public String getsername() {
		return this.description;
	}

	@Override
	public void getDiscountValue() {
		
		Service.finalDiscount+=0;
	}

}
