package patterns.decorator;

public class Milk extends BeverageDecorator{
	
	public Milk(Beverage beverage) {
		this.description = "Milk";
		this.decorated = beverage;
	}
	

	@Override
	public String getDescription() {
		return this.decorated.getDescription() + ", " + this.description;
	}

	@Override
	public Float cost() {
		return this.decorated.cost() + 0.1F;
	}

}
