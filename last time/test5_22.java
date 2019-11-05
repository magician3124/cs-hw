import java.util.Scanner;
import java.text.DecimalFormat;
public class test5_22{
	public static void main(String[] args){
		String seatFormat = "0.00";
		DecimalFormat df = new DecimalFormat(seatFormat);
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount:");
		double loanAmount = input.nextDouble();

		System.out.print("Number of Years:");
		double year = input.nextDouble();

		System.out.print("Annual Interest:");
		double annualInterest = input.nextDouble();

		double monthlyInterestRate = annualInterest/1200;
		double monthlyPayment;
		double totalPayment;
		double interest;

		double principal;
		double balance = loanAmount;
		System.out.println("Payment#" + "\t" + "Interest" + "\t" + "Principal" + "\t" + "Balance");
		for(int i = 0; i < year*12; i++){
			monthlyPayment = loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate, year*12));
			totalPayment = monthlyPayment*year*12;
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println((i+1) + "\t\t" + df.format(interest) + "\t\t" + df.format(principal) + "\t\t"+ df.format(balance));
		}
	}
}