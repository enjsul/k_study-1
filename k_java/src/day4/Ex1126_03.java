package day4;
import java.util.Scanner;

public class Ex1126_03 {

	public static void main(String[] args) {
		
		// ���ڸ� �Է¹޾� 8���̻��̸� �б��� �ٴմϴ�. �ٴ��� �ʽ��ϴ�.
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input>=8) {
			System.out.println("�б��� �ٴմϴ�.");
		}else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		
		
		
		// ���ڿ� 1���� �Է¹޾�
        // admin�̸� ��ġ�մϴ�. �ٸ��� ��ġ���� �ʽ��ϴ�. 
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("ID�� �Է��ϼ���.>>");
//		String id = scan.next();
//		System.out.println("password�� �Է��ϼ���.>>");
//		String pw = scan.next();
//		
//		if(id.equals("admin")) {
//			if(pw.equals("1234")) {
//				System.out.println("ID, password�� ��ġ�մϴ�.");
//			}else {
//				System.out.println("ID�� ��ġ������, password�� ��ġ���� �ʽ��ϴ�. �α����� �ٽ� ���ּ���.");
//			}
//		}else {
//			System.out.println("ID�� ��ġ���� �ʽ��ϴ�. �α����� �ٽ� ���ּ���.");
//		}
		
		
		
		
		// ���ڸ� �Է¹޾�
		// 90���̻��̸� "A", 80���̻��̸� B, 70���̻��̸� C,60�� �̻��̸� D
//		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
//		String grade="";
//		if(input>=90) {
//			grade="A";
//			if(input>=98) {
//				grade = grade + "+";  // "A"+"+"=A+
//			}else if(input < 94) {
//				grade = grade + "-";  // "A" + "-"=A-
//			}
//		}else if(input>=80) {
//			grade="B";
//		}else if(input>=70) {
//			grade="C";
//		}else if(input>=60){
//			grade="D";
//		}else {
//			grade="F";
//		}
//		System.out.println(grade);
		
		// ���ڸ� �Է¹޾�
		// 60���ʰ��̸� �հ�, 60�� �����, 60���̸� ���հ�
		
//		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
//		if(input>=60) {
//			System.out.println("�հ�");
//		}else if(input==60) {
//			System.out.println("�����");
//		}else {
//			System.out.println("���հ�");
//		}
		
		
//		int a = 7;
//		if(a>0) {
//			System.out.println("����Դϴ�.");
//		}else if(a==0) {
//			System.out.println("0�Դϴ�.");
//		}else {
//			System.out.println("�����Դϴ�.");
//		}

	}

}
