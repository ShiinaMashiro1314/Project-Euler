public class Solution {
	public static boolean isSquare(int x){
		int a = (int) Math.pow(x,0.5);
		return a*a == x;
	}
	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		if (a > b)
			return gcd(b,a);
		return gcd(b%a, a);
	}
	public static int getNum(int a, int b) {
		return gcd(a,b) - 1;
	}
	public static int getLattice(int a, int b, int c, int d) {
		int S = (a+c) * (b+d) / 2;
		int s = (4 + getNum(a,b) + getNum(b,c) + getNum(c,d) + getNum(d,a))/2;
		return S + 1 - s;
	}
	public static void main(String[] args) {
		int m = 100;
		int count = 0;
		for (int a = 1; a <= m; a++) {
			for (int b = 1; b <= m; b++) {
				for (int c = 1; c <= m; c++) {
					for (int d = 1; d <= m; d++) {
						if (isSquare(getLattice(a,b,c,d)))
							count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}