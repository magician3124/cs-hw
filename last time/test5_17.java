import java.util.Scanner;
public class test5_17{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ")
		int num = input.nextInt();
		for(int k = num; k > 0; k--){
			for(int i = k; i > 0; i--)
				System.out.print(i);
			for(int j = 2; j <= k; j++)
				System.out.print(j);
			System.out.println("");
		}
	}
}