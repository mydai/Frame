package singleton;

//��ö��ʵ�ֵĵ���ģʽ
public class EnumSingleton{
    private EnumSingleton(){}
    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }
    
    private static enum Singleton{
        INSTANCE;
        
        private EnumSingleton singleton;
        //JVM�ᱣ֤�˷�������ֻ����һ��
        private Singleton(){
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return singleton;
        }
    }
}