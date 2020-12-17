package day19;

import java.util.Scanner;

public class Ex1217_06 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Lotto b = new Lotto(); 
		loop1:while(true) {
			switch(print()) {
			case 1:
				System.out.println("[ ��6�� ���� ]");
				b.pick6();
				break;
			case 2:
				System.out.println("[ ������ ]");
				b.shuffle();
				break;
			case 3:
				System.out.println("[ ��ü ���� ]");
				b.output();
				break;
			case 4:
				System.out.println("[ �� 1�� ���� ]");
				b.pick();
				break;	
			case 0:
				System.out.println("[ ���α׷� ���� ]");
			    break loop1;
			}//switch
		}//while
		
	}//main
	
	static int print() {
		System.out.println("[ �ζ� ���� ]");
		System.out.println("1. ��6�� ����");
		System.out.println("2. ������");
		System.out.println("3. ��ü ����");
		System.out.println("4. �� 1�� ����");
		System.out.println("0. ����");
		System.out.println("-----------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
		int choice = scan.nextInt();
		return choice;
	}

}//class
