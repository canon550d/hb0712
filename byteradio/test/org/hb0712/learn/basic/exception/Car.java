package org.hb0712.learn.basic.exception;

public class Car {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Car().run(2, 0);
			System.out.print("我笑");
		} catch (ZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run(int a, int b) throws ZeroException{
		if(b==0){
			throw new ZeroException("分母不能问零");
		}
	}

}
