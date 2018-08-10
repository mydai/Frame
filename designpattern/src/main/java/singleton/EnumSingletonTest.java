package singleton;

//��ö��ʵ�ֵĵ���ģʽ
enum EnumSingleton {
    INSTANCE;
    public void printMethod(){
    	System.out.println("ʵ���еķ���");
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
