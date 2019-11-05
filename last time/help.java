import java.util.Scanner;

public class help{
	public static int numberOfDaysInAYear(int isLeapYear){
		int total = 0;
		for(int i= 2014; i<=2034; i++){
			if (isLeapYear(i)){
				total=total + 366;
			}else{
				total=total+365;
			}
			return total;
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(numberOfDaysInAYear(a)+"days between 2014 and 2034");
	}
}