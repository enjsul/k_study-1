package day13;

import java.util.Scanner;

public class Ex1209_07 {

	public static void main(String[] args) {
		// [ ���α׷� ]
		// 1.������
		// 2.���ڸ��߱�
		//------------
		// ���ϴ� ��ȣ�� �����ϼ���.>>
		// 1�� -> �޼ҵ� : 2���޾Ƽ� 2,5 -> 2~5�ܱ��� ���
		// main 2�� ���� �����Է�: 100 �Ű������� ����
		// -> �޼ҵ� 1-100���� ���� ���߱�-10������ -> return �����
		// main-> ������� ���
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���ڸ� �Է��ϼ���.>>");
		int num = scan.nextInt(); // 1000, 10000, 10
		int random = (int)(Math.random()*num)+1; //1-100

	}

}
