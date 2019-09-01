package patterns.decorator;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		this.description = "DarkRoast";
	}
	@Override
	public Float cost() {
		return .99F;
	}
}
