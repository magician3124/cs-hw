public class test5_19{
	public static void main(String[] args) {
		for(int i = 0; i < 8; i++){
			int a = 3;
			for(int j = 35; j > 5*i; j--){
				System.out.printf(" ");
			}
			for(int j = 0; j < i; j++){
				if(Math.pow(a,j)<=10){
					System.out.printf(" ");
				}
				if(Math.pow(a,j)<=100){
					System.out.printf(" ");
				}
				if(Math.pow(a,j)<=1000){
					System.out.printf(" ");
				}
				if(Math.pow(a,j)<=10000){
					System.out.printf(" ");
				}
				System.out.printf(""+(int)Math.pow(a,j));
			}
			for(int n = i; n >= 0; n--){
				if(Math.pow(a,n)<=10){
					System.out.printf(" ");
				}
				if(Math.pow(a,n)<=100){
					System.out.printf(" ");
				}
				if(Math.pow(a,n)<=1000){
					System.out.printf(" ");
				}
				if(Math.pow(a,n)<=10000){
					System.out.printf(" ");
				}
				System.out.printf(""+(int)Math.pow(a,n));
			}
			System.out.println("");
		}
	}
}