import java.util.Scanner;
public class test8_6 {
	public static void main(String[] args) {
		double[][] m1 = get(1);
		double[][] m2 = get(2);
		double[][] m3 = multiply(m1, m2);
		print(m1, m2, m3);
	}
	public static double[][] get(int n) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter matrix" + n + ": ");
		double[][] m = new double[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++)
				m[i][j] = input.nextDouble();
		}
		return m;
	}
	public static double[][] multiply(double[][] a, double[][] b) {
		double[][] d = new double[2][2];
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				for (int h = 0; h < d.length; h++) {
					d[i][j] =+ a[i][h] * b[h][j];
				}
			}
		}
		return d;
	}
	public static void print(double[][] m, int r) {	
		for (int j = 0; j < m[r].length; j++) {
			System.out.printf("%5.1f", m[r][j]);
		}	
	}
	public static void print(double[][] m1, double[][] m2, double[][] m3) {
		System.out.println("The matrices are added as follows");
		for (int i = 0; i < 2; i++) {
			print(m1, i);
			System.out.print((i == 1 ? "   * " : "     "));
			print(m2, i);
			System.out.print((i == 1 ? "   = " : "     "));
			print(m3, i);
			System.out.println();
		}
	}
}