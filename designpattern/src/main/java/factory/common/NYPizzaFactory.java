package factory.common;

public class NYPizzaFactory extends PizzaFactory {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new NYStyleVeggiePizza();
		}
		return null;
	}
}
