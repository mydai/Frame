package observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * 
 * <b>�����ƣ�</b>Subscriber<br/>
 * <b>��������</b>������(�۲���)<br/>
 * <b>�����ˣ�</b>cuidaidai<br/>
 * <b>�޸��ˣ�</b>cuidaidai<br/>
 * <b>�޸�ʱ�䣺</b>2018��7��22�� ����10:31:50<br/>
 * <b>�޸ı�ע��</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class SubscriberB implements Observer{

	@Override
	public void update(Observable paramObservable, Object paramObject) {
			System.out.println("�����Ƕ�����B-------------");
			System.out.println("��õ�data��ֵ�ǣ�"+paramObject.toString());
	}

}
