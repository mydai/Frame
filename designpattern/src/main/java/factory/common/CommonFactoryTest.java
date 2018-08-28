package factory.common;

public class CommonFactoryTest {

	public static void main(String[] args) {
		PizzaFactory nyFactory = new NYPizzaFactory();
		
		Pizza pizza = nyFactory.createPizza("veggie");
		pizza.prepare();
	}
}
