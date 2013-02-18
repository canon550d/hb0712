package org.hb0712.noble.working.impl.service;

import org.hb0712.noble.working.service.ContactService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AbstractContactServiceTest {

	@Test
	public void test() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		ContactService e = (ContactService)act.getBean("contactService");
		e.reName();
	}

}
