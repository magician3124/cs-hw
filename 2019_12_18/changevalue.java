public class changevalue {
	public static void main(String [] args){
		circle circle1 = new circle(1);
		circle circle2 = new circle(2);

		swap(circle1, circle2);
		System.out.println("circle1 radius:" + circle1.radius);
		System.out.println("circle2 radius:" + circle2.radius);
	}
	public static void swap(circle x, circle y){
		double temp = x.radius;
		x.radius = y.radius;
		y.radius = temp;
	}
}

class circle{
	double radius;
	circle(double newradius){
		radius = newradius;
	}
}

