package org.hb0712.opencrm.pojo;

import java.util.Date;

/*
 * 用来存放申述信息
 */
@SuppressWarnings("unused")
public class Appeal {
	// 0.1.本次的服务号
	private String serviceID;
	// 0.2.申诉的帐号
	private String passport;

	// 1.1.申诉人姓名
	private String name;
	// 1.2.申诉人证件号码
	private String ID;
	// 1.3.申诉人电子邮箱
	private String email;
	// 1.4.申诉人手机
	private String phone;

	// 2.1.常用产品
	private String neteaseProduct;
	// 2.2.邮箱主要用途
	private String[] purpose;
	// 2.3.邮件主题
	private String emailSubject;
	// 2.4.联系人信息
	private String emailAddressList;
	// 2.5.用过的密码
	private String[] oldPassword;//旧密码，ps：实际上只能查最近半年
	// 2.6.关联的手机
	private String associated;
	// 2.7.附加信息
	private String narrative;//叙述

	// 2.8.博客/相册信息
	private String bokexiangce;
	// 2.9.个人照片
	private String[] photos;//把文件的url保存在这里

	// 2.10.产品使用信息
	private String chanpinshiyongxinxi;

	// 3.1.注册时间
	private Date createTime;
	// 3.2.注册地点,eg 江苏-南京
	private String createPlace;
	// 3.3.注册证件号
	private String passportID;
	// 3.4.常登录地区
	private String[] onlinePlace;

	
}
