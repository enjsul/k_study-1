package day7;

import java.util.Scanner;

public class Ex1201_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char choice = ' ';

		loop1: while (true) {
			System.out.println("---------------------");
			System.out.println("   total ���α׷� ����");
			System.out.println("---------------------");
			System.out.println(" 1.����ó�� ��� Ȯ�� ���α׷�");
			System.out.println(" 2.������ ���α׷� ");
			System.out.println(" 3.���ڸ��߱� ���α׷�");
			System.out.println(" 4.�ζ� ���α׷�");
			System.out.println("---------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(����:x)>>");
			choice = scan.next().charAt(0);
			switch (choice) {
			case '1':
				System.out.println("[ ����ó�� ��� Ȯ�� ]");
				break;
				
				
				
			case '2':
				System.out.println("[ ������ ���α׷� ]");
				
				
				
				
				break;
				
				
				
			case '3':
				System.out.println("[ ���ڸ��߱� ���α׷� ]");
				System.out.println("* 1-100���� ���ڸ� ���ߴ� �����Դϴ�!");
			    
				num_loop1: while(true) { // ���ڸ��߱� ���α׷� ���ѹݺ�
			    	int r_num = (int)(Math.random()*100)+1; //��������
			    	
			    	while(true) { // �������α׷��� ���ѹݺ�
			    		System.out.println("���ϴ� ���ڸ� �Է��ϼ���.(����ȭ��:-1)>>");
			    		int input_num=scan.nextInt();
			    		if(input_num==-1) {
			    			System.out.println("����ȭ������ �̵��մϴ�!");
			    			break num_loop1;
			    		}
						if(r_num>input_num) {
							System.out.println("�� ū ���ڸ� �Է��ϼ���!");
						}else if(r_num<input_num) {
							System.out.println("�� ���� ���ڸ� �Է��ϼ���!");
						}else {
							System.out.println("�����Դϴ�.");
							break;
						}
					}//while
					System.out.println("���� ���� : "+r_num);
					
					
					
			    }//while:num_loop1
				break;
			case 4:
				System.out.println("[ �ζ� ���α׷� ]");
				break;
			case 'x':
			case 'X':
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.>>");
				break;
			}

		}
	}//main

}//class
