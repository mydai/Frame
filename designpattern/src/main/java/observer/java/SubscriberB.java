package observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * 
 * <b>类名称：</b>Subscriber<br/>
 * <b>类描述：</b>订阅者(观察者)<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年7月22日 上午10:31:50<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class SubscriberB implements Observer{

	@Override
	public void update(Observable paramObservable, Object paramObject) {
			System.out.println("这里是订阅者B-------------");
			System.out.println("获得的data的值是："+paramObject.toString());
	}

}
