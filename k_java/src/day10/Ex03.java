package day10;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// �������� 1-100
		// 10�������� ���� -> �Է��� ���� ���
		Scanner scan = new Scanner(System.in);
		int random_num = (int)(Math.random()*100)+1;
		int[] arr = new int[10]; //�Է�����迭
		//���� �ݺ�
		int count=1;
		while(true) {
			// 10�� ��
			if(count>10) {
				System.out.println("10���� �Ѿ ���α׷��� �����մϴ�.");
				break;
			}
			// �����Է�
			System.out.println("���ڸ� �Է��ϼ���.(1-100����)>>");
			int input = scan.nextInt();
			arr[count-1]=input; // �迭�� �Է��� ���� ����
			// �������ڿ� �Է¼��� ��
			if(random_num>input) {
				System.out.println("�� ū���ڸ� �Է��Ͻÿ�!!");
			}else if(random_num<input) {
				System.out.println("�� ���� ���ڸ� �Է��Ͻÿ�!!");
			}else {
				System.out.println("�����Դϴ�!!");
				break;
			}
			count++; //1�� ����
		}
		// �Է��� �迭 ���
		for(int i=0;i<count;i++) {
			System.out.printf("�Է��� ���� : %d %n ",arr[i]);
		}
		// ����� ���
		System.out.println("���� ���� : "+random_num);

	}

}
