package day10;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 456.1257
		// 1.round->�ݿø� 2.ceil->�ø� 3.floor->����

		// [ �Ǽ�ó�� ���α׷� ]
		// 1.�ݿø�
		// 2. �ø�
		// 3. ����
		// �ϰ� ���� ��ȣ�� �Է��ϼ���>> 3
		// ������ �����ϼ̽��ϴ�. ���ڸ� �Է��ϼ���.>> 456.1257
		// 2�ڸ����� ���� ����� : 456.1

		String[] name = {"0","�ݿø�","�ø�","����"};
		System.out.println("[ �Ǽ�ó�� ���α׷� ]");
		System.out.println("1. �ݿø�");
		System.out.println("2. �ø�");
		System.out.println("3. ����");
		System.out.println("�ϰ� ���� ��ȣ�� �Է��ϼ���>>");
		int choice = scan.nextInt();
		double input=0;
		double result=0;
		System.out.println(name[choice]+"�� �����ϼ̽��ϴ�. ���ڸ� �Է��ϼ���.>>");
		input = scan.nextDouble();
		switch (choice) {
		case 1:
			result = (Math.round(input * 10)) / 10.0;
			break;
		case 2:
			result = (Math.ceil(input * 10)) / 10.0;
			break;

		case 3:
			result = (Math.floor(input * 10)) / 10.0;
			break;
		}
		
		System.out.println(result);
		

	}

}
