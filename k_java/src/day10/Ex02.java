package day10;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 1-100���� ����
		// ó���� �Է�, �������� �Է� �޾�
		// �� ���� ���� ���� ���Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���ڸ� �Է��ϼ���.>>");
		int a = scan.nextInt();
		System.out.println("������ ���ڸ� �Է��ϼ���.>>");
		int b = scan.nextInt();
		int sum=0;
		int i=0;
		for(i=Math.min(a, b);i<=Math.max(a, b);i++) {
				sum = sum + i; //sum += i
		}
		
		System.out.println("����� :"+sum);

	}

}
