
public class EatBreakfast {
	public static void main(String[] args) {
		/*Not hook*/
		/*
		ScrambledEggs scrambled = new ScrambledEggs();
		scrambled.crackEggs(2);
		scrambled.prepare();
		scrambled.cook();
		scrambled.serve();
		
		Omelette omelette = new Omelette();
		omelette.crackEggs(3);
		omelette.prepare();
		omelette.cook();
		omelette.serve();
		
		SunnySide sunny = new SunnySide();
		sunny.crackEggs(1);
		sunny.prepare();
		sunny.cook();
		sunny.serve();
		*/
		
		/*With Hook*/
		ScrambledEggs scrambledHook = new ScrambledEggs();
		scrambledHook.prepareRecipe();
		
		Omelette omeletteHook = new Omelette();
		omeletteHook.prepareRecipe();
		
		SunnySide sunnyHook = new SunnySide();
		sunnyHook.prepareRecipe();
	}

}
