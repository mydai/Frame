package com.rpc.core;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.net.SocketAddress;
import java.util.concurrent.ConcurrentHashMap;

import com.rpc.model.MessageRequest;
import com.rpc.model.MessageResponse;

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
	
	//Channel(通道)用于在字节缓冲区和位于通道另一侧的实体（通常是一个文件或套接字）之间有效地传输数据
	private volatile Channel channel;
	
	private SocketAddress remoteAddr;
	
	public Channel getChannel(){
		return channel;
	}
	
	public SocketAddress getRemoteAddr(){
		return remoteAddr;
	}
	
	//通道激活
	public void channelActive(ChannelHandlerContext ctx) throws Exception{
		super.channelActive(ctx);
		this.remoteAddr = this.channel.remoteAddress();
	}
	
	//通道注册
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception{
		super.channelRegistered(ctx);
		this.channel = ctx.channel();
	}
	
	
	public void channelRead(ChannelHandlerContext ctx,Object msg) throws Exception{
		MessageResponse response = (MessageResponse)msg;
		String messageId = response.getMessageId();
		MessageCallBack callBack = mapCallBack.get(messageId);
		if(callBack != null){
			mapCallBack.remove(messageId);
			callBack.over(response);
		}
	}
	
	public void exceptionCaught(ChannelHandlerContext ctx,Throwable cause) throws Exception{
		ctx.close();
	}
	
	public void close(){
		channel.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
	}
	
	public MessageCallBack sendRequest(MessageRequest request){
		MessageCallBack callBack = new MessageCallBack(request);
		mapCallBack.put(request.getMessageId(), callBack);
		channel.writeAndFlush(request);
		return callBack;
	}
}
