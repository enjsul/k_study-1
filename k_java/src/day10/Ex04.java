package day10;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1-45���� �迭 ����
		int[] lotto = new int[45];
		// 1-45���� �����Է�
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		// �迭����
		int temp=0;
		int k=0;
		for(int i=0;i<200;i++) {
			k=(int)(Math.random()*45); // �����迭��ȣ ����
			temp = lotto[0];
			lotto[0]=lotto[k];
			lotto[k]=temp;
		}
				
		//���� �ֱ�
		int[] input = new int[6];
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"��° ���ڸ� �Է��ϼ���.(1-45)>>");
			input[i] = scan.nextInt();
		}
		//�Է¼��� ���
		System.out.print("�Է¼��� : ");
		for(int i=0;i<6;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		
		//6�� ������ȣ ���
		System.out.print("�ζǴ�÷��ȣ : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		//�Է��� ���ڿ� �ζǴ�÷��ȣ�� ��ġ�ϴ� ���� ���
		int count=0; //��ġ�ϴ� ����
		int[] bingo = new int[6]; // ��÷��ȣ ����迭
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(input[i]==lotto[j]) {
					bingo[count]=input[i]; //��÷��ȣ ����
					count++;
				}
			}
		}//for
		// ��÷��ȣ,��÷���� ���
		System.out.println("�ζǹ�ȣ ��ġ���� : "+count);
		System.out.print("�ζ���ġ��ȣ : ");
		for(int i=0;i<count;i++) {
			System.out.print(bingo[i]+" ");
		}
		System.out.println();
	}//main
}//class
