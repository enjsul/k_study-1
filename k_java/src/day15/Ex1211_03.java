package day15;

public class Ex1211_03 {

	public static void main(String[] args) {
		TestClass.classv=5; // Ŭ��������
		TestClass.stMethod(); // Ŭ���� �޼ҵ�� �ٷ� ���
		
		TestClass tc = new TestClass();
		tc.instv=10; //�ν��Ͻ�����
		tc.inMethod(); //�ν��Ͻ� �޼ҵ�� �ݵ�� ��ü������ ���� ��밡��

	}

}
