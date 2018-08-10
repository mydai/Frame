package proxy.staticproxy;

public class RealSubject implements Subject {

	public String request() {
		System.out.println("真实主题的操作内容");
		return "hello";
	}

}
