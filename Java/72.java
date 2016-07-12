public class Solution {
	public static int totient(int i, ArrayList<Integer> primes) {
		ArrayList<Integer> primeFactors = new ArrayList<>();
		for (int p : primes) {
			if (i % p == 0) {
				primeFactors.add(p);
			}
		}
		for (int p : primeFactors) {
			i = i / p * (p-1);
		}
		return i;
	}
	public static void main(String[] args) {
		int N = 1000000; 
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
		long val = 0;
		
		for (int i = 2; i <= 1000000; i++) {
//			if (i % 10000 == 0)
//				System.out.println(i);
			val += totient(i,primes);
		}
		System.out.println(val);
	}
}