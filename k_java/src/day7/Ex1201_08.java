package day7;

import java.util.Scanner;

public class Ex1201_08 {

	public static void main(String[] args) {
		// [ ���ڸ��߱� ]
		// ���ѹݺ����� ���ڸ��߱⸦ �ϴµ� ( 1-100 ���� )
		// �Է¹޾� �Է¼��ڰ� ũ�� ���������Է��ϼ���. ������ ū���ڸ� �Է��ϼ���.
		// Ƚ�� 10������ ���� ���� ����
		// �Է��� ���ڸ� �迭�� �����ؼ� ����
		// �������� �迭�� ����غ�����.
		// ��������Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int r_num = (int)(Math.random()*100)+1;
		int count=1;
		while(true) {
			if(count<=10) {
				System.out.println("���ڸ� �Է��ϼ���.>>");
				int input = scan.nextInt();
				arr[count-1]=input;
				if(r_num>input) {
					System.out.println("�� ū���� �Է��ϼ���!");
				}else if(r_num<input) {
					System.out.println("�� �������� �Է��ϼ���!");
				}else {
					System.out.println("�����Դϴ�.");
				}
				count++;
			}else {
				break;
			}
		}
		
		
		
		
		
		System.out.println("���� ���� : "+r_num);
		
		

	}

}
