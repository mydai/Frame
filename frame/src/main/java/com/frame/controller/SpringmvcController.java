package com.frame.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.frame.annotation.Controller;
import com.frame.annotation.Quatifier;
import com.frame.annotation.RequestMapping;
import com.frame.service.MyService;
import com.frame.service.SpringmvcService;

@Controller("daidai")
public class SpringmvcController {

	@Quatifier("MyServiceImpl")
	MyService myService;
	@Quatifier("SpringmvcServiceImpl")
	SpringmvcService smService;
	
	@RequestMapping("insert")
	public String insert(HttpServletRequest request, HttpServletResponse response, String param){
		myService.insert(null);
		smService.insert(null);
		return "新增";
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request,HttpServletResponse response,String param){
		myService.delete(null);
		smService.delete(null);
		return "删除";
	}
	
	@RequestMapping("update")
	public String update(HttpServletRequest request,HttpServletResponse response,String param){
		myService.update(null);
		smService.update(null);
		return "更新";
	}
	
	@RequestMapping("select")
	public String select(HttpServletRequest request,HttpServletResponse response, String param){
		myService.select(null);
		smService.select(null);
		return "选择";
	}
	
}
