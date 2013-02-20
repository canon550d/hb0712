package org.hb0712.learn.basic;


/*
 * ���ڷ��͵���ϰ
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
        h.setName("������");
        String result = h.sayHello("����ֻ�����ַ���");
        System.out.print(result);
	}
	
	/*
	 * һ�����ͷ���
	 * Java�����е���ͨ���������췽���;�̬�����ж�����ʹ�÷��͡�����ʹ�÷���ǰ������Է��ν����������﷨��<T> ��T������������ĸ����ͨ������Ҫ��д��<T>ͨ������ڷ����ķ���ֵ����֮ǰ�����磺
	 * public static <T> void doxx(T t);
	 */
	public static <T> void test1(T arr[], int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/*
	 * һ�����Ͷ���
	 * 
	 * ������List������Ͷ���new��ʱ�����Ҫָ�����ͣ�Human�������պ�«��ư
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
			System.out.print(new StringBuffer().append(name).append("��").append(t).toString());
			return t;
		}
		
	}

}
