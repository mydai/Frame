package singleton;

//用枚举实现的单例模式
enum EnumSingleton {
    INSTANCE;
    public void printMethod(){
    	System.out.println("实例中的方法");
    }
}

public class EnumSingletonTest{
	public static void main(String[] args) {
		System.out.println((EnumSingleton.INSTANCE instanceof EnumSingleton));
		System.out.println(EnumSingleton.INSTANCE.hashCode());
		System.out.println(EnumSingleton.INSTANCE.hashCode());
		System.out.println(EnumSingleton.INSTANCE.hashCode());
		System.out.println(EnumSingleton.INSTANCE.hashCode());
		EnumSingleton.INSTANCE.printMethod();
	}
}
