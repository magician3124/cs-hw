public class test5_25{
	public static void main(String[] args){
		double temp = 0;
		double num = 1;
		int j = 0;
		while(j < 100000){
			j += 10000;
			for(int i = 0; i < j; i++){
				if(i%2 != 0){
					for(int k = 0; k < j; k ++){
						if(k%2 != 0){
							num += temp;
						}else{
							num -= temp;
						}
						temp = Math.pow(-1, (i+1))/(2*i-1);
					}
				}else{
					continue;
				}
			}
			System.out.println(j + "\t" + num*4);
		}
	}
}