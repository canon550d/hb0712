package org.hb0712.noble.working.pojo;

/*
 * 用户的字面意思就是使用产品的人，故这里有两个对象，一个是人，另一个是产品
 * 
 * 一个人用户，在TA使用的这段时间里可能会有多张面孔，例如央视版西游记里的唐僧，因为某些原因这个角色使用了三个演员，汪粤，徐少华，迟重瑞，但是对于观众来说只认识唐僧，谁演的那是导演安排的事情。human = 迟重瑞 ，humans = {"汪粤","徐少华","迟重瑞"}
 */
public class User {
	private Integer id;
	private String name;	//唐僧
	private Human human;	//迟重瑞

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
