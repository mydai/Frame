package com.rpc.core;

import java.lang.reflect.Proxy;

/**
 * 
 * 
 * <b>类名称：</b>MessageSendExecutor<br/>
 * <b>类描述：</b>客户端执行模块<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年4月8日 下午9:43:06<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class MessageSendExecutor {

	private RpcServerLoader loader = RpcServerLoader.getInstance();
	
	public MessageSendExecutor(String serverAddress){
		loader.load(serverAddress);
	}
	
	public void stop(){
		loader.unLoad();
	}
	
	public static<T> T execute(Class<T> rpcInterface){
		return (T)Proxy.newProxyInstance(rpcInterface.getClassLoader(),new Class<?>[] {rpcInterface}, new MessageSendProxy<T>(rpcInterface))
	}
	
}
