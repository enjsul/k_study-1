package day7;

import java.util.Scanner;

public class Ex1201_05 {

	public static void main(String[] args) {
		
		// 6�� ���� �Է�(�迭) : 10 20 30 40 42 45
		// �ζǹ�ȣ 6�� ��� : 1 3 5 8 6 21
		// �´¼��ڰ� ����� Ȯ���غ�����.
		
		Scanner scan = new Scanner(System.in);
		int[] lotto_in = new int[6];
		int input=0;
		//�����Է�
		loop1: for(int i=0;i<6;i++) {
			System.out.println((i+1)+"��° ���ڸ� �Է��ϼ���.>>");
			input = scan.nextInt();
			
			//���� �Է��� ���ڿ� ��
			for(int j=0;j<lotto_in.length;j++) {
				if(lotto_in[j]==input) {
					System.out.println(input+"��(��) �Է��Ͻ� �����Դϴ�. �ٽ��Է��ϼ���!");
					i--;
					continue loop1;
				}
			}
			
			//1-45���� ���� ���� üũ
			if(input>=1 && input<=45) {
				lotto_in[i] = input;
			}else {
				System.out.println(input+"��(��) ���� ���� ���ڸ� �Է��ϼ̽��ϴ�.");
				i--;
			}
		} //for
		
		//�ζǹ�ȣ ����
		int[] ball = new int[45];
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		//�ζǹ�ȣ ����
		int temp = 0;
		int j=0;
		
		for(int i=0;i<200;i++) {
			j = (int)(Math.random()*45); //0-44
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		//�ζǹ�ȣ
		System.out.println("[ �ζ� ��÷��ȣ ]");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		//�Է¼���
		System.out.println("[ �ζ� �Է� ���� ]");
		for(int i=0;i<6;i++) {
			System.out.print(lotto_in[i]+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
		// 1~~100������ ���� �迭�� ����
		// �������� ��� 6���� ����غ�����.
		
		// 1. 1-100���� �迭����
		// 2. �迭�� ���ڳֱ�
		// 3. �迭 ����
		//    - ��������, ��������, ��ġ����   
		// 4. �迭 ���
		
//		int[] ball = new int[100];
//		for(int i=0;i<ball.length;i++) {
//			ball[i] = i+1;
//		}
//		
//		int temp=0;
//		int j=0;
//		
//		for(int i=0;i<400;i++) {
//			j = (int)(Math.random()*100);
//			temp = ball[0];
//			ball[0] = ball[j];
//			ball[j] = temp;
//		}
//		
//		for(int i=0;i<6;i++) {
//			System.out.println(ball[i]);
//		}

	}

}
