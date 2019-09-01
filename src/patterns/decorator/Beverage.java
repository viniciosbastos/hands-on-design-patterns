package patterns.decorator;

public abstract class Beverage {

	protected String description;
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract Float cost();
}
