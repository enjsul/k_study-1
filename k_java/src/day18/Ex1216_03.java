package day18;

import java.util.Scanner;

public class Ex1216_03 {

	public static void main(String[] args) {
		
		int[] input = new int[10];
		int answer=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("[ �������� �γ����� - ���ϱ� �� ]");
		
		long startTime = System.currentTimeMillis(); //0
		//�����Է�
		for(int i=0;i<input.length;i++) {
			System.out.println(Nds.num[i][0]+"+"+Nds.num[i][1]+"=");
			input[i]=scan.nextInt();
			if(input[i]==Nds.num[i][2]) {
				System.out.println("�����Դϴ�.!");
				answer++;
			}else {
				System.out.println("�����Դϴ�.!");
			}
		}
		long endTime = System.currentTimeMillis(); //2000 2  1��-60000
		
		//�������
		System.out.print("[ ���� ] : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(Nds.num[i][2]+" ");
		}
		System.out.println();
		System.out.print("[ �Է� ] : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		System.out.println("[ ���䰳�� ] : "+answer);
		// 4000 - 1000 = 3000/1000 3��
		System.out.println("[ �����ذ�ð� ] :"+((endTime-startTime)/1000.0));
		

	}

}
