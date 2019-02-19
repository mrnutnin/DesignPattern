
public abstract class Duck {
	
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public void performQuack() {
		this.quackBehavior.quack();
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("I can swim.");
	}
	
	public abstract void display();

	
	/*
	public void fly() {
		System.out.println("I can fly.");
	}
	
	public void quack() {
		System.out.println("quack quack");
	}
	*/
	
}
