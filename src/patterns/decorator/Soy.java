package patterns.decorator;

public class Soy extends BeverageDecorator{
	
	public Soy(Beverage beverage) {
		this.description = "Soy";
		this.decorated = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.decorated.getDescription() + ", " + this.description;
	}

	@Override
	public Float cost() {
		return this.decorated.cost() + 0.15F;
	}

}
