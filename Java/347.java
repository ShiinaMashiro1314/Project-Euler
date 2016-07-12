public class Solution {
	public static long getNum(int n, int a, int b) {
		long i = (long)(Math.log(n)/Math.log(a));
		long max = (long) Math.pow(a,i);
		while (max * a < n) {
			max *= a;
			i++;
		}
		long temp = max;
		max = 0;
//		max = 0;
//		int i = 1;
//		long max = a * b;
//		while (max <= n) {
//			max *= a;
//			i++;
//		}
//		max /= a;
//		i--;
//		long temp = max;
		while (i > 1) {
			temp /= a;
			if (temp * b <= n) {
				temp *= b;
				if (temp > max) {
					max = temp;
				}
			}
			i--;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int n = 5000000;
		int[] isPrime = new int[n];
		for (int j = 2; j*j < n; j++) {
			if (isPrime[j] == 0) {
				for (int k = j; k*j < n; k++)
					isPrime[j*k] = 1;
			}
		}
		long result = 0;
		for (int i = 2; i*i < 2*n; i++) {
			if (isPrime[i] == 0) {
				if (i == 2) {
					for (int j = 3; i*j <= 2*n; j += 2) {
						if (isPrime[j] == 0) {
							result += getNum(2*n,i,j);
							//System.out.println(i + " " + j + " " + getNum(2*n,i,j));
						}
							
					}
				}
				else {
					for (int j = i + 2; i*j <= 2*n; j += 2) {
						if (isPrime[j] == 0) {
							result += getNum(2*n,i,j);
							//System.out.println(i + " " + j + " " + getNum(2*n,i,j));
						}	
					}
				}
			}
			if (i % 2 == 1)
				i++;
		}
		System.out.println(result);
	}
}