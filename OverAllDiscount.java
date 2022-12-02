

public class OverAllDiscount extends DiscountDecorator {
	Service service;
	public OverAllDiscount(Service service,double d){
		this.service= service;
		this.discount=d;
	}
	
	public double cost() {
		
		return service.cost -(service.cost*discount);
	}

	@Override
	public void setCost(double cost) {
		service.cost=cost;
		
	}

}
