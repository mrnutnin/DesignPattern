
public class RubberDuck extends Duck implements Quackable{
	
	public RubberDuck() {
		this.quackBehavior = new Squack();
		this.flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am a RubberDuck.");
	}
	
	@Override
	public void quack() {
		System.out.println("pip pip");
	}
	
	

}
