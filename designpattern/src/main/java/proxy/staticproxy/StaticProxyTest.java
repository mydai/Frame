package proxy.staticproxy;

public class StaticProxyTest {

	public static void main(String[] args) {
		RealSubject real = new RealSubject();
		
		ProxySubject proxy = new ProxySubject();
		proxy.setReal(real);
		
		proxy.request();
	}
}
