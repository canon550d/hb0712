package org.hb0712.tools.path.impl;

import java.util.Random;

import org.hb0712.tools.path.Path;

/*
 * ��ʱ������ļ�Ŀ¼��ȱ���ǿ��ܳ���ĳ�켸���ļ���ĳ��һ���ļ������������ſ��Ա���������������֡�
 * 256ֻ��һ������
 */
public class PathByRandomNumber implements Path{
	private int i = 1;
	private final int number = 256;

	public PathByRandomNumber(){
		// TODO Auto-generated method stub
	}

	public PathByRandomNumber(int i){
		this.i = i;
	}

	public String getPath() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		Random random = new Random();

		int key = random.nextInt(number);
		
		int j;
		for(j = 0;j<i;j++){
			sb.append(key % 256).append("/");
			key = random.nextInt(number);
		}

		return sb.toString();
	}

	/*
	 * 
	 */
	public static void main(String[] args){
		System.out.println(new PathByRandomNumber(10).getPath());
	}

}
