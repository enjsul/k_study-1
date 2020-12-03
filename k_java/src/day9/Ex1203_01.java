package day9;

import java.util.Scanner;

public class Ex1203_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 9,5 �迭 ����
		String[][] score = new String[9][5];
		// 1�����迭����(1-45���� ����)
		String[] arr = new String[45];
		for (int i = 0; i < 45; i++) {
			arr[i] = "" + (i + 1); // ���ڿ��Է�
			// ""+0+1
		}
		// 1�����迭 ����
		String temp = "";
		int k = 0;
		for (int i = 0; i < 200; i++) {
			k = (int) (Math.random() * 45);
			temp = arr[0];
			arr[0] = arr[k];
			arr[k] = temp;
		}
		// 2. �������� �Է� (�ߺ��Ұ�) 1-45���� �����Է�
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = arr[5 * i + j]; // 0-44 -> 45��
				// score[i][j] =""+5*i+j+1;
				// score[i][j] =""+(int)(Math.random()*50)+1;
			}
		}
		
		// ��ǥ�Է�,��� ���ѹݺ�
		while(true) {
			// ��ǥ ��½� ��� ǥ��
			System.out.println("\t\t" + "[ ��ǥȮ�� ���α׷� ]");
			for (int i = 0; i < 5; i++) {
				System.out.print("\t" + "[" + i + "]");
			}
			System.out.println();
			System.out.println("--------------------------------------------");
			// ���
			for (int i = 0; i < 9; i++) {
				System.out.print("[" + i + "]|" + "\t");
				for (int j = 0; j < 5; j++) {
					System.out.print(score[i][j] + "\t");
				}
				System.out.println();
			}

			// 3. ��ǥ�Է�
			System.out.println("X��ǥ�� �Է��ϼ���.(X��ǥ:0-9,����:-1)>>");
			int x = scan.nextInt();
			// ���� üũ
			if(x==-1) {
				System.out.println("���α׷��� �����մϴ�!");
				break;
			}
			// 0-9���� �� ���� �Է�üũ
			if(x<=-2 && x>=10) {
				System.out.println(x+" ���� 0-9������ ������ �ƴմϴ�. �ٽ��Է��ϼ���!");
				continue;
			}
			System.out.println("Y��ǥ�� �Է��ϼ���.(Y��ǥ:0-4)>>");
			int y = scan.nextInt();
			// 0-4������ ���� �Է�üũ
			if(x<0 && x>4) {
				System.out.println(y+" ���� 0-4������ ������ �ƴմϴ�. �ٽ��Է��ϼ���!");
				continue;
			}

			// ���ڸ� x�� �����ϴ� ����
			loop1: for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 5; j++) {
					if (x == i && y == j) {
						// xǥ�� �� �� üũ�ϴ� ����
						if(score[i][j].equals("X")) {
							System.out.println("�Է��Ͻ� ��ǥ�Դϴ�. �ٽ� �Է����ּ���.!");
							break loop1;
						}
						score[i][j] = "X";
						break loop1;
					}
				}
			}//for
			
		}//while

	}//main

}//class
