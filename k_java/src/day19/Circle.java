package day19;

public class Circle extends Shape {
	
	Point center; // ���߽���
	int r;
	double area;
	
	
	Circle(){
		this(new Point(0,0),100); // ������ : 3.14 * 100 * 100 = 31400
		//���ѷ� 2 * 100 * 3.14 = 628
	}
	
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
		this.area = 3.14 * Math.pow(this.r, 2); //Math.pow:�ŵ�����
	}
	

}
