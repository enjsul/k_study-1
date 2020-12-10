package day14;

import java.util.Scanner;

public class Ex1210_07 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// ��ü Drink - ��ǰ��ȣ,�����,�Ǹűݾ�,����,�뷮,����
		// ����3���� �����ؼ� �Է��Ͽ� ����ϴ� ���α׷��� �����Ͻÿ�.
		Drink[] drink = new Drink[2]; //��ü�迭
		loop1:while(true) {
			int choice = main_print(); //ȭ�����
			switch(choice) {
			
			case 1://����ݶ�
				System.out.printf("%s %d���� ���ŵǾ����ϴ�. %n",drink[0].drink_name,drink[0].sale_price);
				break;
			case 6:
				System.out.println("[��ǰ���]");
				pro_input(drink); //��ǰ���-�޼ҵ�ȣ��
				break;
			case 7:
				pro_print(drink);
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.!");
				break loop1;
			}//switch
		}//while
		
		// 1 ����ݶ� 1000 300 500 10
		// 2 �̶��� 800 200 500 20
		// 3 ������ 900 250 500 10
		// 4 ���ڿ� 1000 300 500 10
		// 5 ���Ǵ� 1200 320 500 10

		// [ ���Ǳ� ���α׷� ]
		// 1.����ݶ� 2.�̶��� 3.������ 4.���ڿ� 5.���Ǵ� 8.�������� 9.�����ڸ޴�
		// ------------------------------------------------------
		// �����ϰ� ���� ���Ḧ �����ϼ���.>> 1
		// ����ݶ� 1000���� ���ŵǾ����ϴ�.
		//
		// �����ڸ޴� - 1.��ǰ��� 2.�Ǹŷ� 3.���� 4.������ -
		// ���Ǹŷ�, ������ �Ǹŷ�, ���Ǹűݾ�, ������ �Ǹűݾ�, ����

	}//main
	
	// ��ǰ���
	static void pro_print(Drink[] drink) {
		System.out.println("[ ��ǰ���� ]");
		for (int i = 0; i < drink.length; i++) {
			System.out.printf("%d %s %d %d %d %d %n", drink[i].p_num, drink[i].drink_name, drink[i].sale_price,
					drink[i].cost, drink[i].size, drink[i].quantity);
		}
	}
	
	//���Ǳ����α׷� ȭ�����
	static int main_print() {
		System.out.println("[ ���Ǳ� ���α׷� ]");
		System.out.println("1.����ݶ� 2.�̶���   3.������    4.���ڿ�    5.���Ǵ� ");
		System.out.println("6.��ǰ��� 7.��ǰ��� 8.��������   9.�����ڸ޴� 0.���� ");
		System.out.println("------------------------------------------------------");
		System.out.println("�����ϰ� ���� ���Ḧ �����ϼ���.>>");
		int choice = scan.nextInt();
		return choice;
	}
	
	//��ǰ�Է� �޼ҵ�
	static void pro_input(Drink[] drink) { //��ü�迭
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
		}//for
	}//pro_input
	
	
	
	
	
	
	
	

}//class
