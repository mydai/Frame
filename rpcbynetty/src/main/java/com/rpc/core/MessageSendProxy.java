package com.rpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MessageSendProxy<T> implements InvocationHandler {

	private Class<T> cls;
	
	public MessageSendProxy(Class<T> cls){
		this.cls = cls;
	}
	
	@Override
	public Object invoke(Object proxy, Method arg1, Object[] arg2)
			throws Throwable {
		
		return null;
	}

}
