
public class PizzaCheese extends Pizza {

	PizzaIngredientStyle ingredientStyle;
	
	public PizzaCheese(PizzaIngredientStyle ingredientStyle) {
	this.ingredientStyle = ingredientStyle;
	name = "PizzaCheese";
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientStyle.createDough();
		sauce = ingredientStyle.createSauce();
		cheese = ingredientStyle.createCheese();
	}

}
