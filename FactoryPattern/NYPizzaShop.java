
public class NYPizzaShop extends PizzaShop {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		NYPizzaIngredientStyle NYIngredientStyle = new NYPizzaIngredientStyle();
		
		if (type.equals("Cheese")) {
			pizza = new PizzaCheese(NYIngredientStyle);
		} 
		return pizza;
	}

}
