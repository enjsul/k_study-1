package day18;

import java.util.Scanner;

public class Ex1216_04 {

	public static void main(String[] args) {
		// ������� �����ؼ� ������ ���ߴ� ����
		// 10���� - car�� ����?
		// ��

		Scanner scan = new Scanner(System.in);
		String[] input = new String[10];
		int answer=0;
		System.out.println("[����ܾ� ���߱� ���α׷�]");
		long startTime = System.currentTimeMillis();
		
		//10�� �ݺ�
		for(int i=0;i<input.length;i++) {
			System.out.println(English.eng[i][0]+" �� ���� �����ϱ��?");
			input[i] = scan.nextLine().trim().replace(" ", ""); //�������� �Լ�
			if(input[i].equals(English.eng[i][1])) {
				System.out.println("�����Դϴ�.!");
				answer++;
			}else {
				System.out.println("�����Դϴ�.!");
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		//���
		System.out.print("[ ����1 ] : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(English.eng[i][0]+"\t");
		}
		System.out.println();
		System.out.print("[ �ѱ�1 ] : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(English.eng[i][1]+"\t");
		}
		System.out.println();
		System.out.print("[ �Է� ] : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+"\t");
		}
		System.out.println();
		System.out.println("[ ���䰳�� ] : "+answer);
		System.out.println("[ ����Ǯ�̽ð� ] : "+(endTime-startTime)/1000.0+" ��");
		
		
		
		
		// [ ����1 ] : car dog boy
		// [ ����3 ] : �� �� �ҳ� ...
		// [ �Է� ] : �� �� �ҳ� ...
		// [ ���䰳�� ] : 4��
		// [ ����Ǯ�̽ð� ] : 12.904 ��

	}

}
