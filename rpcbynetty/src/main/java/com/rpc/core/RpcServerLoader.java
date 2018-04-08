package com.rpc.core;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * 
 * <b>类名称：</b>RpcServerLoader<br/>
 * <b>类描述：</b>服务器配置加载<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年4月7日 下午8:43:06<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class RpcServerLoader {

	//定义静态的线程可见的RpcServerLoader成员变量
	private volatile static RpcServerLoader rpcServerLoader;
	
	private final static String DELIMITER = ":";
	
	private RpcSerializeProtocol serializeProtocol = RpcSerializeProtocol.JDKSERIALIZE;
	
	//方法返回到java虚拟机的可用的处理器数量 TODO 
	private final static int parallel = Runtime.getRuntime().availableProcessors();
	
	//netty nio线程池
	private EventLoopGroup eventLoopGroup = new NioEventLoopGroup(parallel);
	
	private static ThreadPoolExecutor threadPoolExcutor = (ThreadPoolExecutor)RpcThreadPool.getExecutor(16, -1);
    
	private MessageSendHandler messageSendHandler = null;
	
	//等待Netty服务端链路建立通知信号
	private Lock lock = new ReentrantLock();
	private Condition signal = lock.newCondition();
	
	private RpcServerLoader(){
	}
    
	//并发双重锁定
	public static RpcServerLoader getInstance(){
		if(rpcServerLoader == null){
			synchronized (RpcServerLoader.class) {
				if(rpcServerLoader == null){
					rpcServerLoader = new RpcServerLoader();
				}
			}
		}
	}
	
	public void load(String serverAddress,RpcSerializeProtocol serializeProtocol){
		String[] ipAddr = serverAddress.split(RpcServerLoader.DELIMITER);
		if(ipAddr.length == 2){
			String host = ipAddr[0];
			int port = Integer.parseInt(ipAddr[1]);
			final InetSocketAddress remoteAddr = new InetSocketAddress(host,port);
			threadPoolExcutor.submit(new MessageSendInitializeTsk(eventLoopGroup,remoteAddr,this,serializeProtocol));
			
		}
	}
	
	public void setMessageSendHandler(MessageSendHandler messageInHandler){
		try {
			lock.lock();
			this.messageSendHandler = messageInHandler;
			//唤醒所有等待客户端RPC线程
			signal.signalAll();
		} catch (Exception e) {
			
		}finally{
			lock.unlock();
		}
	}
	
	public MessageSendHandler getMessageSendHandler() throws InterruptedIOException{
		try {
			lock.lock();
			//Netty服务端链路没有建立完毕之前，先挂起等待
			if(messageSendHandler == null){
				signal.await();
			}
			return messageSendHandler;
		}finally{
			lock.unlock();
		}
	}
	
	public void unLoad(){
	}
}
