package org.hb0712.http.parser;

import java.util.List;
import java.util.Map;

/*
 * ����Ҫ��ӽӿڻ�����ô����������������ԣ�����һ�������Ĺ��̡�
 * һ���ӿ�һ�����ԣ����Ʋ�Ҫ��ȡ��ֱ��ʹ�ýӿڵĵ�ַ���һ��
 */
public class Tags {
	// ��¼��־
	private List<String[]> ursLoginLogStatistic;
	//	�Ƿ�����
	private String isLock;

	// ��û���޸��ܱ�
	private Map<String, String> checkIsModifySecureInfo;

	// ��ѯ�û�����������Լ�����¼ʱ���IP
	private Map<String, String> queryIUserInfo;

	// ���ʼ�
	private Map<String, String[][]> CheckEmailInfo;

	// �ֻ��İ�
	private List<Map<String,String>> queryUserMobInfo;

	// ��ѯURS�˺��޸���Ϣ��¼
	private Map<String, String> queryIUserModifyLog;

	// ��������
	private List<String[]> queryHistorySecureInfo;
	
	//	ע��ص��ʱ��
	private Map<String, String> queryRegTimeAddr;
	
	//	֤����
	private String getIDNumServlet;
	
	// �ʼ���Ϣ
	private Map<String, List<String[]>> mailInfo;
	
	// �ʼ���Ϣ
	private Map<String, List<String[]>> mailInfo2;
	
	// ������������
//	private TagsWorkBill  tagsWorkBill;

	// ��¼�쳣�ӿ�
	private Map<String, String> queryUserLoginException;
	/* -----get and set-------------------------------------------------------------------------- */

	public List<String[]> getUrsLoginLogStatistic() {
		return ursLoginLogStatistic;
	}

	public void setUrsLoginLogStatistic(List<String[]> ursLoginLogStatistic) {
		this.ursLoginLogStatistic = ursLoginLogStatistic;
	}

	public String getIsLock() {
		return isLock;
	}

	public void setIsLock(String isLock) {
		this.isLock = isLock;
	}

	public Map<String, String> getCheckIsModifySecureInfo() {
		return checkIsModifySecureInfo;
	}

	public void setCheckIsModifySecureInfo(
			Map<String, String> checkIsModifySecureInfo) {
		this.checkIsModifySecureInfo = checkIsModifySecureInfo;
	}

	public Map<String, String> getQueryIUserInfo() {
		return queryIUserInfo;
	}

	public void setQueryIUserInfo(Map<String, String> queryIUserInfo) {
		this.queryIUserInfo = queryIUserInfo;
	}

	public Map<String, String[][]> getCheckEmailInfo() {
		return CheckEmailInfo;
	}

	public void setCheckEmailInfo(Map<String, String[][]> checkEmailInfo) {
		CheckEmailInfo = checkEmailInfo;
	}

	public List<Map<String,String>> getQueryUserMobInfo() {
		return queryUserMobInfo;
	}

	public void setQueryUserMobInfo(List<Map<String,String>> queryUserMobInfo) {
		this.queryUserMobInfo = queryUserMobInfo;
	}

	public Map<String, String> getQueryIUserModifyLog() {
		return queryIUserModifyLog;
	}

	public void setQueryIUserModifyLog(Map<String, String> queryIUserModifyLog) {
		this.queryIUserModifyLog = queryIUserModifyLog;
	}

	public List<String[]> getQueryHistorySecureInfo() {
		return queryHistorySecureInfo;
	}

	public void setQueryHistorySecureInfo(List<String[]> queryHistorySecureInfo) {
		this.queryHistorySecureInfo = queryHistorySecureInfo;
	}
	
	public Map<String, String> getQueryRegTimeAddr() {
		return queryRegTimeAddr;
	}

	public void setQueryRegTimeAddr(Map<String, String> queryRegTimeAddr) {
		this.queryRegTimeAddr = queryRegTimeAddr;
	}
	
	public String getGetIDNumServlet() {
		return getIDNumServlet;
	}

	public void setGetIDNumServlet(String getIDNumServlet) {
		this.getIDNumServlet = getIDNumServlet;
	}
	
//	public TagsWorkBill getTagsWorkBill() {
//		return tagsWorkBill;
//	}
//
//	public void setTagsWorkBill(TagsWorkBill tagsWorkBill) {
//		this.tagsWorkBill = tagsWorkBill;
//	}

	public Map<String, List<String[]>> getMailInfo() {
		return mailInfo;
	}

	public void setMailInfo(Map<String, List<String[]>> mailInfo) {
		this.mailInfo = mailInfo;
	}

	public Map<String, String> getQueryUserLoginException() {
		return queryUserLoginException;
	}

	public void setQueryUserLoginException(
			Map<String, String> queryUserLoginException) {
		this.queryUserLoginException = queryUserLoginException;
	}

//	public String toJson(){
//		Gson g=new Gson();
//		return g.toJson(this);
//	}
	
}
