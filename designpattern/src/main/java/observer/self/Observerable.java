package observer.self;

/**
 * 
 * 
 * <b>类名称：</b>Observerable<br/>
 * <b>类描述：</b>被观察者<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年7月22日 下午3:53:13<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public interface Observerable {

	//注册观察者
	public void registerObserver(Observer o);
	
	//移除观察者
	public void removeObserver(Observer o);
	
	//通知观察者
	public void notifyAllObserver();
}
