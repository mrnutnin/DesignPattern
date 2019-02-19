
public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a MallrdDuck.");
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
