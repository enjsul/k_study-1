package day8;

import java.util.Scanner;

public class Ex1202_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//��������
		int[] arr = new int[45];
		String[][] score = new String[9][5];
		int temp=0;  //�迭���⿡�� �迭�� �ӽ����� ����
		int k=0;     // �������� ����
		// 1�����迭 1-45���� ����
		for(int i=0;i<45;i++) {
			arr[i] = i+1;
		}
		// �迭 ����
		for(int i=0;i<200;i++) {
			k = (int)(Math.random()*45); // 0-44
			temp = arr[0];
			arr[0] = arr[k];
			arr[k] = temp;
		}
		// ���ѹݺ�
		while(true) {
			// ���α׷� ���� �˸�
			System.out.println("��ǥ�� �˸� ���α׷��� �����Ͻðڽ��ϱ�?(1:yes,0:no)");
			int result = scan.nextInt();
			if(result==0) {
				System.out.println("���α׷��� �����մϴ�!");
				break;
			}
			
			// �����¿�
			for(int i=0;i<5;i++) {
				System.out.print("\t"+"["+i+"]");
			}
			System.out.println();
			System.out.println("--------------------------------------------");
			
			// 2�����迭 �Է� �� ���
			for(int i=0;i<9;i++) {
				System.out.print("["+i+"]"+"\t");  //��¿�
				for(int j=0;j<5;j++) {
					score[i][j] = ""+arr[(5*i)+j]; // temp_s[0-44]
//					score[i][j] = (int)(Math.random()*45+1);//�ߺ�����
//					score[i][j] = (5*i)+j+1; //1-45
					System.out.print(score[i][j]+"\t");
				}
				System.out.println();
			}
			// ��ǥ�� �Է�
			System.out.println("��ǥ���� �˰� ���� ���ڸ� �Է��ϼ���.(* 1-45���� �Է�)>>");
			String input = scan.next();
			int check=0;
			check_loop1:for(int i=0;i<9;i++) {
				for(int j=0;j<5;j++) {
					if(input.equals(score[i][j])) {
						System.out.println("��ǥ�� : "+"["+i+","+j+"]");
						check = 1;
						break check_loop1;
						// ��ǥ�� : [1,2]
					}
				}
			}
			if(check==0) {
				System.out.println("���ϴ� ���ڰ� ��ǥ�� �����ϴ�.");
			}
			
		}//while
		
		
		
		
		// 4. 20�� �Է¹����� [1,2] ��ġ���� ����Ͻÿ�.
		// 5. x��ǥ�Է� 1 y��ǥ�Է� 2 
		//    -> ��ǥ�� x���� �ԷµǾ ��� ���� ����Ͻÿ�.
		//     0   1   2   3    4
		//-------------------------
		// 0 |  1   2   6   21   22
		// 1 |  45  30  x   15   14

	}

}
