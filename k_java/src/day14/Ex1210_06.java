package day14;

import java.util.Scanner;

public class Ex1210_06 {

	public static void main(String[] args) {
		// �޼ҵ� ���� String id->��������
		// �޼ҵ�2 ���� -> password,name,address,phone,gender,hobby ���������� �Է�
		Scanner scan = new Scanner(System.in);
		Member m = new Member(); //��ü����
		String id=""; //�ʱ�ȭ
		System.out.println("[ ȸ������ ]");
		System.out.println("ȸ�������Ϸ��� 1.ȸ������ 0.����>>");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			change2(m); //admin
			m.id = change(id); //member_admin
			System.out.println("ȸ�� ���̵� : "+m.id); //admin
			break;
		case 0:
			break;
		}//switch
	}
	//�޼ҵ�1
	static String change(String id) {
		Scanner scan = new Scanner(System.in);
		System.out.println("id�� �Է��ϼ���.>>");
		id = scan.nextLine();
		return id;
	}
	//�޼ҵ�2 
	static void change2(Member m) {
		Scanner scan = new Scanner(System.in);
		System.out.println("change2�޼ҵ� id : "+m.id);
		System.out.println("id�� �Է��ϼ���.>>");
		m.id = scan.nextLine();
		
	}
	

}
