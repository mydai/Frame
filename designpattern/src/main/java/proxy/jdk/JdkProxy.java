package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * 
 * <b>类名称：</b>JdkProxy<br/>
 * <b>类描述：</b>代理模式中jdk动态代理<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年7月15日 下午8:42:37<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class JdkProxy {

	public static void main(String[] args) {
		final IUserDAO dao = new UserDaoImpl();
		IUserDAO proxy = (IUserDAO)Proxy.newProxyInstance(dao.getClass().getClassLoader(), 
				dao.getClass().getInterfaces(), new InvocationHandler(){

			        /**
			         * proxy 代理对象
			         * method 被代理对象方法 add()
			         * args add方法的参数
			         */
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						System.out.println("start Tran");
						//执行dao对象的add方法，传入的是args参数，返回值是result
						Object result = method.invoke(dao, args);
						System.out.println("write logger");
						return result;
					}
		});
		String add = proxy.add();
		System.out.println("======="+add+"=======");
		proxy.edit();
		//
		System.out.println("=======开始=======");
		proxy.toString();
	}
}
