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
	// 1 = o
	// 2 = x
	public static int game_check(int[][] block){
		if(block[0][0] == block[0][1] && block[0][1] == block[0][2] && block[0][0] == block[0][2])
			return block[0][0];
		if(block[1][0] == block[1][1] && block[1][1] == block[1][2] && block[1][0] == block[1][2])
			return block[1][0];
		if(block[2][0] == block[2][1] && block[2][1] == block[2][2] && block[2][0] == block[2][2])
			return block[2][0];
		if(block[0][0] == block[1][0] && block[1][0] == block[2][0] && block[0][0] == block[2][0])
			return block[0][0];
		if(block[0][1] == block[1][1] && block[1][1] == block[2][1] && block[0][1] == block[2][1])
			return block[0][1];
		if(block[0][2] == block[1][2] && block[1][2] == block[2][2] && block[0][2] == block[2][2])
			return block[0][2];
		if(block[0][0] == block[1][1] && block[1][1] == block[2][2] && block[0][0] == block[2][2])
			return block[0][0];
		if(block[0][2] == block[1][1] && block[1][1] == block[2][0] && block[0][2] == block[2][0])
			return block[0][2];
		return 0;
	}
	public static void main(String[] args){
		int[][] block = {
			{0, 0, 0},
			{0, 0, 0},
			{0, 0, 0},
		};
		Scanner input = new Scanner(System.in);
		int game_status = 0;
		int row;
		int column;
		int finish = 0;
		while(game_status == 0){
			display(block);
			while(finish == 0){
				System.out.print("Enter a row(0, 1, or 2) for player X: ");
				row = input.nextInt();
				System.out.print("Enter a column(0, 1, or 2) for player X: ");
				column = input.nextInt();
				if(block[row][column] == 0){
					block[row][column] = 1;
					finish++;
				}else{
					System.out.println("Sorry this block is taken");
				}
			}
			finish = 0;
			display(block);
			game_status = game_check(block);
			if(game_status != 0)
				break;

			while(finish == 0){
				System.out.print("Enter a row(0, 1, or 2) for player O: ");
				row = input.nextInt();
				System.out.print("Enter a column(0, 1, or 2) for player O: ");
				column = input.nextInt();
				if(block[row][column] == 0){
					block[row][column] = 2;
					finish++;
				}else{
					System.out.println("Sorry this block is taken");
				}
			}
			finish = 0;
			game_status = game_check(block);
			if(game_status != 0)
				break;
		}
		if(game_status == 1){
			System.out.println("X won");
		}else{
			System.out.println("O won");
		}
	}
}
