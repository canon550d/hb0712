package org.hb0712.learn.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class NotVeryUsefulAspect {
	private Logger log = Logger.getLogger(NotVeryUsefulAspect.class);
	
	public static final String EDP = "execution(* org.hb0712.noble.working.impl.service.AbstractContactService.reName*(..))";

	@Before(EDP)
	public void authorith() {
		log.info("模拟进行权限检查。");
	}

}
