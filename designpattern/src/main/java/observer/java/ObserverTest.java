package observer.java;

public class ObserverTest {

	public static void main(String[] args) {
		//����������
		Promulgator promulgator = new Promulgator();
		//��������������
		SubscriberA subscribera = new SubscriberA();
		SubscriberB subscriberb = new SubscriberB();
		//������������ע�ᵽ�����߶�����
		promulgator.addObserver(subscribera);
		promulgator.addObserver(subscriberb);
		//���������е�dataֵ��Ϊ2
		promulgator.setData(2);
		System.out.println(promulgator.hasChanged() );
		promulgator.notifyObservers(promulgator.getData());
		
		//��ʼ����������ͬ��ֵ�᲻�����֪ͨ������
		System.out.println("--------��ʼ");
		promulgator.setData(2); 
		promulgator.notifyObservers(promulgator.getData());
		System.out.println("--------����");
	}
}
