package day14;

public class Ex1210_03 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		t1.hour=5;
		t2.hour=10;
		System.out.println("t1 : "+t1.hour); //5
		System.out.println("t2 : "+t2.hour); //10
		t1.hour=7;
		t2=t1;  // 
		t2.hour=8;
		System.out.println("t1 : "+t1.hour); 
		// 1.5  2.7-����,����  3.8-����,�ǿ�,��ǥ,��ȣ,����  4.10
		t1.hour=20;
		System.out.println(t2.hour);
		

	}

}
