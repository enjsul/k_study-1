package Student;

public class Stu_info {
	// 1. �л������Է� - �й�,�̸�,��ȭ��ȣ,�г�,�а�,�ּ�,��������
	static int count;
	{ // �ʱ�ȭ��
		count++;
		num = "s"+String.format("%03d", count); //s001 s002...
	}
	
	Stu_info(){ }
	Stu_info(String name,String tel,int grade,String major,String address,String professor){
		this.name = name;
		this.tel = tel;
		this.grade = grade;
		this.major =major;
		this.address = address;
		this.professor = professor;
	}
	String num;
	String name;
	String tel;
	int grade;
	String major;
	String address;
	String professor;

}
