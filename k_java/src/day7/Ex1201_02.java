package day7;

import java.util.Scanner;

public class Ex1201_02 {

	public static void main(String[] args) {
		
		//45�� �迭 ������
		// �迭�� 1~45 �������ڸ� �����ϰ� ����Ͻÿ�.
		int[] input = new int[45];
		for(int i=0;i<input.length;i++) {
			input[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		
		
		// 1~100������ ���ڸ� �迭�� �����ϰ� ����Ͻÿ�.
//		int[] input = new int[45];
//		
//		for(int i=0;i<input.length;i++) {
//			input[i] = i+1; // 1,2,3....
//		}
//		
//		for(int i=0;i<input.length;i++) {
//			System.out.println(input[i]);
//		}
		
		
		
		// 5�� ���ڸ� �Է¹޾�, �迭�� �����ϰ� �迭�� ����غ�����.
		// 1. 5�� �ݺ��� - for
		// 2. �����Է� 
		// 3. �迭 ���
//		Scanner scan = new Scanner(System.in);
//		int[] input = new int[5];
//		// �����Է�
//		for(int i=0;i<input.length;i++) {
//			System.out.println("���ڸ� �Է��ϼ���.>>");
//			input[i] = scan.nextInt();
//		}
//		//�������
//		System.out.println("[ �Է��� ���� ]");
//		for(int i=0;i<input.length;i++) {
//			System.out.print(input[i]+" ");
//		}
		
//		int[] score = {100,90};
//		for(int i=0;i<score.length;i++) {
//			System.out.println(score[i]);
//		}
//		System.out.println("�迭�� ũ�� : "+score.length);
		
		
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		int e = 0;
//		
//		int[] score = new int[5];
//		score[0] = 100;
//		score[1] = 90;
//		score[2] = 80;
//		score[3] = 70;
//		score[4] = 60;
//		
//		int[] num = {100,90,80,70,60,50,40,30,20,10};
//		
//		int[] input;
//		input = new int[] {100,90,80,70,60};
		
		
		
	}

}
