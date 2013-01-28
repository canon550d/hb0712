package org.hb0712.noble.working.pojo;

import org.junit.Test;

public class ContactTest {

	@Test
	public void test() {
		this.test2();
	}
	
	public Contact test2(){
		Contact c = new Contact();
		c.setFistName("��");
		c.setLastName("����");

		Phone d = new Phone();
		d.setLabel(Detail.detailType.Home.getName());
		d.setValue("18675836860");
		c.getDetails().add(d);
		
		Phone d3 = new Phone();
		d3.setLabel(Detail.detailType.Work.getName());
		d3.setValue("13800138000");
		c.getDetails().add(d3);
		
		Email d2 = new Email();
		d2.setLabel(Detail.detailType.Work.getName());
		d2.setValue("xie_yang227@163.com");
		c.getDetails().add(d2);
		
		PostalAddress p = new PostalAddress();
		p.setLabel(Detail.detailType.Work.getName());
		p.setCity("����");
		p.setState("�㶫");
		p.setStreet("�����ĳ�ط�");
		p.setZipCode("11111");
		c.getDetails().add(p);
		
		return c;
	}

}
