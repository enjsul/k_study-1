package day6;

import java.util.Scanner;

public class Ex1130_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char choice = ' ';

		loop1: while (true) {
			System.out.println("---------------------");
			System.out.println("   total ���α׷� ����");
			System.out.println("---------------------");
			System.out.println(" 1.����ó�� ��� Ȯ��");
			System.out.println(" 2.������ ");
			System.out.println(" 3.���ڸ��߱� ");
			System.out.println("---------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(����:x)>>");
			choice = scan.next().charAt(0);
			switch (choice) {
			case '1':
				while (true) {
					System.out.println("[ ����ó�� ��� Ȯ�� ]");
					System.out.println("������ �Է��ϼ���.(����ȭ��:-1)>>");
					int score = scan.nextInt();
					String grade = "";
					if (score >= 90) {
						grade = "A";
						if (score >= 98) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 93) {
							grade += "-";
						}
					} else if (score >= 80) {
						grade = "B";
						if (score >= 88) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 83) {
							grade += "-";
						}
					} else if (score >= 70) {
						grade = "C";
						if (score >= 78) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 73) {
							grade += "-";
						}
					} else if (score >= 60) {
						grade = "D";
						if (score >= 68) {
							grade += "+"; // grade = grade+"+";
						} else if (score <= 63) {
							grade += "-";
						}
					} else if (score >= 0) {
						grade = "F";
					} else { // 0<score
						System.out.println("����ȭ������ �̵�>>");
						break;
					}
					System.out.println("����� ���� : " + grade);
				} // while
				break;
			case '2':
				System.out.println("������ ���α׷� ����");
				// ù���� �ܰ� ������ ���� �Է��ؼ� ����Ͻÿ�.
				// ���ѹݺ�, -1����ȭ������ �̵�

				break;
			case '3':
				System.out.println("���ڸ��߱� ���α׷� ����");
				break;
			case 'x':
			case 'X':
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.>>");
				break;
			}

		}

	}

}
