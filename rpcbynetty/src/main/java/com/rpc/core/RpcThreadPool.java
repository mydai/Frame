package com.rpc.core;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * 
 * 
 * <b>类名称：</b>RpcThreadPool<br/>
 * <b>类描述：</b>RPC线程池<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年4月7日 下午4:32:17<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class RpcThreadPool {

	/**
	 * 
	 * getExecutor( 独立出线程池主要是为了应对复杂耗I/O操作的业务，不阻塞netty的handler线程而引入
     * 当然如果业务足够简单，把处理逻辑写入netty的handler（ChannelInboundHandlerAdapter）也未尝不可)<br/>
	 * (这里描述这个方法适用条件 – 可选)<br/>
	 * @param threads
	 * @param queues
	 * @return 
	 * Executor
	 * @author cuidaidai
	 * @exception 
	 * @since  1.0.0
	 */
    public static Executor getExecutor(int threads, int queues) {
        String name = "RpcThreadPool";
        return new ThreadPoolExecutor(threads, threads, 0, TimeUnit.MILLISECONDS,
                queues == 0 ? new SynchronousQueue<Runnable>()
                        : (queues < 0 ? new LinkedBlockingQueue<Runnable>()
                                : new LinkedBlockingQueue<Runnable>(queues)),
                new NamedThreadFactory(name, true), new AbortPolicyWithReport(name));
    }
}
