package com.rpc.core;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 
 * 
 * <b>类名称：</b>AbortPolocyWithReport<br/>
 * <b>类描述：</b>线程池异常策略,当线程池满了之后做的决策<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年4月7日 下午8:10:58<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class AbortPolicyWithReport extends ThreadPoolExecutor.AbortPolicy{

	private final String threadName;
	
	public AbortPolicyWithReport(String threadName){
		this.threadName = threadName;
	}
	
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
        String msg = String.format("RpcServer["
                + " Thread Name: %s, Pool Size: %d (active: %d, core: %d, max: %d, largest: %d), Task: %d (completed: %d),"
                + " Executor status:(isShutdown:%s, isTerminated:%s, isTerminating:%s)]",
                threadName, e.getPoolSize(), e.getActiveCount(), e.getCorePoolSize(), e.getMaximumPoolSize(), e.getLargestPoolSize(),
                e.getTaskCount(), e.getCompletedTaskCount(), e.isShutdown(), e.isTerminated(), e.isTerminating());
        System.out.println(msg);
        throw new RejectedExecutionException(msg);
    }
}
