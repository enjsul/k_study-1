package day13;

import java.util.Scanner;

public class Ex1209_03 {

	public static void main(String[] args) {
		// vending machine ���
		// ��ü Drink - ��ǰ��ȣ,�����,�Ǹűݾ�,����,�뷮,����
		// ����3���� �����ؼ� �Է��Ͽ� ����ϴ� ���α׷��� �����Ͻÿ�.
		// ��ǰ��� - ���� ���α׷�����
		Scanner scan = new Scanner(System.in);
		Drink[] drink = new Drink[5];
		for (int i = 0; i < drink.length; i++) {
			drink[i] = new Drink(); // �迭������ ���� ��ü������ ����.

			System.out.println("��ǰ��ȣ�� �Է��ϼ���.>>");
			drink[i].p_num = scan.nextInt(); // ����
			scan.nextLine();
			System.out.println("������� �Է��ϼ���.>>");
			drink[i].drink_name = scan.nextLine();
			System.out.println("�Ǹűݾ��� �Է��ϼ���.>>");
			drink[i].sale_price = scan.nextInt();
			System.out.println("������ �Է��ϼ���.>>");
			drink[i].cost = scan.nextInt();
			System.out.println("�뷮�� �Է��ϼ���.>>");
			drink[i].size = scan.nextInt();
			System.out.println("������ �Է��ϼ���.>>");
			drink[i].quantity = scan.nextInt();
		}

		// ȭ����� - 3���� ȸ������ ���
		System.out.println("[ ��ǰ���� ]");
		for (int i = 0; i < drink.length; i++) {
			System.out.printf("%d %s %d %d %d %d %n", drink[i].p_num,
					drink[i].drink_name,drink[i].sale_price,drink[i].cost,drink[i].size
					,drink[i].quantity);
		}

		// 1 ����ݶ� 1000 300 500 10
		// 2 �̶��� 800 200 500 20
		// 3 ������ 900 250 500 10
		// 4 ���ڿ� 1000 300 500 10
		// 5 ���Ǵ� 1200 320 500 10

		// [ ���Ǳ� ���α׷� ]
		// 1.����ݶ� 2.�̶��� 3.������ 4.���ڿ� 5.���Ǵ� 8.�������� 9.�����ڸ޴�
		// �����ڸ޴� - 1.��ǰ��� 2.�Ǹŷ� 3.���� 4.������

	}

}
