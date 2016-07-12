import java.math.BigInteger;
import java.util.*;


public class Solution {
	public static boolean isValid(BigInteger x, ArrayList<Integer> primes) {
		for (int p : primes) {
			BigInteger temp = BigInteger.valueOf(p);
			if (x.mod(temp.multiply(temp)) == BigInteger.ZERO)
				return false;
		}
		return true;
	}
	
	public static BigInteger comb(int a, int b) {
		BigInteger x = BigInteger.ONE;
		BigInteger y = BigInteger.ONE;
		for (int i = 1; i <= b; i++) {
			x = x.multiply(BigInteger.valueOf(a-b+i));
			y = y.multiply(BigInteger.valueOf(i));

		}
		return x.divide(y);
	}
	
	public static void main(String[] args) {
		int n = 50;
		BigInteger result = BigInteger.ZERO;
		int[] isPrime = new int[n];
		ArrayList<Integer> primes = new ArrayList<>();
		ArrayList<BigInteger> nums = new ArrayList<>();
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
		
		for (int i = 1; i <= 50; i++) {
			nums.add(BigInteger.valueOf(i));
			if (isValid(BigInteger.valueOf(i),primes)) {
				result = result.add(BigInteger.valueOf(i));
			}	
		}
		for (int i = 4; i <= 50; i++) {
			for (int j = 2; j <= (i/2); j++) {
				BigInteger t = comb(i,j);
				if (!nums.contains(t)) {
					nums.add(t);
					if (isValid(t,primes))
						result = result.add(t);
				}
			}
		}
		System.out.println(result);
	}
}