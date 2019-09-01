package patterns.decorator;

public abstract class BeverageDecorator extends Beverage{
	protected Beverage decorated;
	public abstract String getDescription();
}
