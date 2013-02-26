package org.hb0712.learn.basic;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> names = new HashSet<String>();
		names.add("xie yang");
		names.add("wang xiao hua");
		names.add("chen guan xi");
		
		Set<Integer> phone = new TreeSet<Integer>();
		phone.add(1000);
		phone.add(10);
		phone.add(100);
		System.out.println(phone);
	}

}
