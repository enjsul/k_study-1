package day9;

public class Ex1203_05 {

	public static void main(String[] args) {
		// %d-����, %f-�Ǽ�, %c-����, %s-���ڿ�, 
		// %n-enterŰ, %t-tabŰ
		// %b-2����, %o-8����, %x-16����, %e-����ǥ��
		
		int a=100;
		double b=3;
		System.out.printf("%5d/%.0f=%08.2f %n",a,b,(a/b));
		//a-b=(a-b), a*b, a/b
		
		// ���� �¾ ���� 10���Դϴ�.
		System.out.printf("���� �¾ ���� %d���Դϴ�.%n",a);
		// 5���� ���Դϴ�.
		System.out.printf("%f���� ���Դϴ�.%n",b);
		System.out.printf("%d��%f���� �� �����Դϴ�.%n",a,b);
		
		
		

	}

}
