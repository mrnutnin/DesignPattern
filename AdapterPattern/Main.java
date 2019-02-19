import java.util.List;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new MallardDuck());
		ducks.add(new RedheadDuck());
		ducks.add(new MallardDuck());
		ducks.add(new RubberDuck());
		ducks.add(new DecoyDuck());
		
		for(int i=0;i<ducks.size();i++) {
			ducks.get(i).display();
			ducks.get(i).performFly();
			ducks.get(i).performQuack();
			
			//ducks.get(i).quack();
			//ducks.get(i).fly();
			System.out.println("-----------");
		}

	}

}
