package org.hb0712.learn.basic;

/*
 * 1.对象就是传引用
 * 2.原始类型就是传值
 * 3.String类型因为没有提供自身修改的函数，每次操作都是新生成一个String对象，所以要特殊对待。可以认为是传值。
 */
public class LearnQuote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//原始类型
		Integer m = 1;
		Integer n = 2;
		testInteger(m, n);
		System.out.print(m.toString() +" | "+ n);
		
		//对象
		Student t = new LearnQuote().new Student();
		t.setName("张三丰");
		Student t2 = new LearnQuote().new Student();
		t2.setName("张无忌");
		testObject(t, t2);
		System.out.print(t.getName() +" | "+ t2.getName());
		
	}
	
	/*
	 * 分别把参数修改下
	 */
	public static void testInteger(Integer i, Integer ii){
		i++;
		ii--;
	}
	
	public static void testObject(Student i, Student ii){
		i.setName("张三丰，被修改了");
		ii.setName("张无忌，被修改了");
	}
	
	/*
	 * 内部类
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
