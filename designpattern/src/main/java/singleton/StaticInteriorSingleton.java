package singleton;

//静态内部类实现的单例模式
public class StaticInteriorSingleton {

	private static class InnerInstance{
		private static final StaticInteriorSingleton instance = new StaticInteriorSingleton();
	}
	
	private StaticInteriorSingleton(){}
	
	public static StaticInteriorSingleton getInstance(){
		return InnerInstance.instance;
	}
}
