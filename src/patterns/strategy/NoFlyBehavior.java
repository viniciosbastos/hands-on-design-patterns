package patterns.strategy;

public class NoFlyBehavior implements IFlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly.");
	}

}
