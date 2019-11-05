public class test5_27{
	public static void main(String[] args){
		int leapyear;
		int num = 0;
		for(int i = 2014; i < 2115; i++){
			leapyear = 0;
			if(i%4 == 0 && i%100 != 0)
				leapyear++;
			if(i%400 == 0)
				leapyear++;
			if(leapyear > 0){
				if(num%10 == 0 && num != 0)
					System.out.println("");
				System.out.print(i + " ");
				num++;
			}
			
		}
	}
}