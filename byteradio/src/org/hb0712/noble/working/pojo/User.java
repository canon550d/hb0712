package org.hb0712.noble.working.pojo;

/*
 * �û���������˼����ʹ�ò�Ʒ���ˣ�����������������һ�����ˣ���һ���ǲ�Ʒ
 * 
 * һ�����û�����TAʹ�õ����ʱ������ܻ��ж�����ף��������Ӱ����μ������ɮ����ΪĳЩԭ�������ɫʹ����������Ա�����������ٻ��������𣬵��Ƕ��ڹ�����˵ֻ��ʶ��ɮ��˭�ݵ����ǵ��ݰ��ŵ����顣human = ������ ��humans = {"����","���ٻ�","������"}
 */
public class User {
	private Integer id;
	private String name;	//��ɮ
	private Human human;	//������

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Human getHuman() {
		return human;
	}
	public void setHuman(Human human) {
		this.human = human;
	}
	
	
}
