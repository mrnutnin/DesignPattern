
public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quacks that make no sound at all.");
	}

}
