package com.yf;

import com.opensymphony.xwork2.ActionSupport;

public class hello extends ActionSupport {
	    private String  msg;  
	      
	      
	     public String getMsg() {  
	        return msg;  
	    }  
	  
	  
	    public void setMsg(String msg) {  
	        this.msg = msg;  
	    }  
	  
	  
	    public String execute()  
	     {  
	        msg="���ǵ�һ��struts����Helloworld Struts2";  
	         return "success";  
	     }  
}
