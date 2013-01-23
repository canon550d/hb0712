package org.hb0712.noble.working.pojo;

import org.junit.Test;

public class ContactTest {

	@Test
	public void test() {
		this.test2();
	}
	
	public void test2(){
		Contact c = new Contact();
		c.setFistName("��");
		c.setLastName("����");

		Phone d = new Phone();
		d.setLabel(Detail.detailType.Home.getName());
		d.setValue("18675836860");
		c.getDetails().add(d);
		
		Email d2 = new Email();
		d2.setLabel(Detail.detailType.Work.getName());
		d2.setValue("xie_yang227@163.com");
		c.getDetails().add(d2);
		
		PostalAddress p = new PostalAddress();
		p.setCity("����");
		p.setState("�㶫");
		p.setStreet("�����ĳ�ط�");
		p.setZipCode("11111");
		c.getDetails().add(p);
		
		System.out.println(c.getPhone().get(0).getValue());
	}

}
