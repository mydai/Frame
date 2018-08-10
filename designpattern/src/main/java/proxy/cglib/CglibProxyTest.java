package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyTest {

	public static void main(String[] args) {
		final UserService service = new UserService();
		//cglib动态代理
		//需要类 Enhancer
	    Enhancer enhancer = new Enhancer();
	
	    enhancer.setSuperclass(service.getClass());
	    
	    enhancer.setCallback(new MethodInterceptor() {
			
			public Object intercept(Object obj, Method method, Object[] args,
					MethodProxy methodproxy) throws Throwable {
				System.out.println("before");
				method.invoke(service, args);
				System.out.println("after");
				return null;
			}
		});
	    
	    UserService proxy = (UserService)enhancer.create();
	    proxy.delete();
	}
}
