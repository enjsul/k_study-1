package day7;

public class Ex1201_04 {

	public static void main(String[] args) {
		// �ζ� �迭 45�� ����
		int[] ball = new int[45];
		
		//1~45���� ���� �Է�
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		int temp=0;  // �ӽ��������
		int j = 0;   // �����������庯��
		// �迭 ����
		for(int i=0;i<200;i++) {
			j = (int)(Math.random()*45); // 0-44
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		// �ζǹ�ȣ ���
		System.out.println("[ �ζǹ�ȣ ]");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}

	}

}
