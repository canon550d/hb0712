package org.hb0712.noble.working.action;

import java.util.Date;

import org.hb0712.noble.working.pojo.Conversation;
import org.hb0712.noble.working.pojo.Employee;
import org.hb0712.noble.working.pojo.Human;
import org.hb0712.noble.working.pojo.User;
import org.hb0712.noble.working.pojo.Work;
import org.hb0712.noble.working.pojo.WorkStands;
import org.junit.Test;

public class WorkActionTest {

	@Test
	public void test() {
		
	}
	
	public WorkStands init(){
		Human h = new Human();
		WorkStands ws = new WorkStands();
		User u = new User();
		
		
		Employee sunwukong = new Employee();
		sunwukong.setName("孙悟空");
		
		Employee bajie = new Employee();
		bajie.setName("猪八戒");
		
		Employee sha = new Employee();
		sha.setName("沙悟净");
		
		h.setName("刘德华");
		u.setName("唐僧");
		u.setHuman(h);
		
		Work w = new Work();
		w.setWorkTime(new Date());
		w.setHuman(h);
		w.setText("师傅累了，先休息一下吧");
		ws.setUser(u);
		ws.getWorks().add(w);
		
		Conversation c = new Conversation();
		c.setText("死秃子走几步就喊累");
		c.setSpeaker(sunwukong);
		w.getConversations().add(c);
		
		Conversation c_bajie = new Conversation();
		c_bajie.setText("师傅，我去找水");
		c_bajie.setSpeaker(bajie);
		w.getConversations().add(c_bajie);
		
		Conversation c_sha = new Conversation();
		c_sha.setText("来，师傅，咱晒会儿太阳");
		c_sha.setSpeaker(sha);
		w.getConversations().add(c_sha);
		
		//work2
		w = new Work();
		w.setWorkTime(new Date());
		w.setHuman(h);
		w.setText("师傅被妖怪抓走了");
		ws.getWorks().add(w);
		
		c = new Conversation();
		c.setText("师傅，我来救你");
		c.setSpeaker(sunwukong);
		w.getConversations().add(c);
		
		c = new Conversation();
		c.setText("老子被打回来了，八戒你去问下观音");
		c.setSpeaker(sunwukong);
		w.getConversations().add(c);
		
		c = new Conversation();
		c.setText("观音亲自去解救");
		c.setSpeaker(bajie);
		w.getConversations().add(c);
		
		c = new Conversation();
		c.setText("师傅回来了");
		c.setSpeaker(sha);
		w.getConversations().add(c);
		
		//work 3
		h = new Human();
		h.setName("荆无命");
		
		w = new Work();
		w.setWorkTime(new Date());
		w.setHuman(h);
		w.setText("师傅是女人");
		ws.getWorks().add(w);
		
		c = new Conversation();
		c.setText("师傅怎么会是女人？胡闹");
		c.setSpeaker(sunwukong);
		w.getConversations().add(c);
		
		c = new Conversation();
		c.setText("听说师傅投胎搞错了");
		c.setSpeaker(sha);
		w.getConversations().add(c);
		
		c = new Conversation();
		c.setText("给我当娘子吧");
		c.setSpeaker(bajie);
		w.getConversations().add(c);
		
		return ws;
	}

}
