package org.hb0712.learn.patterns.proxy;

public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject rs = new RealSubject();
		Subject ps = new ProxySubject2(rs);
		Subject ps2 = new ProxySubject(ps);
		//可以继续代理下去...
		ps2.reuqest();
	}

}
