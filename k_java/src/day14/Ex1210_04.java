package day14;

import java.util.Scanner;

public class Ex1210_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		//���ѹݺ�
		loop1:while(true) {
			System.out.println("[ �л����� ���α׷� ]");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("--------------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				change(s1); // �л���ȣ �Է¹޾� ����
//				change2(s1); // �������� �ּҸ� �Ѱܼ� ������ ������ �ްڽ��ϴ�.
				System.out.print(s1.stu_num+" ");
				System.out.print(s1.name+" ");
				System.out.print(s1.kor+" ");
				System.out.print(s1.eng+" ");
				System.out.print(s1.math+" ");
				System.out.print(s1.total+" ");
				System.out.print(s1.avg+" ");
				System.out.print(s1.rank+" ");
				System.out.println();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.!");
				break loop1;
			}//switch
		}//while
	}//main
	
	//�޼ҵ�
	static void change(Student s1) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȣ�� �Է��ϼ���.>>");
		s1.stu_num = scan.nextInt();
		scan.nextLine();
		System.out.println("�̸��� �Է��ϼ���.>>");
		s1.name = scan.nextLine();
		System.out.println("���������� �Է��ϼ���.>>");
		s1.kor = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.>>");
		s1.eng = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.>>");
		s1.math = scan.nextInt();
		s1.total=s1.kor+s1.eng+s1.math;
		s1.avg=s1.total/3.0;
	}

	
	
	
	
}//class
