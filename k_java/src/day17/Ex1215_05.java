package day17;

import java.util.Scanner;

public class Ex1215_05 {

	public static void main(String[] args) {
		// [ ������� ���α׷� ] - ����20�� ����
		// s001 1.����ݶ�-p001 2.�̶���-m001 3.������-o001 4.���ڿ�-d001
		// ����ݶ�
		int s_count=0;
		int p_count=0;
		Scanner scan = new Scanner(System.in);
		Drink[] d = new Drink[100]; // d[0] d[1] d[2]....d[19]
		
		//�Է�
		for(int i=0;i<10;i++) {
			System.out.println("[ �������� ���α׷� ]");
			System.out.println("1.����ݶ� 2.�̶��� 3.������ 4.���ڿ�");
			System.out.println("-----------------------------");
			System.out.println((i+1)+"��° �������� ��ȣ�� �Է��ϼ���.>>");
			int choice = scan.nextInt();
			String drink_name="";
			switch(choice) {
			case 1:
				drink_name = "����ݶ�"; //����ݶ�
				break;
			case 2:
				
				break;
			}
			d[i] = new Drink(drink_name);
		}
		
		
		//���
		for(int i=0;i<10;i++) {
			System.out.print(d[i].serialNo+"\t");
			System.out.print(d[i].p_num+"\t");
			System.out.print(d[i].drink_name+"\t");
			System.out.print(d[i].sale_price+"\t");
			System.out.print(d[i].cost+"\t");
			System.out.println();
		}
		
		

		// 1.����ݶ� 2.�̶��� 3.������ 4.���ڿ� 5.���Ǵ�
		// ��� 5������, �̶��� 1��, ������ 7��, ���ڿ� 5��,���Ǵ� -2��
		// 1 ����ݶ� 1000 300
		// 2 �̶��� 800 200
		// 3 ������ 900 250
		// 4 ���ڿ� 1000 300

		// ��� �����ϰ� ����Ͻÿ�.

		// ���� �� �Ǹűݾ� ����Ͻÿ�.

	}

}
