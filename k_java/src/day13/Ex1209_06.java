package day13;

import java.util.Scanner;

public class Ex1209_06 {

	public static void main(String[] args) {
		// �μ� �Է¹޾�, +,-,*,/ ������� ���
		Ex1209_06 e = new Ex1209_06();
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0,result=0,choice=0;
		System.out.println("[��Ģ���� ���α׷�]");
		System.out.println("�μ��� �Է��ϼ���.>>");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("1.+ 2.- 3.* 4./");
		System.out.println("---------------------");
		System.out.println("���ϴ� ��ȣ�� �����ϼ���.>>");
		choice=scan.nextInt();
		// calculate()�޼ҵ� ȣ�� - �Ű�����3�� 
		result = e.calculate(num1,num2,choice);
		System.out.println("����� : "+result);
	}//main

	int calculate(int num1,int num2,int choice) {
		int result=0;
		//��Ģ���� ����
		switch(choice) {
		case 1:
			result = num1+num2;
			break;
		case 2:
			result = num1-num2;
			break;
		case 3:
			result = num1*num2;
			break;
		case 4:
			result = num1/num2;
			break;
		}
		return result; 
	}
	
	
	
	
	
}//class
