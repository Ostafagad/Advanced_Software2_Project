package myproject;

public class OverAllDiscount extends DiscountDecorator {
	Service service;
	public OverAllDiscount(Service service){
		this.service= service;
		this.discount=(10/100);
	}
	
	public double cost() {
		
		return service.cost*discount;
	}

	@Override
	public void setCost(double cost) {
		service.cost*=discount;
		
	}

}
