package day9;

import java.util.Scanner;

public class Ex1203_06 {

	public static void main(String[] args) {
		// 3���� �л��� ������ �Է¹޾�
		// int �迭, String�迭 2������, double�迭 ����
		// ��ȣ,�̸�,����,����,����,�հ�,��� ����Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][5]; //�л�:3 ��ȣ,����,����,����,�հ�,:5
		String[] title = {"��ȣ","�̸�","����","����","����","�հ�","���","���"};
		String[] name = new String[3]; //�̸�
		double[] avg = new double[3];  //���
		
		
		// �������Է�
		//1. ��ȣ,�̸�,����,����,���� -> �հ�,���,��� �ڵ����� �Է�
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d��° ��ȣ�� �Է��ϼ���.>>%n",i+1);
			score[i][0] = scan.nextInt(); // 1, enter
			scan.nextLine();
			System.out.println("�̸��� �Է��ϼ���.>>");
			name[i] = scan.nextLine(); 
			System.out.println("���������� �Է��ϼ���.>>");
			score[i][1] = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			score[i][2] = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			score[i][3] = scan.nextInt();
			score[i][4] = score[i][1]+score[i][2]+score[i][3];
			avg[i] =score[i][4]/3.0;
		}
		// ���
		int[] rank = new int[3];       //���
		for(int i=0;i<score.length;i++) {
			int level=1;
			for(int j=0;j<score.length;j++) {
				if(score[i][4]<score[j][4]) {
					level++;
				}
			}
			rank[i] = level;  // 2
		}
		// ������ - 7��
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		
		// ������ ���
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");//��ȣ,����,����,����,�հ�
				// �̸�
				if(j==0) {
					System.out.print(name[i]+"\t");
				}
			}
			//������
			System.out.printf("%.2f\t",avg[i]);
			//������
			System.out.print(rank[i]+"\t");
			System.out.println();
		}

	}

}
