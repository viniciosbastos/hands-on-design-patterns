package patterns.factory;

public class ChicagoPizzaStore extends PizzaStore{

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch(type) {
		case "cheese":
			pizza = new ChicagoCheesePizza();
			break;
		case "pepperoni":
			pizza = new ChicagoPepperoniPizza();
			break;
		}
		return pizza;
	}

}
