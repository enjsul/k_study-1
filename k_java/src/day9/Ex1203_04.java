package day9;

import java.util.Scanner;

public class Ex1203_04 {

	public static void main(String[] args) {
		// �迭[5,5]
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[1][5]; //5,5
		double[] avg = new double[5];
		String[] title = {"��ȣ","�̸�","����","����","����","�հ�","���"};
		
		// ������ �Է�
		for(int i=0;i<score.length;i++) {
			System.out.println("��ȣ�� �Է��ϼ���.>>");
			score[i][0] = scan.nextInt();
			System.out.println("�̸��� �Է��ϼ���.>>");
			name[i] = scan.next();
			System.out.println("���������� �Է��ϼ���.>>");
			score[i][1] = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			score[i][2] = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			score[i][3] = scan.nextInt();
			score[i][4] = score[i][1]+score[i][2]+score[i][3];
			avg[i] = score[i][4]/3.0;
		}
		
		//��� ���
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("------------------------------------");
	    //score ���
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				if(j==0) { //�̸����
					System.out.print(name[i]+"\t");
				}
			}
			//��հ� ���
			System.out.printf("%.2f\t",avg[i]);
			System.out.println();
		}
		
		
		
		
	}//main

}//class
