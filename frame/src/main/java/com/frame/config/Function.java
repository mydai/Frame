package com.frame.config;

import java.io.Serializable;

public class Function implements Serializable{

	private static final long serialVersionUID = 1L;

	private String sqltype;
	
	//方法名
	private String funcName;
	
	//sql语句
	private String sql;
	
	//返回类型
	private Object resultType;
	
	//传入类型
	private String parameterType;

	public String getSqltype() {
		return sqltype;
	}

	public void setSqltype(String sqltype) {
		this.sqltype = sqltype;
	}

	public String getFuncName() {
		return funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public Object getResultType() {
		return resultType;
	}

	public void setResultType(Object resultType) {
		this.resultType = resultType;
	}

	public String getParameterType() {
		return parameterType;
	}

	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}
	
}
