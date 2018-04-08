package com.rpc.model;

import java.util.Map;

/**
 * 
 * 
 * <b>类名称：</b>MessageKeyVal<br/>
 * <b>类描述：</b>服务映射容器,RPC服务接口定义、服务接口实现绑定关系容器定义，提供给spring作为容器使用<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年4月6日 下午10:05:47<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class MessageKeyVal {

	private Map<String,Object> messageKeyVal;

	public Map<String, Object> getMessageKeyVal() {
		return messageKeyVal;
	}

	public void setMessageKeyVal(Map<String, Object> messageKeyVal) {
		this.messageKeyVal = messageKeyVal;
	}
	
}
