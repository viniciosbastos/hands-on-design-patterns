package patterns.strategy;

public class RedheadDuck extends Duck {

	protected RedheadDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	@Override
	public void display() {
		System.out.println("I am a Redhead Duck!");
	}

}
