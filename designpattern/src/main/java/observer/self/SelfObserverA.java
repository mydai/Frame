package observer.self;

/**
 * 
 * 
 * <b>�����ƣ�</b>SelfObserverA<br/>
 * <b>��������</b>�۲���A<br/>
 * <b>�����ˣ�</b>cuidaidai<br/>
 * <b>�޸��ˣ�</b>cuidaidai<br/>
 * <b>�޸�ʱ�䣺</b>2018��7��22�� ����4:00:18<br/>
 * <b>�޸ı�ע��</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class SelfObserverA implements Observer {

	@Override
	public void update(Object paramObject) {
        System.out.println("���ǹ۲���A,�ҵõ���data��ֵ�ǣ�"+paramObject.toString());
	}

}
