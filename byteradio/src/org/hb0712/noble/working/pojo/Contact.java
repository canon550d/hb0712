package org.hb0712.noble.working.pojo;

import java.util.List;
import java.util.Map;

/*
 * 通讯录
 */
public class Contact {
	private Integer id;
	private String name;//name prefix，名称前缀
	private String value;
	private String middleName;//中间名
	private String lastName;//名字
	private String nameSuffix;//名字后缀
	private String phoneticGivenName;//姓氏拼音
	private String phoneticMiddleName;//中间名字拼音
	private String phoneticFamilyName;//名字拼音
	private Map<String, Phone> phone;//手机
	private Map<String, Email> email;//电子邮件
	private Map<String, PostalAddress> postalAddress;//邮政地址
	
	//More
	private String notes;//注释
	private String nickName;//昵称
	private List<String> website;
	private String birthday;//生日
	private String anniversary;//纪念日

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
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
