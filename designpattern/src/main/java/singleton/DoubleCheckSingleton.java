package singleton;

//双重锁判断机制单例模式
public class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance;
	
	private DoubleCheckSingleton(){}
	
	public static DoubleCheckSingleton getInstance(){
		if(instance == null){
			synchronized (DoubleCheckSingleton.class) {
				if(instance == null){
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
