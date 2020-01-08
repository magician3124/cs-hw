import java.util.Scanner;
import java.util.Random;
public class TradeProcess{
	public static void main(String[] args){
		Bob bob = new Bob();
		Alice alice = new Alice();
		Scanner input = new Scanner(System.in);
		Miner miner = new Miner();

		System.out.print("Enter the initial bitcoin in Bob's address:");
		bob.setMoney(input.nextInt());
		System.out.print("Enter the initial bitcoin in Alice's address:");
		alice.setMoney(input.nextInt());

		System.out.print("Enter the money Bob gives Alice:");
		int tradeMoney = input.nextInt();

		bob.modifier(-tradeMoney);
		alice.modifier(tradeMoney);
		String rawtransaction = rawTransactionDataGenerator();
		String fisrtHash = miner.getSHA256(rawtransaction);
		show(bob.addressValue, bob.money, alice.addressValue, alice.money);

		System.out.println("Start mining? [y/s]: ");
		char mineStart = input.next().charAt(0);
		if(mineStart == 'y'){
			while(fisrtHash.charAt(0)!=0 || fisrtHash.charAt(1)!=0 || fisrtHash.charAt(2)!=0){
				int nonce = 0;
				rawtransaction = rawtransaction + Integer.toString(nonce);
				fisrtHash = miner.getSHA256(rawtransaction);
				System.out.println(fisrtHash);
				nonce++;
			}
			System.out.println("congradulation! " + fisrtHash + " is a valid hash.");
		}else{
			System.out.println("Finished");
		}	
	}
	public static void show(String bobAddress, int bobMoney, String aliceAddress, int aliceMoney){
		System.out.println("Bob's address: " + bobAddress);
		System.out.println("the money left in Bob's address: " + bobMoney);
		System.out.println("Alice's address: " + aliceAddress);
		System.out.println("the money left in Alice's address: " + aliceMoney);
	}
	public static String rawTransactionDataGenerator(){
		Random rand = new Random();
		int myRandomNumber = rand.nextInt(0xffff + 1);
		return(Integer.toHexString(myRandomNumber));
	}
}