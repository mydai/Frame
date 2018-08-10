package singleton;

//��̬�ڲ���ʵ�ֵĵ���ģʽ
public class StaticInteriorSingleton {

	private static class InnerInstance{
		private static final StaticInteriorSingleton instance = new StaticInteriorSingleton();
	}
	
	private StaticInteriorSingleton(){}
	
	public static StaticInteriorSingleton getInstance(){
		return InnerInstance.instance;
	}
}
