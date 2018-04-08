package com.rpc.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 
 * 
 * <b>类名称：</b>MessageRequest<br/>
 * <b>类描述：</b>RPC请求消息的结构体<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年4月6日 下午9:57:37<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class MessageRequest implements Serializable{

	private static final long serialVersionUID = -7457526556940915766L;

	//消息id
	private String messageId;
	
	//类名
	private String className;
	
	//方法名
	private String methodName;
	
	//类型参数数组
	private Class<?>[] typeParameters;
	
	//参数数组值
	private Object[] parametersVal;

	public String getMessageId() {
		return messageId;
	}



	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}



	public String getClassName() {
		return className;
	}



	public void setClassName(String className) {
		this.className = className;
	}



	public String getMethodName() {
		return methodName;
	}



	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}



	public Class<?>[] getTypeParameters() {
		return typeParameters;
	}



	public void setTypeParameters(Class<?>[] typeParameters) {
		this.typeParameters = typeParameters;
	}



	public Object[] getParametersVal() {
		return parametersVal;
	}



	public void setParametersVal(Object[] parametersVal) {
		this.parametersVal = parametersVal;
	}



	@Override
	public String toString() {
		return "MessageRequest [messageId=" + messageId + ", className="
				+ className + ", methodName=" + methodName
				+ ", typeParameters=" + Arrays.toString(typeParameters)
				+ ", parametersVal=" + Arrays.toString(parametersVal) + "]";
	}
	
	
}
