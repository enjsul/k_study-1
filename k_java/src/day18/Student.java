package day18;

public class Student {
	{
		count++;
		this.num ="s"+count;
	}
	
	Student(){
		
	} //�⺻������
	Student(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	static int count;
	String num; //�й� s001,s002,s003
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

}
