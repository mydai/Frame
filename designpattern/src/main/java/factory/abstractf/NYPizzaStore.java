package factory.abstractf;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("纽约风格的起司披萨");
		}
		return pizza;
	}

}
