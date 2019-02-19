
public class Main {

	public static void main(String[] args) {
		
		PizzaShop pz;
		Pizza p;
		
		pz= new NYPizzaShop();
		p = pz.orderPizza("Cheese");
		System.out.println(p.getName());
		
		pz = new ChicagoPizzaShop();
		p = pz.orderPizza("Cheese");
		System.out.println(p.getName());
		
	}

}
