package org.hb0712.learn.basic;

/*
 * 1.������Ǵ�����
 * 2.ԭʼ���;��Ǵ�ֵ
 * 3.String������Ϊû���ṩ�����޸ĵĺ�����ÿ�β�������������һ��String��������Ҫ����Դ���������Ϊ�Ǵ�ֵ��
 */
public class LearnQuote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ԭʼ����
		Integer m = 1;
		Integer n = 2;
		testInteger(m, n);
		System.out.print(m.toString() +" | "+ n);
		
		//����
		Student t = new LearnQuote().new Student();
		t.setName("������");
		Student t2 = new LearnQuote().new Student();
		t2.setName("���޼�");
		testObject(t, t2);
		System.out.print(t.getName() +" | "+ t2.getName());
		
	}
	
	/*
	 * �ֱ�Ѳ����޸���
	 */
	public static void testInteger(Integer i, Integer ii){
		i++;
		ii--;
	}
	
	public static void testObject(Student i, Student ii){
		i.setName("�����ᣬ���޸���");
		ii.setName("���޼ɣ����޸���");
	}
	
	/*
	 * �ڲ���
	 */
	public class Student{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
}
