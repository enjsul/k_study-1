package day4;
import java.util.Scanner;

public class Ex1126_04 {

	public static void main(String[] args) {
		// ���ڸ� �Է¹޾�
		// 13���ϴ� "450���Դϴ�."
		// 14~19 ���̴� 720���Դϴ�.
		// 20�̻��� 1250���Դϴ�.
		Scanner scan = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���.>>");
		int input = scan.nextInt();
		if(input>=20) {
			System.out.println("1250��");
		}else if(input>=14 && input <=19) {
			System.out.println("720��");
		}else {
			System.out.println("450��");
		}

	}

}
