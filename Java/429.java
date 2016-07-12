public class Solution {
//	public static void change(int n, int[] count, ArrayList<Integer> primes) {
//		int i = 0;
//		while (n > 1) {
//			int p = primes.get(i);
//			if (n % p == 0) {
//				n /= p;
//				count[i]++;
//			}
//			else 
//				i++;
//		}
//	}
	
	public static long num(int prime, int N) {
		int t = 0;
		while (N > 0) {
			N /= prime;
			t += N;
		}
		long result = 1;
		for (int i = 0; i < t; i++) {
			result *= prime;
			result %= 1000000009;
		}
		return (result*result) % 1000000009;
	}
	
	public static void main(String[] args) {
		int N = 100000000;
		int[] temp = new int[N];
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 2; i*i < N; i++) {
			if (temp[i] == 0) {
				for (int j = i; i*j < N; j++) {
					temp[i*j] = 1;
				}
			}
		}
		for (int i = 2; i < N; i++) {
			if (temp[i] == 0)
				primes.add(i);
		}
		int n = primes.size();
		long[] count = new long[n];
		for (int i = 0; i < n; i++) {
			count[i] = num(primes.get(i),N);
		}
		long result = 1;
		for (int i = 0; i < n; i++) {
			result *= count[i] + 1;
			result %= 1000000009;
		}
		System.out.println(result);
	}
}