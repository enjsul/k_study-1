package day8;

import java.util.Scanner;

public class Ex1202_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ��������
		int[] arr = new int[45];
		String[][] score = new String[9][5];
		int temp = 0; // �迭���⿡�� �迭�� �ӽ����� ����
		int k = 0; // �������� ����
		// 1�����迭 1-45���� ����
		for (int i = 0; i < 45; i++) {
			arr[i] = i + 1;
		}
		// �迭 ����
		for (int i = 0; i < 200; i++) {
			k = (int) (Math.random() * 45); // 0-44
			temp = arr[0];
			arr[0] = arr[k];
			arr[k] = temp;
		}

		// 2�����迭 �Է�
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = "" + arr[(5 * i) + j]; // temp_s[0-44]
			}
		}

		// ���ѹݺ�
		while (true) {
			// ���α׷� ���� �˸�
//			System.out.println("��ǥ�� ǥ�� ���α׷��� �����Ͻðڽ��ϱ�?(1:yes,0:no)");
//			int result = scan.nextInt();
//			if(result==0) {
//				System.out.println("���α׷��� �����մϴ�!");
//				break;
//			}

			// �����¿�
			for (int i = 0; i < 5; i++) {
				System.out.print("\t" + "[" + i + "]");
			}
			System.out.println();
			System.out.println("--------------------------------------------");

			// 2�����迭 ���
			for (int i = 0; i < 9; i++) {
				System.out.print("[" + i + "]" + "\t"); // ��¿�
				for (int j = 0; j < 5; j++) {
					System.out.print(score[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println("[ ��ǥǥ�� ���α׷� ]");
			System.out.println("X ��ǥ���� �Է��ϼ���.(�Է°�:0-8)>>");
			int x = scan.nextInt();
			System.out.println("Y ��ǥ���� �Է��ϼ���.(�Է°�:0-4)>>");
			int y = scan.nextInt();
			int check = 0;
			check_loop1: for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 5; j++) {
					if (x == i && y == j) {
						score[i][j] = "X";
						check = 1;
						break check_loop1;
					}
				}
			}

			if (check == 0) {
				System.out.println("�Է��� ��ǥ�� �����ϴ�. �ٽ� �Է��ϼ���!");
			}

			// ��ǥ�� �Է�
//			System.out.println("��ǥ���� �˰� ���� ���ڸ� �Է��ϼ���.(* 1-45���� �Է�)>>");
//			String input = scan.next();
//			int check=0;
//			check_loop1:for(int i=0;i<9;i++) {
//				for(int j=0;j<5;j++) {
//					if(input.equals(score[i][j])) {
//						System.out.println("��ǥ�� : "+"["+i+","+j+"]");
//						check = 1;
//						break check_loop1;
//						// ��ǥ�� : [1,2]
//					}
//				}
//			}
//			if(check==0) {
//				System.out.println("���ϴ� ���ڰ� ��ǥ�� �����ϴ�.");
//			}

		} // while

	}

}
