package com.frame.service.impl;

import java.util.Map;

import com.frame.annotation.Service;
import com.frame.service.SpringmvcService;

@Service("SpringmvcServiceImpl")
public class SpringmvcServiceImpl implements SpringmvcService{

	    public int insert(Map map) {
	        System.out.println("SpringmvcServiceImpl:" + "insert");
	        return 0;
	    }
	    public int delete(Map map) {
	        System.out.println("SpringmvcServiceImpl:" + "delete");
	        return 0;
	    }
	    public int update(Map map) {
	        System.out.println("SpringmvcServiceImpl:" + "update");
	        return 0;
	    }
	    public int select(Map map) {
	        System.out.println("SpringmvcServiceImpl:" + "select");
	        return 0;
	    }

}
