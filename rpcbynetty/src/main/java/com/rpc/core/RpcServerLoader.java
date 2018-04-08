//package com.rpc.core;
//
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
///**
// * 
// * 
// * <b>类名称：</b>RpcServerLoader<br/>
// * <b>类描述：</b>服务器配置加载<br/>
// * <b>创建人：</b>cuidaidai<br/>
// * <b>修改人：</b>cuidaidai<br/>
// * <b>修改时间：</b>2018年4月7日 下午8:43:06<br/>
// * <b>修改备注：</b><br/>
// * @version 1.0.0<br/>
// *
// */
//public class RpcServerLoader {
//
//	//定义静态的线程可见的RpcServerLoader成员变量
//	private volatile static RpcServerLoader rpcServerLoader;
//	
//	private final static String DELIMITER = ":";
//	
//	private RpcSerializeProtocol serializeProtocol = RpcSerializeProtocol.JDKSERIALIZE;
//	
//	//方法返回到java虚拟机的可用的处理器数量 TODO 
//	private final static int parallel = Runtime.getRuntime().availableProcessors();
//	
//	//netty nio线程池
//	private EventLoopGroup eventLoopGroup = new NioEventLoopGroup(parallel);
//	
//	private static ThreadPoolExecutor threadPoolExcutor = (ThreadPoolExecutor)RpcThreadPool.getExecutor(16, -1);
//    
//	private MessageSendHandler messageSendHandler = null;
//	
//	//等待Netty服务端链路建立通知信号
//	private Lock lock = new ReentrantLock();
//	private Condition signal = lock.newCondition();
//	
//	private RpcServerLoader(){
//	}
//    
//	//并发双重锁定
//	public static RpcServerLoader getInstance(){
//		if(rpcServerLoader == null){
//			synchronized (RpcServerLoader.class) {
//				if(rpcServerLoader == null){
//					rpcServerLoader = new RpcServerLoader();
//				}
//			}
//		}
//	}
//}
