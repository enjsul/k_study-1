package day6;

import java.util.Scanner;

public class Ex1130_05 {

	public static void main(String[] args) {
		
		// 1. ���ڸ� 2�� �Է¹޾�, 
		// 2.�������� ���
		// ù��° ���ڴ� 5�� �Է¹����� 2���� 5�ܱ��� ���
		// �ι�° ���ڴ� 3�̸� ->  5*1=5 5*2=10 5*3=15
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2�ܿ��� ����� �ܼ��ڸ� �Է��ϼ���.>>");
		int input1 = scan.nextInt();
		System.out.println("�ܿ��� ����ϰ� ���� ���ڸ� �Է��ϼ���.>>");
		int input2 = scan.nextInt();
		
		for(int i=2;i<=input1;i++) {  //�����
			System.out.println("[ "+i+"�� ]");
			for(int j=1;j<=input2;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		
		
		
		// ���ڸ� �Է¹޾�
		// �������� ����ϴµ�
		// 5�� �Է��ϸ� -> 5�ܸ� ��µɼ� �ֵ��� �غ�����.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("������ ���� �Է��ϼ���.>>");
//		int start=0,end=0; //����
//		int input1 = scan.nextInt();  // 5
//		System.out.println("����ϰ� ���� ���� �Է��ϼ���.>>");
//		int input2 = scan.nextInt();  // 3
//		//3,4,5
//		start = Math.max(input1, input2);
//		end = Math.min(input1, input2);
//		
//		if(input1<=input2) {
//			start = input1;
//			end = input2;
//		}else {
//			start = input2;
//			end = input1;
//		}
//		
//		for(int i=start;i<=end;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
		
		
		// 1~100���� ���ڸ� ���ߴ� ����
		// 2. �Է¼��� �Է��� ����
		// 3. �������ڿ� �Է¼��ڰ� �´��� ��
		//    - �Է¼��ڰ� ũ�� �������� �Է��ϼ���. ������ ū ���ڸ� �Է��ϼ���. ������ ���α׷� ����   
		// 4. ���������� ���ѹݺ�
		// 4-1. 5���� �ݺ�, ���� ���α׷� ����
		// 5. �Է��� ���� ���, �������� ���
		
//		Scanner scan = new Scanner(System.in);
//		// 1. 1~100���� ���� ���ڸ� ����
//		int r_num = (int)(Math.random()*100)+1;
//		String result="";
//		int count=0;
//		// ���ѹݺ�
//		while(true) {
//			if(count<5) {
//				// ���α׷� ����
//				System.out.println("���ڸ� �Է��ϼ���.>>");
//				int input = scan.nextInt();
//				
//			    result = result +" "+input;
//				if(r_num>input) {
//					System.out.println("�� ū���� �Է��ϼ���.!");
//				}else if(r_num<input) {
//					System.out.println("�� �������� �Է��ϼ���.!");
//				}else {
//					System.out.println("�����Դϴ�.");
//					break;
//				}
//			}else {
//				// ���α׷� ����
//				System.out.println("���α׷��� �����մϴ�.!");
//				break;
//			}
//		}
//		System.out.println("�Է¼��� : "+result);
//		System.out.println("�������� : "+r_num);
			
			
			
			
		
		
		
		
		
		
		
		
		

	}

}
