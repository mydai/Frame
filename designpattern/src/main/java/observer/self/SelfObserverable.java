package observer.self;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * 
 * <b>�����ƣ�</b>SelfObserverable<br/>
 * <b>��������</b>���۲���<br/>
 * <b>�����ˣ�</b>cuidaidai<br/>
 * <b>�޸��ˣ�</b>cuidaidai<br/>
 * <b>�޸�ʱ�䣺</b>2018��7��22�� ����4:03:28<br/>
 * <b>�޸ı�ע��</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class SelfObserverable implements Observerable{

	//���ڱ�ʶ�����Ƿ��Ѹ���
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
