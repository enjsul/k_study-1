package day13;

import java.util.Scanner;

public class Ex1209_05 {

	public static void main(String[] args) {
		Ex1209_05 e = new Ex1209_05();  //Ex1209_05 ��ü����
		Scanner scan = new Scanner(System.in);
		int choice=0;
		while(true) {
			choice = e.print();  // ȭ����� �޼ҵ� - choice���� ����
			switch(choice) {
			case 1:
				e.add();  //���ϱ� �޼ҵ�ȣ��
				break;
			case 2:
				//e.subtract() - ����
				break;
			case 3:
				//e.multiply() - ���ϱ�
				break;
			case 4:
				//e.division() - ������
				break;
			case 5:
				//max() - �ִ밪 
				break;
			case 0:
				//����
				break;	
			}//switch
		}//while
	}//main
	
	int print() {
		Scanner scan = new Scanner(System.in);
		System.out.println("[ ���α׷� ]");
		System.out.println("1.���ϱ� ");
		System.out.println("2.���� ");
		System.out.println("3.���ϱ� ");
		System.out.println("4.������ ");
		System.out.println("5.�ִ밪���ϱ� ");
		System.out.println("0.���� ");
		System.out.println("----------------- ");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>> ");
		int choice=scan.nextInt();
		return choice;
	}
	
	
	void add() {
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0,result=0;
		System.out.println("[���ϱ� ���α׷�]");
		System.out.println("���ϱ� �� 1��° ���ڸ� �Է��ϼ���.>>");
		num1 = scan.nextInt();
		System.out.println("���ϱ� �� 2��° ���ڸ� �Է��ϼ���.>>");
		num2 = scan.nextInt();
		result = num1+num2;
		System.out.printf("%d + %d = %d %n",num1,num2,result);
	}
	

}
