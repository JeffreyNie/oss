package cn.edu.bit.oss.main.web.controller;   

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**     
 * Function: TODO 
 *
 * ClassName:Hello 
 * Date:     2016年7月6日 下午6:02:12    
 * @author   lottery   
 * @version     
 * @since    JDK 1.8   
 * Copyright (c) 2016, palm-commerce All Rights Reserved.         
 */
public class HelloController implements Controller {
	
	@Override  
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {  
       //1、收集参数、验证参数  
       //2、绑定参数到命令对象  
       //3、将命令对象传入业务对象进行业务处理  
       //4、选择下一个页面  
       ModelAndView mv = new ModelAndView();  
       //添加模型数据 可以是任意的POJO对象  
       mv.addObject("message", "Hello World!");
       //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
       mv.setViewName("hello");
       return mv;  
    }  
	
}
   
