package day8;

import java.util.Scanner;

public class Ex1202_01 {

	public static void main(String[] args) {
		
		//6. 6�� �Է�
		Scanner scan = new Scanner(System.in);
		int[] input_arr = new int[6];
		int temp_arr=0;
		in_loop1: for(int i=0;i<6;i++) {
			System.out.println("���ڸ� �Է��ϼ���.>>");
			temp_arr = scan.nextInt();
			//8. 1-45���� �������� ��
			if(!(temp_arr>=1 && temp_arr<=45)) {
			   i--;
			   continue;
			}
			//9. �ߺ���
			for(int j=0;j<6;j++) {
				if(temp_arr==input_arr[j]) {
					i--;
					continue in_loop1;
				}
			}
			// input_arr�迭�� ����
			input_arr[i] = temp_arr;
		}
		
		// 1.45�� �迭����
		int[] ball = new int[45];
		
		// 2.45�� �迭 1~45 ���� �ֱ�
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
		}
		
		// 3.45�� �迭 ����
		int temp=0; // �迭���� �ӽ����庯��
		int j=0; // �������� ���庯��
		for(int i=0;i<200;i++) {
			j = (int)(Math.random()*45); //0-44
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		// 7. 6���Է¹��� ���� ���
		for(int i=0;i<6;i++) {
			System.out.print(input_arr[i]+" ");
		}
		
		// 4.6�� �迭�� ���
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		
		
		
		
		// 6�� �迭�� �߰������� �����
		// �迭�� ���ڸ� �Է¹޾� ���� ����Ͻÿ�.
		
		// �Է¹����� 1~45������ �Էµǵ��� �Ͻÿ�.
		// �ߺ��ؼ� ���� ���ڰ� �ԷµǸ� �ٽ� �Է¹����ÿ�.
		// �ζǹ�ȣ�� ��ġ�ϴ� ������ ����� ����Ͻÿ�.
		

	}

}
