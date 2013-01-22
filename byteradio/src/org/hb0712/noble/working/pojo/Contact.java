package org.hb0712.noble.working.pojo;

import java.util.List;
import java.util.Map;

/*
 * ͨѶ¼
 */
public class Contact {
	private Integer id;
	private String name;//name prefix������ǰ׺
	private String value;
	private String middleName;//�м���
	private String lastName;//����
	private String nameSuffix;//���ֺ�׺
	private String phoneticGivenName;//����ƴ��
	private String phoneticMiddleName;//�м�����ƴ��
	private String phoneticFamilyName;//����ƴ��
	private Map<String, Phone> phone;//�ֻ�
	private Map<String, Email> email;//�����ʼ�
	private Map<String, PostalAddress> postalAddress;//������ַ
	
	//More
	private String notes;//ע��
	private String nickName;//�ǳ�
	private List<String> website;
	private String birthday;//����
	private String anniversary;//������

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
