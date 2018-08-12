package adapter;

//具体的火鸡子类
public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("我是火鸡，我正在叫");
	}

	@Override
	public void fly() {
		System.out.println("我是火鸡，我飞了稍短的一些距离");
	}

}
