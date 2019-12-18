public class test8_7 {
	public static void main(String[] args) {
		double[][] arr = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},                      
			{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},                          
			{5.5, 4, -0.5}};
		int p1 = 0, p2 = 1, p3 = 3; 
		double shortest = distance(arr[p1][0], arr[p1][1], arr[p1][2],
			arr[p2][0], arr[p2][p1], arr[p3][p2]); 
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				double distance = distance(arr[i][0], arr[i][1], arr[i][2],
					arr[j][0], arr[j][1], arr[j][2]); 
				if (shortest > distance) {
					p1 = i; 
					p2 = j;
					shortest = distance; 
				}
			}
		}
		System.out.println("The closest two points are " +
			"(" + arr[p1][0] + ", " + arr[p1][1] + ") and (" +
				arr[p2][0] + ", " + arr[p2][1] + ")");
	}
	public static double distance(
		double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) +  
			Math.pow(y2 - y1, 2) + Math.pow(y2 - y1, 2));
	}
}