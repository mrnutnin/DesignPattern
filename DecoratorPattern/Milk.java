
public class Milk extends CondimentDecorator {

	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.description = "Milk";
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + this.description;
	}

	@Override
	public double cost() {
		return 5 + beverage.cost();
	}

}
