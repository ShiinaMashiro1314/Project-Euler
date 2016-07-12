import java.util.*;


public class Solution {
	public static void main(String[] args) {
		int n = 50000000;
		int[] isPrime = new int[n];
		int result;
		ArrayList<Integer> primes = new ArrayList<>();
		for (int j = 2; j*j < n; j++) {
			if (isPrime[j] == 0) {
				for (int k = j; j*k < n; k++)
					isPrime[j*k] = 1;
			}
		}
		for (int i = 2; i < n; i++) {
			if (isPrime[i] == 0)
				primes.add(i);
		}
		result = primes.size();
		for (int i = 1; primes.get(i)*primes.get(i) < 2*n; i++) {
			for (int j = i; primes.get(i)*primes.get(j) < 2*n; j++) {
				result++;
			}	
		}
		
		System.out.println(result);
	}
}