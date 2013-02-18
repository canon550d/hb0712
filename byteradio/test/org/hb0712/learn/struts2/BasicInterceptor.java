package org.hb0712.learn.struts2;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class BasicInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Logger log = Logger.getLogger(BasicInterceptor.class);

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		log.info("Œ“¿’∏ˆ»•");
		return arg0.invoke();
	}

}
