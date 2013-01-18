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
		sunwukong.setName("�����");
		
		Employee bajie = new Employee();
		bajie.setName("��˽�");
		
		Employee sha = new Employee();
		sha.setName("ɳ��");
		
		h.setName("���»�");
		u.setName("��ɮ");
		u.setHuman(h);
		
		Work w = new Work();
		w.setWorkTime(new Date());
		w.setHuman(h);
		w.setText("ʦ�����ˣ�����Ϣһ�°�");
		ws.setUser(u);
		ws.getWorks().add(w);
		
		Conversation c = new Conversation();
		c.setText("��ͺ���߼����ͺ���");
		c.setSpeaker(sunwukong);
		w.getConversations().add(c);
		
		Conversation c_bajie = new Conversation();
		c_bajie.setText("ʦ������ȥ��ˮ");
		c_bajie.setSpeaker(bajie);
		w.getConversations().add(c_bajie);
		
		Conversation c_sha = new Conversation();
		c_sha.setText("����ʦ������ɹ���̫��");
		c_sha.setSpeaker(sha);
		w.getConversations().add(c_sha);
		
		//work2
		w = new Work();
		w.setWorkTime(new Date());
		w.setHuman(h);
		w.setText("ʦ��������ץ����");
		ws.getWorks().add(w);
		
		c = new Conversation();
		c.setText("ʦ������������");
		c.setSpeaker(sunwukong);
		w.getConversations().add(c);
		
		c = new Conversation();
		c.setText("���ӱ�������ˣ��˽���ȥ���¹���");
		c.setSpeaker(sunwukong);
		w.getConversations().add(c);
		
		c = new Conversation();
		c.setText("��������ȥ���");
		c.setSpeaker(bajie);
		w.getConversations().add(c);
		
		c = new Conversation();
		c.setText("ʦ��������");
		c.setSpeaker(sha);
		w.getConversations().add(c);
		
		//work 3
		h = new Human();
		h.setName("������");
		
		w = new Work();
		w.setWorkTime(new Date());
		w.setHuman(h);
		w.setText("ʦ����Ů��");
		ws.getWorks().add(w);
		
		c = new Conversation();
		c.setText("ʦ����ô����Ů�ˣ�����");
		c.setSpeaker(sunwukong);
		w.getConversations().add(c);
		
		c = new Conversation();
		c.setText("��˵ʦ��Ͷ̥�����");
		c.setSpeaker(sha);
		w.getConversations().add(c);
		
		c = new Conversation();
		c.setText("���ҵ����Ӱ�");
		c.setSpeaker(bajie);
		w.getConversations().add(c);
		
		return ws;
	}

}
