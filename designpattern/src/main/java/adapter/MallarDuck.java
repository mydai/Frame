package adapter;

//具体鸭子子类
public class MallarDuck implements Duck{
	
	@Override
	public void quack() {
		System.out.println("我是一只鸭子，我正在叫");
	}

	@Override
	public void fly() {
		System.out.println("我是一只鸭子，我正在飞");
	}

}
