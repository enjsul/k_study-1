package day6;

import java.util.Scanner;

public class Ex1130_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 1. �������� 1~100���� ���ڸ� ���� ������ ����
		// 2. ���ڸ� �Է¹޾� �´��� ��
		// * ���ѹݺ� for(;;) / while(true)
		// 3. �Է¼��ڰ� ũ�� ���� ���ڸ� �Է��ϼ���. ������ ū ���ڸ� �Է��ϼ���.
		// 5������ �Է��� ���� -> ���α׷� ����
		// 5�� �Է��ߴµ� -> ������ -> �Է��� ���� ����� �ǵ��� �غ�����.
		
		int r_num = (int)(Math.random()*100)+1;
		int count=1;
	    String result="";
	    int num1=0,num2=0,num3=0,num4=0,num5=0;
		
		while(true) {
			if(count<=5) {
				// ���α׷�
				System.out.println("[ "+count+"��° �Է� ]");
				count++;
				System.out.println("���ڸ� �Է��ϼ���.>>");
				int input = scan.nextInt();
				result = result +" "+ input;
				// ""+10 = "10"
				// "10" + 20= "10 20"
				
				
				if(r_num >input) {
					System.out.println("��ū ���ڸ� �Է��ϼ���!");
				}else if(r_num < input) {
					System.out.println("�� ���� ���ڸ� �Է��ϼ���.!");
				}else {
					System.out.println("�����Դϴ�.!");
					break;
				}
				
			}else {
				//���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}//while
		
		// �Է��� �� : 
		System.out.println("�Է��� �� : " + result);
		System.out.println("���� ���� ���� : "+r_num);
		
		
		
		// 4. ������ ���α׷��� �����ϼ���.
		
//		loop1:for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5) {
//					break loop1;
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}

	}

}
