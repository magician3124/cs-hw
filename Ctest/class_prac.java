package Ctest;                                                                                                                                                                                                                                                      
public class class_prac{
	public static void main(String[] args){
		circle circle1 = new circle(1);
		circle circle2 = new circle(2);
		swp1(circle1, circle2);
		System.out.println(circle1.radius + " " + circle2.radius);
		swp2(circle1, circle2);
		System.out.println(circle1.radius + " " + circle2.radius);
	}
	public static void swp1(circle x, circle y){
		circle temp = x;
		x = y;
		y = temp;
	}
	public static void swp2(circle x, circle y){
		int temp = x.radius;
		x.radius = y.radius;
		y.radius = temp;
	}
}
class circle{
	int radius;
	circle(){
		radius = 0;
	}
	circle(int c){
		radius = c;
	}
}
