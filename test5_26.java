public class test5_26{
	public static void main(String[] args){
		double e = 1;
		double item = 1;
		int i = 0;
		double temp = 1;
		while(i < 100000){
			i += 10000;
			for(int j = 0; j < i; j++){
				temp = temp/(j+1);
				e += temp;
			}
			System.out.println(e);
			System.out.println("this question is nonsense ==");
			System.out.println("my computer fail to run it");
		}
	}
}