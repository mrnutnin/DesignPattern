import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScrambledEggs  extends Breakfast {
	
	@Override
	public void prepare() {
		System.out.println("Stirring and adding milk to the eggs.");
	}

	@Override
	public void cook() {
		System.out.println("Scrambling the eggs.");
	}

	@Override
	void addCondiments() {
		System.out.println("Spreading salt and paper.");	
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
