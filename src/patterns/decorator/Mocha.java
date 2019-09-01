package patterns.decorator;

public class Mocha extends BeverageDecorator{

	public Mocha(Beverage beverage) {
		this.description = "Mocha";
		this.decorated = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.decorated.getDescription() + ", " + this.description; 
	}

	@Override
	public Float cost() {
		return this.decorated.cost() + 0.2F;
	}

}
