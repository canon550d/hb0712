package org.hb0712.http.parser;

import java.util.List;
import java.util.Map;

/*
 * 将来要添加接口或者怎么样，给这里添加属性，这是一个很愉快的过程。
 * 一个接口一个属性，名称不要另取，直接使用接口的地址最后一段
 */
public class Tags {
	// 登录日志
	private List<String[]> ursLoginLogStatistic;
	//	是否锁定
	private String isLock;

	// 有没有修改密保
	private Map<String, String> checkIsModifySecureInfo;

	// 查询用户的相关资料以及最后登录时间和IP
	private Map<String, String> queryIUserInfo;

	// 查邮件
	private Map<String, String[][]> CheckEmailInfo;

	// 手机的绑定
	private List<Map<String,String>> queryUserMobInfo;

	// 查询URS账号修改信息记录
	private Map<String, String> queryIUserModifyLog;

	// 曾用密码
	private List<String[]> queryHistorySecureInfo;
	
	//	注册地点和时间
	private Map<String, String> queryRegTimeAddr;
	
	//	证件号
	private String getIDNumServlet;
	
	// 邮件信息
	private Map<String, List<String[]>> mailInfo;
	
	// 邮件信息
	private Map<String, List<String[]>> mailInfo2;
	
	// 工单来的数据
//	private TagsWorkBill  tagsWorkBill;

	// 登录异常接口
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
