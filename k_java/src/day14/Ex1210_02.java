package day14;

public class Ex1210_02 {

	public static void main(String[] args) {
		Data d3 = new Data();
		d3.x=10;
		System.out.println("d.x : "+ d3.x);
		
		change(d3);
		
		System.out.println("d.x :"+ d3.x); //10
		
	}//main
	
	static void change(Data d3) {  //�������� x
		d3.x=1000;
		System.out.println("�޼ҵ� x : "+ d3.x);
	}

}
