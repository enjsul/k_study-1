package day4;
import java.util.Scanner;

public class Ex1125_03 {

	public static void main(String[] args) {
		
		if(10.0d==10.0f) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if((float)0.1d==0.1f) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		double d = (double)0.1f;
		System.out.println(d);
		
		// Math.round -> �ݿø�
		// Math.ceil -> �ø�
		// Math.floor -> ����
		
		// ���ڸ� �Է¹޾� -> 3�ڸ����� �ݿø�, �ø�, ������ ����Ͻÿ�.
		
//	    Scanner scan = new Scanner(System.in);
//	    System.out.println("���ڸ� �Է��ϼ���.>>");
//	    double in = scan.nextDouble();
//	    
//		System.out.println(Math.round(in*100)/100.0);
//		System.out.println(Math.ceil(in*100)/100.0);
//		System.out.println(Math.floor(in*100)/100.0);
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�Ǽ��� �Է��ϼ���.>>");
//		double pi = scan.nextDouble();
//		double result = Math.floor(pi*100)/100.0;
//		System.out.println(result);
//		
//		System.out.println("�Ǽ��� �Է��ϼ���.>>");
//		double d = scan.nextDouble();
//		double result2 = Math.floor(d*10000)/10000.0;
//		System.out.println(result2);
		
		
		
		
		// 1���� �Ǽ��� �Է¹޾� 3�ڸ����� �ݿø��Ͻÿ�.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�Ǽ��� �Է��ϼ���.>>");
//		double input = scan.nextDouble();  // ���� �Է��� ��
//		double result = Math.round(input*1000)/1000.0;
//		System.out.println(result);
		
		
		
		
//		double pi = 3.141592;   // 3141.592 -> 3142 -> 3.142
//		double result = Math.round(pi*1000)/1000.0;
//		System.out.println(result);
		
		
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;
//		System.out.println(result);
//		
//		// 15.234567 -> 2�ڸ� ����.   36547.12458763 -> 5�ڸ� ����
//		// 1���� �Ǽ��� �Է¹޾�, 3�ڸ����� ������ �ؼ� ����Ͻÿ�.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�Ǽ��� �Է��ϼ���.>>");
//		double input = scan.nextDouble();
//		double result2 = (int)(input*1000)/1000.0;
//		System.out.println(result2);
		

	}

}
