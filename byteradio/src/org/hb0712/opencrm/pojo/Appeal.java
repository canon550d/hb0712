package org.hb0712.opencrm.pojo;

import java.util.Date;

/*
 * �������������Ϣ
 */
@SuppressWarnings("unused")
public class Appeal {
	// 0.1.���εķ����
	private String serviceID;
	// 0.2.���ߵ��ʺ�
	private String passport;

	// 1.1.����������
	private String name;
	// 1.2.������֤������
	private String ID;
	// 1.3.�����˵�������
	private String email;
	// 1.4.�������ֻ�
	private String phone;

	// 2.1.���ò�Ʒ
	private String neteaseProduct;
	// 2.2.������Ҫ��;
	private String[] purpose;
	// 2.3.�ʼ�����
	private String emailSubject;
	// 2.4.��ϵ����Ϣ
	private String emailAddressList;
	// 2.5.�ù�������
	private String[] oldPassword;//�����룬ps��ʵ����ֻ�ܲ��������
	// 2.6.�������ֻ�
	private String associated;
	// 2.7.������Ϣ
	private String narrative;//����

	// 2.8.����/�����Ϣ
	private String bokexiangce;
	// 2.9.������Ƭ
	private String[] photos;//���ļ���url����������

	// 2.10.��Ʒʹ����Ϣ
	private String chanpinshiyongxinxi;

	// 3.1.ע��ʱ��
	private Date createTime;
	// 3.2.ע��ص�,eg ����-�Ͼ�
	private String createPlace;
	// 3.3.ע��֤����
	private String passportID;
	// 3.4.����¼����
	private String[] onlinePlace;

	
}
