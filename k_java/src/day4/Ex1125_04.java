package day4;
import java.util.Scanner;

public class Ex1125_04 {

	public static void main(String[] args) {
		//char input = '��';
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
//		scan.nextInt();
//		scan.nextDouble();
//		scan.nextLine();
		if(0<=input && input <= 9) { 
			System.out.println("�������Դϴ�.");
		}else {
			System.out.println("�����ڰ� �ƴմϴ�. �����ڸ� �Է��ϼ���.");
		}

	}

}
