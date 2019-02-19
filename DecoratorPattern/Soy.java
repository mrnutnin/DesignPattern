
public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.description = "Soy";
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + this.description;
	}

	@Override
	public double cost() {
		return 7 + beverage.cost();
	}
}
