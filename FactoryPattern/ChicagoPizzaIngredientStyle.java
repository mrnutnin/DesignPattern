
public class ChicagoPizzaIngredientStyle implements PizzaIngredientStyle {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}
	
	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

}
