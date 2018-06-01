package com.frame.sqlsession;

/**
 * 
 * 
 * <b>类名称：</b>Excutor<br/>
 * <b>类描述：</b>执行器接口<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年5月22日 下午10:21:36<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public interface Excutor {

	public <T> T query(String statement,Object parameter);
}
