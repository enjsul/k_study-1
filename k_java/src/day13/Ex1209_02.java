package day13;

import java.util.Scanner;

public class Ex1209_02 {

	public static void main(String[] args) {
		
		// Ex1208_08.java ��ü�����ؼ� 3�� ȸ���� �Է¹޾� ����Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		Member[] m = new Member[3]; // ��ü�迭�� ����
		
		for(int i=0;i<m.length;i++) {  //3���� �л������� �ޱ�����
			// ���� ����
			m[i] = new Member(); // �迭������ ���� ��ü������ ����.
			
			System.out.println("ID�� �Է��ϼ���>>");
			m[i].id=scan.nextLine();
			System.out.println("�н����带 �Է��ϼ���.(���ڸ�����)>>");
			m[i].pw=scan.nextInt();
			scan.nextLine();// nextInt() enterŰ �� ����
			System.out.println("�̸��� �Է��ϼ���.>>");
			m[i].name=scan.nextLine();
			System.out.println("����ó�� �Է��ϼ���.>>");
			m[i].phone=scan.nextLine();
			System.out.println("�ּҸ� �Է��ϼ���.>>");
			m[i].address=scan.nextLine();
			System.out.println("������ �Է��ϼ���.(M:����,F:����)>>");
			m[i].gender=scan.nextLine();
			System.out.println("��̸� �Է��ϼ���.>>");
			m[i].hobby=scan.nextLine();
		}
		
		//ȭ����� - 3���� ȸ������ ���
		for(int i=0;i<m.length;i++) {
			System.out.println("[ ȸ������ ]");
			System.out.printf("%s %d %s %s %s %s %s %n",m[i].id,m[i].pw,m[i].name,m[i].phone,m[i].address,m[i].gender,m[i].hobby);
		}
		

	}

}
