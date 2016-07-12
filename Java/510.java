public class Solution {
	public static long gcd(long a, long b) {
		if (a > b)
			return gcd(b,a);
		if (a == 0)
			return b;
		return gcd(b%a,a);
	}
	
	public static void main(String[] args) {
		long result = 0;
		long N = 1000000000;
		for (long a = 1; a*a*a*a <= N; a++) {
			for (long b = a; b*b*b*b <= N; b++) {
				if (gcd(a,b) == 1) {
					for (long p = (a+b)*(a+b); p*b*b <= N; p += (a+b)*(a+b)) {
						long c = p*a*a*b*b/((a+b)*(a+b));
						result += (p*a*a+p*b*b+c);
					}
				}
			}
		}
		System.out.println(result);
	}
}