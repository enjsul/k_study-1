package day16;

public class Student {
	// ��ȣ,�̸�,����,����,����,�հ�,���,���

	Student(){ }
	Student(int stu_num,String name,int kor,int eng,int math){
		this.stu_num = stu_num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math; //�հ�
		this.avg = this.total/3.0;     //���
	}
	
	int stu_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

}
