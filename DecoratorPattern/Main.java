
public class Main {

	public static void main(String[] args) {
		Beverage drink1 = new DarkRoast();
		drink1 = new Milk(drink1);
		drink1 = new Mocha(drink1);
		
		System.out.println(drink1.getDescription());
		System.out.println(drink1.cost());
		
		Beverage drink2 = new Espresso();
		drink2 = new Mocha(drink2);
		drink2 = new Mocha(drink2);
		drink2 = new Whip(drink2);
		
		System.out.println(drink2.getDescription());
		System.out.println(drink2.cost());
		
	}

}
