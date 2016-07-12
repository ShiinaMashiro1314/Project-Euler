public class Solution {
	public static long getSum(int i) {
		long t = 5;
		for (int j = 0; j < 8; j++) {
			t = i*j + 5;
			if (t % 8 == 0)
				return (t/8 - 1);
		}
		return 0;
	}
	public static void main(String[] args) {
		int n = 100000000;
		long result = 0;
		int[] isPrime = new int[n];
		for (int j = 2; j*j < n; j++) {
			if (isPrime[j] == 0) {
				for (int k = j; k*j < n; k++)
					isPrime[j*k] = 1;
			}
		}
		
		
		for (int i = 5; i < n; i++) {
			if (isPrime[i] == 0) {
				result += getSum(i);
			}
		}
		System.out.println(result);
	}
}