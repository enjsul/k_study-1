package day18;

import java.util.Scanner;

public class Ex1216_06 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student s1=null; // 3���� �л��� �޴� ���·� �����غ�����.
		Ex1216_06 e = new Ex1216_06();
		s1 = e.input(s1); //�Է�
		e.output(s1); //���
	}//main
	
	//�Է�
	Student input(Student s1) {
		System.out.println("[ ����ó�� ���α׷� ]");
		System.out.println("�̸��� �Է��ϼ���.>>");
	    String name = scan.nextLine();
	    System.out.println("���������� �Է��ϼ���.>>");
	    int kor = scan.nextInt();
	    System.out.println("���������� �Է��ϼ���.>>");
	    int eng = scan.nextInt();
	    System.out.println("���������� �Է��ϼ���.>>");
	    int math = scan.nextInt();
	    s1 = new Student(name,kor,eng,math);
		return s1;
	}
	//���
	void output(Student s1) {
		System.out.print(s1.num+"\t");
	    System.out.print(s1.name+"\t");
	    System.out.print(s1.kor+"\t");
	    System.out.print(s1.eng+"\t");
	    System.out.print(s1.math+"\t");
	    System.out.print(s1.total+"\t");
	    System.out.printf("%.2f \t",s1.avg);
	    System.out.print(s1.rank+"\t");
	}
	
	
	
	

}//class
