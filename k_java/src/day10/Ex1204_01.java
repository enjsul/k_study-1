package day10;

import java.util.Scanner;

public class Ex1204_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// [9,5] 2�����迭 -> 45��
		int[][] score = new int[9][5];
		// �ߺ����� 1-45�� �������� �ְ� ������ ����ϴ� �迭
		int[] arr = new int[45];
		// 1�����迭�� ���������� ���ڳֱ�(1-45)
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1; //1,2,3,4,5....
		}
		//�迭���� - temp:�ӽ�����,k:������ȣ ����
		int temp=0;
		int k=0;
		// 200�� ����
		for(int i=0;i<200;i++) {
			k=(int)(Math.random()*45); // �迭�� ���� ��ȣ(0-44)
			temp = arr[0];
			arr[0] = arr[k];
			arr[k] = temp;
		}
		//score�迭�� ������ �� �ֱ�
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				score[i][j] = arr[(5*i)+j]; //arr[0]���� ������ ������ �� �Է�
				//score[i][j] = (int)(Math.random()*45)+1; //1,45,30,21,1,...
				//score[i][j] =(5*i)+j+1;  // 0+1,2,3,4,5 5+1,2,3,4,5
			}
		}
		// ������
		for(int i=0;i<5;i++) {
			//System.out.print("\t"+"["+i+"]");
			System.out.printf("\t[%d]",i);
		}
		System.out.println();
		// score 2�����迭 ���
		for(int i=0;i<9;i++) {
			System.out.print("["+i+"]"+"\t");
			for(int j=0;j<5;j++) {
				//score[i][j] �� ���
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		//x,y�� ��ǥ�� �Է�
		System.out.println("x��ǥ���� �Է��ϼ���.>>");
		int x = scan.nextInt();
		System.out.println("y��ǥ���� �Է��ϼ���.>>");
		int y = scan.nextInt();
		// x,y�� ��ǥ�� ���ؼ� �� ���� ���
		int check=0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				if(x==i && y==j) {
					System.out.printf("[%d,%d] ��ǥ�� : %d %n ",x,y,score[x][y]);
					check++;
				}
			}
		}//for
		if(check==0) {
			System.out.println("�ش�Ǵ� ��ǥ���� �����ϴ�.!!");
		}

	}

}
