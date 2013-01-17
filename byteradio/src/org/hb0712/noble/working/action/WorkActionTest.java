package org.hb0712.noble.working.action;

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
		h.setName("¿Ó—∞ª∂");
		
		Work w = new Work();
		w.setHuman(h);
		
		WorkStands ws = new WorkStands();
		ws.getWorks().add(w);
		
		return ws;
	}

}
