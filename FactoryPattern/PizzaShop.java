
public abstract class PizzaShop {
	
	Pizza orderPizza(String type) {
		Pizza pizza = null;
		
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);

}
