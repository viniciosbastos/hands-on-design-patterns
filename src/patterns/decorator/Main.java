package patterns.decorator;

public class Main {

	public static void main(String[] args) {
		Beverage beverage = new Milk(new Soy(new DarkRoast()));
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		
		Beverage beverage2 = new Mocha(new Mocha(new Milk(new Soy(new HouseBlend()))));
		System.out.println(beverage2.getDescription());
		System.out.println(beverage2.cost());
	}
}
