

public class OverAllDiscount extends DiscountDecorator {
	Service service;
	public OverAllDiscount(Service service){
		this.service= service;
		this.discount=0.1;
	}
	
	public double cost() {
		
		return service.cost -(service.cost*discount);
	}

	@Override
	public void setCost(double cost) {
		service.cost=cost;
		
	}

}
