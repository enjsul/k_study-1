package day4;
import java.util.Scanner;

public class Ex1125_08 {

	public static void main(String[] args) {
		
		// ���űݾ��� �Է¹޾�, 1�鸸�� �̻� VIP
		// 80���� GOLD, 70���� SILVER, 50���� BRONZE
		Scanner scan = new Scanner(System.in);
		System.out.println("���űݾ׸� �Է��ϼ���.>>");
		int purchase_price = scan.nextInt();
		if(purchase_price>=1000000) {
			System.out.println("VIP");
		}else if(purchase_price>=800000) {
			System.out.println("GOLD");
		}else if(purchase_price>=700000) {
			System.out.println("SILVER");
		}else {
			System.out.println("BRONZE");
		}
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���.>>");
//		int num = scan.nextInt();
//		if(num>=90) {
//			System.out.println("A");
//		}else if(num>=80) {
//			System.out.println("B");
//		}else if(num>=70) {
//			System.out.println("C");
//		}else if(num>=60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}

	}

}
