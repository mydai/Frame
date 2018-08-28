package factory.abstractf;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	void prepare() {
        System.out.println("准备做起司披萨");
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        bake();
        cut();
        box();
	}

}
