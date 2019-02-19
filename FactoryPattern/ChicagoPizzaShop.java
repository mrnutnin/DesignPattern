
public class ChicagoPizzaShop extends PizzaShop {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		ChicagoPizzaIngredientStyle ChicagoIngredientStyle = new ChicagoPizzaIngredientStyle();
		
		if (type.equals("Cheese")) {
			pizza = new PizzaCheese(ChicagoIngredientStyle);
		} 
		return pizza;
	}
}
