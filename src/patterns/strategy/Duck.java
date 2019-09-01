package patterns.strategy;

public abstract class Duck {
	private IFlyBehavior flyBehavior;
	private IQuackBehavior quackBehavior;

	protected Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	
	public void fly() {
		this.flyBehavior.fly();
	}
	
	public void quack() {
		this.quackBehavior.quack();
	}
	
	public abstract void display();
	
}
