package day15;

public class Ex1211_02 {

	public static void main(String[] args) {
		// Ŭ���� �޼ҵ忡 300L,200L ���
		System.out.println(MyMath2.add(300L,200L));
		// �ν��Ͻ� �޼ҵ忡 50L,10L�� �ְ� ����� �غ�����.
		MyMath2 m = new MyMath2();
		m.a=50L;
		m.b=10L;
		System.out.println(m.add());
		

	}

}
