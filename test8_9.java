import java.util.Scanner;
public class test8_9{
	public static void display(int[][] block){
		String ox [] = {" ", "x", "o"};
		System.out.println("-------");
		System.out.println("|" + ox[block[0][0]] + "|" + ox[block[0][1]] + "|" + ox[block[0][2]] + "|");
		System.out.println("|" + ox[block[1][0]] + "|" + ox[block[1][1]] + "|" + ox[block[1][2]] + "|");
		System.out.println("|" + ox[block[2][0]] + "|" + ox[block[2][1]] + "|" + ox[block[2][2]] + "|");
		System.out.println("-------");
	}
	public static void main(String[] args){
		int[][] block = {
			{0, 0, 0},
			{0, 0, 0},
			{0, 0, 0},
		};
		Scanner input = new Scanner(System.in);
		boolean game_status = false;
		int row;
		int column;
		// while(game_status = false){
			System.out.print("Enter a row(0, 1, or 2) for player X: ");
			row = input.nextInt();
			System.out.print("Enter a column(0, 1, or 2) for player X: ");
			column = input.nextInt();
			block[row][column] = 1;
			display(block);
			System.out.print("Enter a row(0, 1, or 2) for player X: ");
			row = input.nextInt();
			System.out.print("Enter a column(0, 1, or 2) for player X: ");
			column = input.nextInt();
			block[row][column] = 2;
			display(block);
		// }



	}
}
