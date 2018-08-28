package factory.abstractf;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza cheesePizza = nyPizzaStore.createPizza("cheese");
		cheesePizza.prepare();
	}
}
