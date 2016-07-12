public class Solution {
	public static int hash(int a) {
		int result = 0;
		while (a > 0) {
			result += (int) Math.pow(7,a%10);
			a /= 10;
		}
		return result;
	}
	
	public static boolean isPerm(int a, int b) {
		return hash(a) == hash(b);
	}
	public static int totient(int i, ArrayList<Integer> primes) {
		ArrayList<Integer> primeFactors = new ArrayList<>();
		for (int p : primes) {
			if (i % p == 0) {
				primeFactors.add(p);
			}
		}
		if (primeFactors.size() == 0)
			return 0;
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
		for (int i = 11; i < N; i++) {
			if (temp[i] == 0)
				primes.add(i);
		}
		int val = 87109;
		double min = (double)val/totient(val,primes);
		
		for (int i = 11; i < 10000000; i++) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 ||
					i % 7 == 0 || i % 11 == 0) {
				continue;
			}
			int x = totient(i,primes);
			if (x != 0) {
				if (isPerm(i,x)) {
					if ((double)i/x < min) {
						min = (double)i/x;
						val = i;
						System.out.println(val);
					}
				}
			}
		}
		System.out.println(val);
	}
}