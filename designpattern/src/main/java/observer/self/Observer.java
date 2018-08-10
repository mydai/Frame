package observer.self;

/**
 * 
 * 
 * <b>类名称：</b>Observer<br/>
 * <b>类描述：</b>观察者接口<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年7月22日 下午3:52:08<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public interface Observer {

	//更新方法，被观察者在数据更新后会通过这个方法通知观察者
	public void update(Object paramObject);
}
