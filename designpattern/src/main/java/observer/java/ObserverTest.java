package observer.java;

public class ObserverTest {

	public static void main(String[] args) {
		//创建发布者
		Promulgator promulgator = new Promulgator();
		//创建两个订阅者
		SubscriberA subscribera = new SubscriberA();
		SubscriberB subscriberb = new SubscriberB();
		//将两个订阅者注册到发布者对象中
		promulgator.addObserver(subscribera);
		promulgator.addObserver(subscriberb);
		//将发布者中的data值设为2
		promulgator.setData(2);
		System.out.println(promulgator.hasChanged() );
		promulgator.notifyObservers(promulgator.getData());
		
		//开始测试设置相同的值会不会继续通知订阅者
		System.out.println("--------开始");
		promulgator.setData(2); 
		promulgator.notifyObservers(promulgator.getData());
		System.out.println("--------结束");
	}
}
