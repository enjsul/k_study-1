package day14;

import java.util.Scanner;

public class Ex1210_01 {

	public static void main(String[] args) {
		// [ ���α׷� ]
		// 1.������
		// 2.���ڸ��߱�
		// ------------
		// ���ϴ� ��ȣ�� �����ϼ���.>>
		Scanner scan = new Scanner(System.in);
		Ex1210_01 e = new Ex1210_01();
		//���ѹݺ�
		loop1:while(true) {
			System.out.println("[���α׷�]");
			System.out.println("1.������");
			System.out.println("2.���ڸ��߱�");
			System.out.println("------------");
			System.out.println("���ϴ� ��ȣ�� �����ϼ���.>>");
			int choice = scan.nextInt();
			//���α׷� ����
			switch(choice) {
			case 1:
				// 1�� -> �޼ҵ� : 2���޾Ƽ� 2,5 -> 2~5�ܱ��� ���
				break;
			case 2:	
				// main���� 2���� ������ �Է¹޾� �޼ҵ�� ����
				System.out.println("[���ڸ��߱�]");
				System.out.println("������ �Է��ϼ���.>>");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				//�޼ҵ�ȣ��-�Ű�����2��
				int result = e.numMatch(Math.min(num1, num2), Math.max(num1, num2));
				System.out.println("��÷��ȣ : "+result);
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}//switch
		}//while
	}//main
	
	int numMatch(int x,int y) {
		Scanner scan = new Scanner(System.in);
		//x -y -> 3 - 105 -> Math.random()*y-(x-1))+x;
		int result = (int)(Math.random()*y-(x-1))+x; //������� ����
		//���ѹݺ�
		int count=0;
		while(true) {
			if(count>=10) {
				System.out.println("��� Ƚ���� ����߽��ϴ�. ���α׷��� �����մϴ�.");
				break;
			}
			System.out.printf("���ϴ� ���ڸ� �Է��ϼ���.(����Ƚ��:%d)>> %n",count+1);
			int num = scan.nextInt();
			if(result>num) {
				System.out.println("�� ū���� �Է��ϼ���.!");
			}else if(result<num) {
				System.out.println("�� �������� �Է��ϼ���.!");
			}else {
				System.out.println("��÷�Ǿ����ϴ�.!");
				break;
			}
			count++;
		}
		return result;
	}

	
	
	
	
}//class
