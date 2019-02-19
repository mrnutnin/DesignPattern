
public class NYPizzaIngredientStyle implements PizzaIngredientStyle {
		
		@Override
		public Dough createDough() {
			return new ThinCrustDough();
		}
		
		@Override
		public Sauce createSauce() {
			return new MarinaraSauce();
		}
		@Override
		public Cheese createCheese() {
			return new ReggianoCheese();
		}

}
