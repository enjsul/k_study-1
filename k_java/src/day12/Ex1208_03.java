package day12;

public class Ex1208_03 {

	public static void main(String[] args) {
		
		Student s1 = new Student(); //1�� ��ü����-�ν��Ͻ��� �������.
		s1.stu_num=1;
		s1.name="ȫ�浿";
		s1.kor_score=100;
		s1.eng_score=100;
		s1.math_score=99;
		s1.total=s1.kor_score+s1.eng_score+s1.math_score;
		s1.avg = s1.total/3.0;
		
		Student s2 = new Student();
		s2.stu_num=2;
		
		
//		Tv t = new Tv(); //��ü����
//		t.color="�����";
//		t.channel = 7;
//		t.channelUp();
//		System.out.println("������� : "+t.color);
//		System.out.println("����ä�ι�ȣ : "+t.channel);
//		
//		Tv t2 = new Tv();
//		t2.channel=11;
//		t2.channelDown();
//		System.out.println("����ä�ι�ȣ :"+t2.channel);

	}

}
