package com.frame.sqlsession;

public interface Excutor {

	public <T> T query(String statement,Object parameter);
}
