package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * 
 * <b>�����ƣ�</b>JdkProxy<br/>
 * <b>��������</b>����ģʽ��jdk��̬����<br/>
 * <b>�����ˣ�</b>cuidaidai<br/>
 * <b>�޸��ˣ�</b>cuidaidai<br/>
 * <b>�޸�ʱ�䣺</b>2018��7��15�� ����8:42:37<br/>
 * <b>�޸ı�ע��</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class JdkProxy {

	public static void main(String[] args) {
		final IUserDAO dao = new UserDaoImpl();
		IUserDAO proxy = (IUserDAO)Proxy.newProxyInstance(dao.getClass().getClassLoader(), 
				dao.getClass().getInterfaces(), new InvocationHandler(){

			        /**
			         * proxy �������
			         * method ��������󷽷� add()
			         * args add�����Ĳ���
			         */
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						System.out.println("start Tran");
						//ִ��dao�����add�������������args����������ֵ��result
						Object result = method.invoke(dao, args);
						System.out.println("write logger");
						return result;
					}
		});
		String add = proxy.add();
		System.out.println("======="+add+"=======");
		proxy.edit();
		//
		System.out.println("=======��ʼ=======");
		proxy.toString();
	}
}
