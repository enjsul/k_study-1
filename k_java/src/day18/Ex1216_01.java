package day18;

import java.util.Scanner;

public class Ex1216_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer=0;
		int[] input = new int[10];
		System.out.println("[ 10���� ���� ���߱� ���� ]");
		System.out.println("1-10������ �������� 10�� �ֽ��ϴ�.");
		System.out.println("10���� �Է��Ͽ� ��� �´��� Ȯ���ϼ���.!");

		for (int i = 0; i < input.length; i++) {
			System.out.println((i + 1) + "��° ���ڸ� �Է��ϼ���.>>");
			input[i] = scan.nextInt();
		}
		
		//��
		for(int i=0;i<input.length;i++) {
			if(input[i]==Number.arr[i]) {
				answer++;
			}
		}

		// �Է��� ���� ���
		System.out.print("[ �Է��� ���� ] : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		// ���� ���� ���
		System.out.print("[  ���� ���� ] : ");
		for (int i = 0; i < Number.arr.length; i++) {
			System.out.print(Number.arr[i] + " ");
		}
		System.out.println();
		System.out.print("[ ���䰳�� ] : "+answer +"\n");

	}

}
