public class test9_2{
	public static void main(String[] args){
		Stock mystock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		getChangePercent(mystock);
		System.out.println(mystock.percent);
	}
	public static void getChangePercent(Stock a){
		a.percent = a.previousClosingPrice / a.currentPrice;
		a.percent *= 100;
	}	
}
class Stock{
	String symbol;
	String name;
	double percent;
	double currentPrice;
	double previousClosingPrice;
	Stock(){
		symbol = null;
		name = null;
		percent = 0;
		currentPrice = 0;
		previousClosingPrice = 0;
	}
	Stock(String nickName, String fullName, double cp, double pcp){
		symbol = nickName;
		name = fullName;
		currentPrice = cp;
		previousClosingPrice = pcp;
	}

	

}