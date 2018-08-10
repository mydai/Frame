package observer.self;

/**
 * 
 * 
 * <b>�����ƣ�</b>Observerable<br/>
 * <b>��������</b>���۲���<br/>
 * <b>�����ˣ�</b>cuidaidai<br/>
 * <b>�޸��ˣ�</b>cuidaidai<br/>
 * <b>�޸�ʱ�䣺</b>2018��7��22�� ����3:53:13<br/>
 * <b>�޸ı�ע��</b><br/>
 * @version 1.0.0<br/>
 *
 */
public interface Observerable {

	//ע��۲���
	public void registerObserver(Observer o);
	
	//�Ƴ��۲���
	public void removeObserver(Observer o);
	
	//֪ͨ�۲���
	public void notifyAllObserver();
}
