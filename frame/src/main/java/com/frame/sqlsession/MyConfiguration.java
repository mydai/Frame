package com.frame.sqlsession;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.frame.config.Function;
import com.frame.config.MapperBean;


/**
 * 
 * 
 * <b>类名称：</b>MyConfiguration<br/>
 * <b>类描述：</b>读取于解析配置信息，并返回出来后的Enviroment<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年5月8日 上午10:12:58<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class MyConfiguration {

	private static ClassLoader loader = ClassLoader.getSystemClassLoader();
	
	/**
	 * 读取xml信息并处理
	 */
	public Connection build(String resource){
		try {
			InputStream stream = loader.getResourceAsStream(resource);
			SAXReader reader = new SAXReader();
			Document ducument = reader.read(stream);
			Element root = ducument.getRootElement();
			return evalDataSource(root);
		} catch (Exception e) {
			throw new RuntimeException("error occured while evaling xml "+resource);
		}
	}
	
	private Connection evalDataSource(Element node) throws ClassNotFoundException{
		if(!node.getName().equals("database")){
			throw new RuntimeException("root should be <database>");
		}
		String driverClassName = null;
		String url = null;
		String username = null;
		String password = null;
		//获取属性节点
		for(Object item : node.elements("property")){
			Element i  = (Element)item;
			String value = getValue(i);
			String name = i.attributeValue("name");
			if(name == null || value == null ){
				throw new RuntimeException("[database]:<property> should contain name and value");
			}
			//赋值
			switch (name) {
			case "url": url = value;break;
			case "username": username = value;break;
			case "password": password = value;break;
			case "driverClassName": driverClassName = value;break;
			default : throw new RuntimeException("[database]:property unknown name");
			}
		}
		
		//加载数据库实例
		Class.forName(driverClassName);
		Connection connection = null;
		try {
			//建立数据库连接
			connection = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	private String getValue(Element node){
		return node.hasContent() ? node.getText() : node.attributeValue("value");
	}
	
	public MapperBean readMapper(String path){
		MapperBean mapper = new MapperBean();
		try {
			InputStream stream = loader.getResourceAsStream(path);
			SAXReader reader = new SAXReader();
			Document document = reader.read(stream);
			Element root = document.getRootElement();
			mapper.setInterfaceName(root.attributeValue("nameSpace").trim());//把mapper节点的nameSpace存为映射的接口名
		    List<Function> list = new ArrayList<Function>();//用来存储方法的List
		    for(Iterator rootIter = root.elementIterator();rootIter.hasNext();){//遍历根节点下所有子节点
		    	Function fun = new Function();//用来存储一条方法的信息
		    	Element e = (Element)rootIter.next();
		    	String sqltype = e.getName().trim();
		    	String funcName = e.attributeValue("id").trim();
		    	String sql = e.getText().trim();
		    	String resultType = e.attributeValue("resultType").trim();
		    	fun.setSql(sqltype);
		    	fun.setFuncName(funcName);
		    	fun.setResultType(resultType);
		    	fun.setSql(sql);
		    	Object newInstance = null;
		    	try {
					newInstance = Class.forName(resultType).newInstance();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
		    	list.add(fun);
		    }
		    mapper.setList(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mapper;
	}
}
