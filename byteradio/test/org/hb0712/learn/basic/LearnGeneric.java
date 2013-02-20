package org.hb0712.learn.basic;


/*
 * 关于泛型的练习
 */
public class LearnGeneric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]={1,2,3,4};
        test1(arr,0,2);
        for(int ar:arr){
            System.out.println(ar);
        }
        
        Human<String> h = new LearnGeneric().new Human<String>();
        h.setName("地球人");
        String result = h.sayHello("这里只能用字符串");
        System.out.print(result);
	}
	
	/*
	 * 一个泛型方法
	 * Java程序中的普通方法、构造方法和静态方法中都可以使用泛型。方法使用泛形前，必须对泛形进行声明，语法：<T> ，T可以是任意字母，但通常必须要大写。<T>通常需放在方法的返回值声明之前。例如：
	 * public static <T> void doxx(T t);
	 */
	public static <T> void test1(T arr[], int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/*
	 * 一个泛型对象
	 * 
	 * 回忆下List这个泛型对象，new的时候就需要指定类型，Human不过是照葫芦画瓢
	 */
	public class Human<T>{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public T sayHello(T t){
			System.out.print(new StringBuffer().append(name).append("：").append(t).toString());
			return t;
		}
		
	}

}
