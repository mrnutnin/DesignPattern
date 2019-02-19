
public class Whip extends CondimentDecorator {
	
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.description = "Whip";
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + this.description;
	}

	@Override
	public double cost() {
		return 15 + beverage.cost();
	}

}
