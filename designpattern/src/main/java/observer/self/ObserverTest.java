package observer.self;

/**
 * 
 * 
 * <b>�����ƣ�</b>ObserverTest<br/>
 * <b>��������</b>�Լ�ʵ�ֵĹ۲���ģʽ������<br/>
 * <b>�����ˣ�</b>cuidaidai<br/>
 * <b>�޸��ˣ�</b>cuidaidai<br/>
 * <b>�޸�ʱ�䣺</b>2018��7��22�� ����4:17:13<br/>
 * <b>�޸ı�ע��</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		//�������۲���
		SelfObserverable observerable = new SelfObserverable();
		//�����۲���A
		Observer observerA = new SelfObserverA();
		//�����۲���B
		Observer observerB = new SelfObserverB();
		
		//���۲���A�͹۲���Bע�ᵽ���۲��߶�����
		observerable.registerObserver(observerA);
		observerable.registerObserver(observerB);
		
		//��data����
		observerable.setData(10);
		//���ø���״̬
		observerable.setChanged(true);
		
		//֪ͨ���й۲���
		observerable.notifyAllObserver();
	}
}
