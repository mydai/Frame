package observer.self;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * 
 * <b>类名称：</b>SelfObserverable<br/>
 * <b>类描述：</b>被观察者<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年7月22日 下午4:03:28<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class SelfObserverable implements Observerable{

	//用于标识内容是否已更新
	private boolean changed = false;
	
	private int data = 0;
	
	private List<Observer> observerList = new ArrayList<>();
	
	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void notifyAllObserver() {
		if(!this.changed){
			return;
		}
		Iterator<Observer> iterator =  observerList.iterator();
		while(iterator.hasNext()){
			iterator.next().update(this.data);
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean changed) {
		this.changed = changed;
	}
	
	
}
