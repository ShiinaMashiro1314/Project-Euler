public class Solution {
	public static long get(int t) {
		int p = t*t;
		long max = 2*t;
		int a = t-1;
		int b = t+1;
		for (int i = 2; i < p; i++) {
			a = a * (t-1) % p;
			b = b * (t+1) % p;
			if ((a+b) % p > max)
				max = (a+b) % p;
		}
		return max;
	}
	
	public static void main(String[] args) {
		long result = 0;
		long time = System.currentTimeMillis();
		for (int a = 3; a < 1001; a++) {
			result += get(a);
		}
		System.out.println(result);
		System.out.println("Time: " + (System.currentTimeMillis() - time));
	}
}