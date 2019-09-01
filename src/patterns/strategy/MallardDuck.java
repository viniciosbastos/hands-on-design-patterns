package patterns.strategy;

public class MallardDuck extends Duck {

	protected MallardDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	@Override
	public void display() {
		System.out.println("I am a Mallard Duck!");
	}

}
