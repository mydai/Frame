package com.frame.config;

import java.io.Serializable;
import java.util.List;

public class MapperBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String interfaceName;//接口名
	
	private List<Function> list;//接口下所有方法

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public List<Function> getList() {
		return list;
	}

	public void setList(List<Function> list) {
		this.list = list;
	}
	
}
