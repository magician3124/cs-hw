import java.util.Scanner;
public class note{
	public static void main(String [] args){
		//constant
		final double PI = 3.14;
		// input
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		//power & output
		System.out.println(Math.pow(2, 3));
		// binary & octal & hex
		System.out.println(OB1111); //binary OB
		System.out.println(07777); // octal O
		System.out.println(OXFFFF); // hex OX
		//science notation
		System.out.println(1.23456E-2);// 1.23456 * 10^-2 = 1.23456E-2
		//System.currentTimeMillis
		long totalMillisecond = System.currentTimeMillis();// seconds from 1970/1/1 12:00 pm
		//declare boolean
		boolean lightOn = true;
		//Math.random() 0.0 <= d < 1.0
		int num1 = (int)Math.random()*10;// 0 ~ 9
		//check if is leapyear
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		//switch
		switch(status){ // status == true
			case 0:
				System.out.println(0);
				break;
			default:
				System.out.println(1);
		}
		//math
		Math.toDegrees(Math.PI/2);//enter radian
		Math.toRadians(30);
		Math.sin(Math.toRadians(270));//enter radian
		Math.cos(Math.toRadians(270));//enter radian
		Math.asin(0.5);//return radian
		Math.acos(0.5);//return radian
		Math.atan(1.0);//return radian
		Math.exp(x);//return e^x
		Math.log(x);//return ln(x)
		Math.log10(x);//return log10(x)
		Math.pow(a, b);
		Math.sqrt(x);//x^0.5 x>=o
		Math.ceil(x);//ceiling fuction
		Math.floor(x);//floor function
		Math.rint(x);//to integer -> double
		Math.round(x);
		//x -> float return (int)Math.floor(x+0.5)
		//x -> double return (long)Math.floor(x+0.5)
		Math.max(2, 3);//return 3
		Math.min(2.5, 4.6);//return 2.5
		Math.abs(-1);//return 1
		//unicode
		int a = (int)'a';
		//character
		Character.isDigit('a'); // return false
		Character.isLetter('a'); // return true
		//string
		.length()
		.charAt(index) // looking for char
		.concat(s1) // combining s1 to this string
		.toUpperCase()
		.toLowerCase()
		.trim()// delete spaces that surround the string
		//reading string
		String s1 =input.next();//seperate by spaces
		String s2 = input.nextLine();//next line
		//comparing string p.155
		.equals()
		.equalsIgnoreCase()
		.compareTo() //alphebetical order
		.startsWith()//prefix
		.endsWith()//suffix
		.contains()//include
		//method
		public static int max(int a, int b){
			return result;
		}
		//1d array
		double[] array = new double[10];
		double[] mylist = {1.2, 3.2, 4.2, 5.2,}
		//print out array for each
		for(double e: mylist){
			System.out.println(e);
		}
		//util.java.Array
		util.java.Array.sort(mylist);
		util.java.Array.binarySearch(mylist, 11);
		//2d array
		int[][] array = {
			{1, 2, 3},
			{1, 2, 3},
			{1 ,2, 3}
		}
		circle c = new circle(25);
			c.radius;
			c.get()

	}
}

class circle{
	int radius = 1;
	circle(){
	}
	circle(double nr){
		radius = 2;
	}
	double get(){
		return radius;
	}
}