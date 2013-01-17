package org.hb0712.noble.passport.pojo;

/*
 * 通行证
 * verify 注册通行证的时候需要验证，
 *     i.输入两次相同的密码 
 *     ii.手机获取随机密码
 *     iii.
 */
public class Passport {
	private int id;
	private String verify;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}
}
