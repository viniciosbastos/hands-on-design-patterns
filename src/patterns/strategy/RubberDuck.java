package patterns.strategy;

public class RubberDuck extends Duck {

	protected RubberDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	@Override
	public void display() {
		System.out.println("I am a Rubber Duck!");
	}	

}
