package day17;

import java.util.Scanner;

public class Ex1215_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product2[] p = new Product2[10];
		String[] title= {"S_NO","PRONO","�̸�","������"};
        
		// ���������Է� - scan
		for(int i=0;i<p.length;i++) {
			System.out.println("[ ��ǰ���� ���� ]");
			System.out.println("1.TV 2.��Ź�� 3.�����");
			System.out.println("---------------------------");
			System.out.println((i+1)+"��° �����Ϸ��� ��ǰ�� ��ȣ�� �Է��ϼ���.>>");
			int choice = scan.nextInt();
			String choice_name="";
			switch(choice) {
			case 1:
				choice_name="TV";
				break;
			case 2:
				choice_name="��Ź��";
				break;
			case 3:
				choice_name="�����";
				break;
			default:
				break;
			}
			p[i] = new Product2(choice_name,500);
		}
		
		//������
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("----------------------------");
		
		//�������
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i].serialNo+"\t");
			System.out.print(p[i].proNo+"\t");
			System.out.print(p[i].name+"\t");
			System.out.print(p[i].size+"\t");
			System.out.println();
		}
		

	}

}
