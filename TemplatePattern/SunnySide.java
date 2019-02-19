import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SunnySide extends Breakfast {
	
	@Override
	public void prepare() {
		System.out.println("Never stir sunny side up!");
	}
	
	@Override
	public void cook() {
		System.out.println("Cooking the eggs sunny side up.");
	}

	@Override
	void addCondiments() {
		System.out.println("Spreading salt and pepper.");	
	}

	public boolean wantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput() {
		String answer = null;
		System.out.print("Would you like salt and pepper with your breakfast (y/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
