package day9;

import java.util.Scanner;

public class Ex1203_03 {

	public static void main(String[] args) {
		// ��ȣ, ����, ����, ����, �հ� - 3��
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][5];
		String[] title = {"��ȣ","����","����","����","�հ�"};
		
//		int[][] score = {
//			{1,100,100,100,300},{2,90,90,90,270},
//			{3,80,80,80,240}
//		};
		
		// 3�� ���� �Է�
		for(int i=0;i<score.length;i++) {
			System.out.println("["+(i+1)+"��° �Է� ]");
			score[i][0] = i+1;
			System.out.println("���������� �Է����ּ���.>>");
			score[i][1] = scan.nextInt();
			System.out.println("���������� �Է����ּ���.>>");
			score[i][2] = scan.nextInt();
			System.out.println("���������� �Է����ּ���.>>");
			score[i][3] = scan.nextInt();
			score[i][4] = score[i][1]+score[i][2]+score[i][3];
		}
		
		// ������
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		// �迭���
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
