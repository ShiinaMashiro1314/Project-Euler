public class Solution {
	public static boolean isEqual(double a, double b) {
		final double EPSILON = 1e-9;
		return Math.abs(a-b) < EPSILON;
	}
	
	public static boolean isValid(int x1, int y1, int x2, int y2) {
		double a = Math.pow(x1*x1+y1*y1, 0.5);
		double b = Math.pow(x2*x2+y2*y2, 0.5);
		double c = Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1), 0.5);
		if (a == 0 || b == 0 || c == 0)
			return false;
		return (isEqual(a*a + b*b, c*c) || isEqual(a*a + c*c, b*b) || isEqual(c*c + b*b, a*a));
	}
	
	public static void main(String[] args) {
		int n = 50;
		int result = n * n;
		for (int x1 = 0; x1 <= n; x1++) {
			for (int y1 = 0; y1 <= n; y1++) {
				for (int x2 = x1+1; x2 <= n; x2++) {
					for (int y2 = 0; y2 <= n; y2++) {
						if (isValid(x1,y1,x2,y2))
							result++;
					}
				}
			}
		}
		System.out.println(result);
	}
}