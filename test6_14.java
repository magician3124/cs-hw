import java.util.Scanner;
public class test6_14{
	public static void toPi(int j){
		double temp = 0;
		double num = 0;
		for(int i = 1; i <= j; i++){
			temp = Math.pow(-1, (i+1))/(2*i-1);
			num += temp;
		}
		System.out.println(j + "\t" + 4*num);
	}
	public static void main(String[] args){
		int k;
		System.out.println("i                     m(i)");
		System.out.println("--------------------------");
		for(int i = 0; i < 10; i++){
			k = i*100 + 1;
			toPi(k);
		}
	}
}