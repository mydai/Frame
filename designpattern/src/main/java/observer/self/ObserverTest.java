package observer.self;

/**
 * 
 * 
 * <b>类名称：</b>ObserverTest<br/>
 * <b>类描述：</b>自己实现的观察者模式测试类<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年7月22日 下午4:17:13<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		//创建被观察者
		SelfObserverable observerable = new SelfObserverable();
		//创建观察者A
		Observer observerA = new SelfObserverA();
		//创建观察者B
		Observer observerB = new SelfObserverB();
		
		//将观察者A和观察者B注册到被观察者对象中
		observerable.registerObserver(observerA);
		observerable.registerObserver(observerB);
		
		//给data设置
		observerable.setData(10);
		//设置更新状态
		observerable.setChanged(true);
		
		//通知所有观察者
		observerable.notifyAllObserver();
	}
}
