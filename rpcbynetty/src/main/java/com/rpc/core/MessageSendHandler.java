package com.rpc.core;

import io.netty.channel.ChannelInboundHandlerAdapter;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * 
 * <b>类名称：</b>MessageSendHandler<br/>
 * <b>类描述：</b>客户端处理模块<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年4月8日 下午9:12:40<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class MessageSendHandler extends ChannelInboundHandlerAdapter {
	private ConcurrentHashMap<String,MessageCallBack> mapCallBack = new ConcurrentHashMap<String,MessageCallBack>();
}
