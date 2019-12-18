import java.util.Scanner;
public class test7_5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long a = input.nextInt();
		long temp;
		int odd_num = 0;
		int even_num = 0;
		for(int i = 14; i > 0; i--){
			temp = a/(long)Math.pow(10,i);
			a -= temp*(long)Math.pow(10,i);
			if(temp % 2 == 0){
				even_num++;
			}else{
				odd_num++;
			}
		}
	}
}