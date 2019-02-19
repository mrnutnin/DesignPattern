
public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a RedheadDuck.");
	}

	/*
	@Override
	public void quack() {
		System.out.println("quack quack");
		
	}

	@Override
	public void fly() {
		System.out.println("I can fly.");
	}
	*/

}
