package org.hb0712.tools.path.impl;

import java.util.Calendar;

import org.hb0712.tools.path.Path;

public class PathByTime implements Path {

	public String getPath() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		Calendar calendar = Calendar.getInstance();
		sb.append(calendar.get(Calendar.YEAR)).append("/");
		sb.append(calendar.get(Calendar.MONTH)+1).append("/");
		sb.append(calendar.get(Calendar.DATE)).append("/");
		return sb.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PathByTime().getPath());
	}

}
