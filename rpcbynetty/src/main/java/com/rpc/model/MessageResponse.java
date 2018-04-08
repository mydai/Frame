package com.rpc.model;

import java.io.Serializable;

/**
 * 
 * 
 * <b>类名称：</b>MessageResponse<br/>
 * <b>类描述：</b>RPC应答消息结构<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年4月6日 下午10:02:22<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class MessageResponse implements Serializable{

	private static final long serialVersionUID = 3692296202023799865L;

	private String messageId;
	
	private String error;
	
	private Object resultDesc;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Object getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(Object resultDesc) {
		this.resultDesc = resultDesc;
	}

	@Override
	public String toString() {
		return "MessageResponse [messageId=" + messageId + ", error=" + error
				+ ", resultDesc=" + resultDesc + "]";
	}
	
}
