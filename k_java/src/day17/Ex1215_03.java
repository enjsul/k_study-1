package day17;

public class Ex1215_03 {

	public static void main(String[] args) {
		// 1.��ǰ - 1,s001,���̴�
		// 2,c001,�ݶ� / 3,m001,�̶��� / 4,s002,���̴�
		// 5,s003,���̴� ����غ��ÿ�.
		// �⺻������
		Can c1 = new Can();  // s_no=1;
		c1.d_no="s001";
		c1.name="���̴�";
		System.out.println("c1: "+c1.s_no);
		
		
		
		Can c4 = new Can("���̴�"); // s_no=4;
		c4.d_no="s002";
		System.out.println("c4: "+c4.s_no);
		

	}

}
