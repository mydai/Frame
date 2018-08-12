package adapter;

//ÊÊÅäÆ÷Ä£Ê½²âÊÔ´úÂë
public class AdapterTest {

	public static void main(String[] args) {
		MallarDuck mallarDuck = new MallarDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("The Duck says...");
		testDuck(mallarDuck);
		System.out.println("The TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}
