package org.hb0712.noble.working.action;

import java.util.Date;

import org.hb0712.noble.working.pojo.Human;
import org.hb0712.noble.working.pojo.Work;
import org.hb0712.noble.working.pojo.WorkStands;
import org.junit.Test;

public class WorkActionTest {

	@Test
	public void test() {
		
	}
	
	public WorkStands init(){
		Human h = new Human();
		h.setName("��Ѱ��");
		
		Work w = new Work();
		w.setWorkTime(new Date());
		w.setHuman(h);
		w.setText("�Բۣ��㵽������");
		
		WorkStands ws = new WorkStands();
		ws.getWorks().add(w);
		
		return ws;
	}

}
