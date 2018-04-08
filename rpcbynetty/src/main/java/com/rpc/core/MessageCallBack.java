package com.rpc.core;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.rpc.model.MessageRequest;
import com.rpc.model.MessageResponse;

/**
 * 
 * 
 * <b>类名称：</b>MessageCallBack<br/>
 * <b>类描述：</b>Rpc消息回调<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年4月8日 下午9:18:00<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class MessageCallBack {

	private MessageRequest request;
	
	private MessageResponse response;
	
	private Lock lock = new ReentrantLock();
	
	private Condition finish = lock.newCondition();
	
	public MessageCallBack(MessageRequest request){
		this.request = request;
	}
	
	public Object start() throws InterruptedException{
		try {
			lock.lock();
			//设定一下超时时间，rpc服务器太久没有相应的话，就默认返回空。
			if(this.response != null){
				//TODO 
				return this.response.getResultDesc();
			}else{
				return null;
			}
		}finally{
			lock.unlock();
		}
	}
	
	public void over(MessageResponse response){
		try {
			lock.lock();
			finish.signal();
			this.response = response;
		}finally{
			lock.unlock();
		}
	}
}
