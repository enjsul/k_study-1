package day16;

public class Ex1214_03 {

	public static void main(String[] args) {
		// ������ - 2,�̼���,100,100,90,290,95
		// 3,������,100,100,99 ->total,avg�ڵ����� �Էµɼ� �ֵ��� ���� 

		Student s1 = new Student();
		s1.stu_num=1;
		s1.name="ȫ�浿";
		s1.kor=100;
		s1.eng=100;
		s1.math = 100;
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg = s1.total / 3.0;
		System.out.println(s1.stu_num+s1.name+s1.kor);
		
		Student s2 = new Student(2,"�̼���",100,100,90);
		Student s3 = new Student(3,"������",100,100,99);
		
		
		
	}

}
