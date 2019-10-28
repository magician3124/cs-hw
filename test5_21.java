import java.util.Scanner;
import java.text.DecimalFormat;
public class test5_21 {
  public static void main(String[] args) {
  	String seatFormat = "0.00";
  	DecimalFormat df = new DecimalFormat(seatFormat);
    Scanner input = new Scanner(System.in);
    double annualInterestRate = 5.00;
    double monthlyInterestRate = annualInterestRate/1200;
    System.out.print("Loan Amount: ");
    double loanAmount = input.nextDouble();
    System.out.print("Number of Years: ");
    int numberOfYears = input.nextInt();
    System.out.println("interest rate 	Monthly Payment 	Total Payment");
    double monthlyPayment;
    double totalPayment;

    while(annualInterestRate <= 10){
    	monthlyInterestRate = annualInterestRate/1200;
    	monthlyPayment = loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
    	totalPayment = monthlyPayment*numberOfYears*12;
    	System.out.print(df.format(annualInterestRate));
    	System.out.print(" 		");
    	System.out.print((int)(monthlyPayment*100)/100.0);
    	System.out.print(" 		 	");
   		System.out.print((int)(totalPayment*100)/100.0);
   		System.out.println("");
   		annualInterestRate = annualInterestRate + 0.25;
    }
  }
}