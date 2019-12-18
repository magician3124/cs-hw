public class test7_20{
	public static void order(double[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			int index = i;
			for(int k = i+1; k < arr.length; k++){
				if(arr[k] < arr[index]){
					index = k;
				}
			}
			double small = arr[index];
			arr[index] = arr[i];
			arr[i] = small;
		}
	}
	public static void main(String[] args){
		double[] arr = {2.0, 4.0, 6.0, 8.0, 1.0, 3.0, 5.0, 7.0};
		System.out.println("Before Selection Sort:"); 
		for(double i: arr){
			System.out.print(i + " ");
		}
		System.out.println("");
		order(arr);
		System.out.println("After Selection Sort:"); 
		for(double i: arr){
			System.out.print(i + " ");
		}
	}
}