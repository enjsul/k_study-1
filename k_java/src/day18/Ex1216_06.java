package day18;

import java.util.Scanner;

public class Ex1216_06 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student[] s = new Student[3];
		Ex1216_06 e = new Ex1216_06();
		e.input(s); //�Է�
		e.output(s); //���
	}//main
	
	//�Է�
	void input(Student[] s) {
		System.out.println("[ ����ó�� ���α׷� ]");
		System.out.println("�̸��� �Է��ϼ���.>>");
	    String name = scan.nextLine();
	    System.out.println("���������� �Է��ϼ���.>>");
	    int kor = scan.nextInt();
	    System.out.println("���������� �Է��ϼ���.>>");
	    int eng = scan.nextInt();
	    System.out.println("���������� �Է��ϼ���.>>");
	    int math = scan.nextInt();
	    s[0] = new Student(name,kor,eng,math);
	}
	//���
	void output(Student[] s) {
		System.out.print(s[0].num+"\t");
	    System.out.print(s[0].name+"\t");
	    System.out.print(s[0].kor+"\t");
	    System.out.print(s[0].eng+"\t");
	    System.out.print(s[0].math+"\t");
	    System.out.print(s[0].total+"\t");
	    System.out.printf("%.2f \t",s[0].avg);
	    System.out.print(s[0].rank+"\t");
	}
	
	
	
	

}//class
