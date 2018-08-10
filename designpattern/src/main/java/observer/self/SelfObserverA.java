package observer.self;

/**
 * 
 * 
 * <b>类名称：</b>SelfObserverA<br/>
 * <b>类描述：</b>观察者A<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年7月22日 下午4:00:18<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class SelfObserverA implements Observer {

	@Override
	public void update(Object paramObject) {
        System.out.println("我是观察者A,我得到的data的值是："+paramObject.toString());
	}

}
