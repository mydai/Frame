package proxy.staticproxy;

public class RealSubject implements Subject {

	public String request() {
		System.out.println("��ʵ����Ĳ�������");
		return "hello";
	}

}
