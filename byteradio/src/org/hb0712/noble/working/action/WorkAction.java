package org.hb0712.noble.working.action;

import org.hb0712.noble.working.pojo.WorkStands;

import com.opensymphony.xwork2.ActionSupport;

public class WorkAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private WorkStands workStands;
	
	public WorkStands getWorkStands() {
		return workStands;
	}

	public void setWorkStands(WorkStands workStands) {
		this.workStands = workStands;
	}

	/*
	 * 
	 */
	public String view(){
		this.workStands = new WorkActionTest().init();
		return SUCCESS;
	}
}
