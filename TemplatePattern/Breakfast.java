
public abstract class Breakfast {
	 final void prepareRecipe() {
		crackEggs(1);
		prepare();
		cook();
		if (wantsCondiments()) {
			addCondiments();
		}
		serve();
	}
	
	abstract void addCondiments();

	abstract void prepare();
	
	abstract void cook();

	void crackEggs(int num) {
		System.out.println("\nCracking " + num + " eggs.");
	}
	
	void serve() {
		System.out.println("Placing the eggs on a plate.");
	}
	
	boolean wantsCondiments() {
		return true;
	}
	
}
