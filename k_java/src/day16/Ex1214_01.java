package day16;

public class Ex1214_01 {

	public static void main(String[] args) {
		// ��ü�����ؼ� ���,����,4���� �־ ����� �غ�����.
		Car c = new Car();
		System.out.println(c.customer+","+c.color+","+c.gearType+","+c.door);
		Car sportCar = new Car("�ں���","red","manual",5);
		System.out.println(sportCar.customer+","+sportCar.color+","+sportCar.gearType+","+sportCar.door);
	}

}
