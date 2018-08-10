package proxy.staticproxy;

public class ProxySubject implements Subject {

	//�����������������
	private RealSubject real;
	
	public String request() {
		System.out.println("before excute");
		real.request();
		System.out.println("after excute");
		return "proxy";
	}
	
	public RealSubject getReal(){
		return real;
	}
	
	public void setReal(RealSubject real){
		this.real = real;
	}

}
