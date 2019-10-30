import java.util.Scanner;
public class test5_37{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double num;
		int dec = 0;
		num = input.nextInt();
		double test_num = num;
		while(test_num > 0){
			test_num /= 10;
			dec++;
		}
		int n = 0;
		while(num > 0){
			if(num - Math.pow(2, n)>0){
				// System.out.println(n);
				n++;
			}else{
				n--;
				num -= Math.pow(2, n);
				// System.out.print(num);
				if(num>0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
				n--;
				System.out.println(n);
				System.out.println(num);
				break;
			}
		}
		System.out.println(num - Math.pow(2,n));
		if(num - Math.pow(2,n) > 0){
			System.out.print("1");
			num -= Math.pow(2,n);
		}else{
			System.out.print("0");
		}
		// System.out.print(dec);
	}
}