package day19;

import java.util.Scanner;

public class Ex1217_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���簢�� ���ϴ� ���̰��� ( x��ǥ 2��, y��ǥ 2�� )
		// ���� ���� : 2���� �Է¹޾� ���̸� ���Ͻÿ�.
		Point[] p = new Point[2];
		System.out.println("x ��ǥ 2���� �Է��ϼ���.>>");
		p[0] = new Point();
		p[1] = new Point();
		p[0].x = scan.nextInt();
		p[1].x = scan.nextInt();
		System.out.println("y ��ǥ 2���� �Է��ϼ���.>>");
		p[0].y = scan.nextInt();
		p[1].y = scan.nextInt();
		
		// �غ�(x0-x1) * ����(y0-y1)
		double result1 = Math.abs(p[0].x-p[1].x); //���밪
		double result2 = Math.abs(p[0].y-p[1].y);
		double result = result1 * result2;
		
		System.out.println("���� : "+result);
		System.out.printf("1��ǥ : %d,%d \n",p[0].x,p[0].y);
		System.out.printf("2��ǥ : %d,%d \n",p[0].x,p[1].y);
		System.out.printf("3��ǥ : %d,%d \n",p[1].x,p[0].y);
		System.out.printf("4��ǥ : %d,%d \n",p[1].x,p[1].y);
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�� �������̸� �Է��ϼ���.>>");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		System.out.println("���簢���� ���� : "+a*b);

	}

}
