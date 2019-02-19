
public abstract class Beverage {
	protected String description;
	
	public Beverage() {
		this.description = "Beverage";
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
	

}
