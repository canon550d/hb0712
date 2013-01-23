package org.hb0712.noble.working.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * 通讯录
 */
public class Contact {
	private Integer id;
	private String name;//name prefix，名称前缀
	private String value;
	private String fistName;//姓氏
	private String middleName;//中间名
	private String lastName;//名字
	private String nameSuffix;//名字后缀
	private String phoneticGivenName;//姓氏拼音
	private String phoneticMiddleName;//中间名字拼音
	private String phoneticFamilyName;//名字拼音
//	private Map<String, Phone> phone;//手机
//	private Map<String, Email> email;//电子邮件
//	private Map<String, PostalAddress> postalAddress;//邮政地址
	private List<Detail> details = new ArrayList<Detail>();
	
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
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNameSuffix() {
		return nameSuffix;
	}
	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}
	public String getPhoneticGivenName() {
		return phoneticGivenName;
	}
	public void setPhoneticGivenName(String phoneticGivenName) {
		this.phoneticGivenName = phoneticGivenName;
	}
	public String getPhoneticMiddleName() {
		return phoneticMiddleName;
	}
	public void setPhoneticMiddleName(String phoneticMiddleName) {
		this.phoneticMiddleName = phoneticMiddleName;
	}
	public String getPhoneticFamilyName() {
		return phoneticFamilyName;
	}
	public void setPhoneticFamilyName(String phoneticFamilyName) {
		this.phoneticFamilyName = phoneticFamilyName;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public List<String> getWebsite() {
		return website;
	}
	public void setWebsite(List<String> website) {
		this.website = website;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAnniversary() {
		return anniversary;
	}
	public void setAnniversary(String anniversary) {
		this.anniversary = anniversary;
	}
	public List<Detail> getDetails() {
		return details;
	}
	public void setDetails(List<Detail> details) {
		this.details = details;
	}
	
	public List<Phone> getPhone() {
		List<Phone> p = new ArrayList<Phone>();
		for(Detail d: this.details){
			if (d instanceof Phone) {
				p.add((Phone)d);
			}
		}
		return p;
	}
	public List<Email> getEmail() {
		List<Email> p = new ArrayList<Email>();
		for(Detail d: this.details){
			if (d instanceof Email) {
				p.add((Email)d);
			}
		}
		return p;
	}
	public List<PostalAddress> getPostalAddress() {
		List<PostalAddress> p = new ArrayList<PostalAddress>();
		for(Detail d: this.details){
			if (d instanceof PostalAddress) {
				p.add((PostalAddress)d);
			}
		}
		return p;
	}

}
