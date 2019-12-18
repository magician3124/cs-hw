import java.util.Scanner;
public class test6_22{
	public static double sqrt(long n){
		double lg = 1;
		double ng = 0;
		while(lg >= 1){
			if(ng != 0){
				lg = (lg + n/lg)/2.0;
				if(ng-lg < 0.00001)
					break;
			}
			lg = (lg + n/lg)/2.0;
			ng = lg;
		}
		return lg;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(sqrt(n));

	}
}