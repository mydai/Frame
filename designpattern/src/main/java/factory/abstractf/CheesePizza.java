package factory.abstractf;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	void prepare() {
        System.out.println("׼������˾����");
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        bake();
        cut();
        box();
	}

}
