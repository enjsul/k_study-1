package day19;

public class Lotto {
	
	// �ζ� -> �迭����, �迭-���������� ��ȣ�ֱ�, ����, 6�� ����
	int[] ball = new int[45];
	static int count;
	{
		// ������ ��ȣ�ֱ�
		for(int i = 0;i<ball.length;i++){
			ball[i] = i + 1;
		}
	}
	
	//���� �޼ҵ�
	void shuffle() {
		// ����
		int temp = 0; // ���庯��
		int num = 0; // ��������
		for(int i = 0;i<200;i++){
			num = (int) (Math.random() * 45);
			temp = ball[0];
			ball[0] = ball[num];
			ball[num] = temp;
		}
	}
	
	void output() {
		System.out.println("[ ��ü �ζǹ�ȣ ]");
		for(int i=0;i<ball.length;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
	}
	void pick() {
		if(count<45) {
			System.out.print("[ ���ȹ�ȣ ] : ");
			System.out.print(ball[count]);
			System.out.println();
			count++;
		}else {
			System.out.println("�� �̻� ���� �����ϴ�.!");
		}
	}
	
	void pick6() {
		// 6�� ����
		System.out.print("[ �ζǹ�ȣ ] : ");
		for(int i = 0;i<6;i++){
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		
	}


}
