package day16;

import java.util.Scanner;

public class Ex1214_04 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// [ �л��������α׷� ]
		// 1.�л��Է�
		// 2.�л����
		// 3.�л���������
		// 0.����
		// �л��Է� -> �߰��� �������ü� �ֵ��� ����
		Student[] stu = new Student[10];
		int choice=0;  //switch���ù�ȣ 
		int count=0;   //�л���
		
		// while(true)
		loop1:while(true) {
			choice = screen(); //ùȭ�� ��¸޼ҵ� - choice
			
			//switch�� 
			switch(choice) {
			case 1:
				count = input(count,stu);
				break;
			case 2:
				output(count,stu); //�л�������¸޼ҵ�-int count,Student[] stu
				break;
			case 3:
				System.out.println("[ �л��������� ]");
				System.out.println("�л��̸��� �Է��ϼ���.>>");
				int found_num=0; //�ش��ȣ
				int check=0; // �ش��л��� �ִ��� ������ üũ
				String name = scan.nextLine();
				// Student[] stu - stu[0].name,stu[1].name,stu[2].name //3��
				// �л��˻�
				for(int i=0;i<count;i++) {
					if(name.equals(stu[i].name)) {
						System.out.println("ã�� �л��� �ֽ��ϴ�.!");
						found_num = i; //
						check=1;
						break;
					}
				}
				//�л���������
				if(check==1) {
					System.out.println("[ ������� ���� ]");
					System.out.println("1.����");
					System.out.println("2.����");
					System.out.println("3.����");
					System.out.println("�����Ϸ��� ������ �����ϼ���.(0.����ȭ�� �̵�)>>");
					choice = scan.nextInt();
					switch(choice) {
					
					case 1:
						System.out.println("�������� : "+stu[found_num].kor);
						System.out.println("������ ���������� �Է��ϼ���.>>");
						stu[found_num].kor = scan.nextInt();
						// �հ�,��� �����Ǿ�� ��.
						stu[found_num].total=stu[found_num].kor+stu[found_num].eng+stu[found_num].math;
						stu[found_num].avg=stu[found_num].total/3.0;
						System.out.println("������ �����Ǿ����ϴ�.!");
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 0:
						
						break;
					
					
					}
					
					
					
					
					
					
				}else {
					System.out.println("ã�� �л� �̸��� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.!");
				}
				
				
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.!");
				break loop1;
			}//switch
		}//while
	}//main
	
	
	
	
	
	
	
	// �л�������¸޼ҵ� : ����Ÿ��-void, �Ű�����-int count,Student[] stu
	static void output(int count,Student[] stu) {
		for(int i=0;i<count;i++) {
			System.out.print(stu[i].stu_num+" "+stu[i].name+" "+stu[i].kor+" "+stu[i].eng+" "+stu[i].math+" "+stu[i].total+" ");
			System.out.printf("%.2f %n",stu[i].avg);
		}
	}
	
	// �޴� ���ȭ�� : ����Ÿ��-int 
	static int screen() {
		System.out.println("[ �л��������α׷� ]");
		System.out.println("1.�л��Է�");
		System.out.println("2.�л����");
		System.out.println("3.�л���������");
		System.out.println("0.����");
		System.out.println("--------------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(0.����)>>");
		int choice = scan.nextInt();
		return choice; 
	}
	
	//�л������Է¸޼ҵ� : ����Ÿ��-int count, �Ű�����-count,stu 
	static int input(int count,Student[] stu){
		//�Է� input(count,stu) -> int count,Student[] stu
		for(int i=count;i<stu.length;i++) {
			System.out.println("��ȣ�� �Է��ϼ���.(0.����ȭ�� �̵�)>>");
			int stu_num = scan.nextInt();
			scan.nextLine();
			if(stu_num==0) {
				break; //����ȭ������ �̵�
			}
			System.out.println("�̸��� �Է��ϼ���.>>");
			String name = scan.nextLine();
			System.out.println("���������� �Է��ϼ���.>>");
			int kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			int eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			int math = scan.nextInt();
			//��ü����
			stu[i]=new Student(stu_num,name,kor,eng,math);
			count++; //�л��� 1����
		}
		return count;
	}
	
	
}//class
