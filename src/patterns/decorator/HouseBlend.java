package patterns.decorator;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		this.description = "HouseBlend";
	}

	@Override
	public Float cost() {
		return .89F;
	}

}
