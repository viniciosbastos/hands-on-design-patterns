package patterns.strategy;

public class Main {

	public static void main(String[] args) {
		Duck duck = new MallardDuck(new NoFlyBehavior(), new QuackBehavior());
		duck.fly();
		duck.quack();
	}
}
