package day19;

import java.util.Scanner;

public class Ex1217_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Point[] p = new Point[3];
		for(int i=0;i<p.length;i++) {
			System.out.println((i+1)+"��° ��ǥ���� �Է��ϼ���.>>");
			p[i] = new Point();
			p[i].x = scan.nextInt();
			p[i].y = scan.nextInt();
		}
		double result=0;
		System.out.printf("1��° ��ǥ : [ x:%d, y:%d ] \n",p[0].x,p[0].y);
		System.out.printf("2��° ��ǥ : [ x:%d, y:%d ] \n",p[1].x,p[1].y);
		System.out.printf("3��° ��ǥ : [ x:%d, y:%d ] \n",p[2].x,p[2].y);
		// ������(����(a)+����(b))	
		result = Math.sqrt(Math.pow(p[0].x-p[1].x, 2)+Math.pow(p[0].y-p[1].y, 2));		
		System.out.printf("������ ���� : [ %.2f ] \n",result);
		Math.abs(result); //���밪 ���ϴ� �Լ�
		// �� ���� �Է¹޾� �� ������ ���̸� ���Ͻÿ�.
		// [0,0] [10,20]
		// [ ������ ���� ���ϴ� ���α׷� ]
		// ������ ��ǥ : 
		// ������ ���� :
		

	}

}
