
public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.description = "Mocha";
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + this.description;
	}

	@Override
	public double cost() {
		return 10 + beverage.cost();
	}
}
