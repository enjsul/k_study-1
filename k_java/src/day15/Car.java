package day15;

public class Car {
	Car(){
		this("white","auto",4); // this-�ٸ� �����ڸ� �����Ҷ� ���
	}  //�⺻������
	Car(String color,String gearType,int door){ //�Ű������� �ִ� ������
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	
	String color;    //�ν��Ͻ� ����
	String gearType;
	int door;
}
