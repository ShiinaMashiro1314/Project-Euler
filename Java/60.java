public class Solution {
	public static boolean isValid(int a, int b, int[] isPrime) {
		int i = (int) Math.log10(a);
		int j = (int) Math.log10(b);
		int x = a * (int) Math.pow(10, j+1) + b;
		int y = b * (int) Math.pow(10, i+1) + a;
		if (x >= 100000000 || y >= 100000000 || x < 0 || y < 0)
			return false;
		return (isPrime[x] == 0) && (isPrime[y] == 0);
	}
	public static void main(String[] args) {
		int n = 100000000;
		int[] isPrime = new int[n];
		for (int j = 2; j*j < n; j++) {
			if (isPrime[j] == 0) {
				for (int k = j; k*j < n; k++)
					isPrime[j*k] = 1;
			}
		}
		for (int i = 3; i < 100; i+=2) {
			if (isPrime[i] == 0) {
				for (int j = i+2; j < 10000; j+=2) {
					if (isPrime[j] == 0 && isValid(i,j,isPrime)) {
						for (int k = j+2; k < 10000; k+=2) {
							if (isPrime[k] == 0 && isValid(i,k,isPrime)
									&& isValid(j,k,isPrime)){
								for (int l = k+2; l < 10000; l+=2) {
									if (isPrime[l] == 0 && isValid(i,l,isPrime)
											&& isValid(j,l,isPrime) && isValid(k,l,isPrime)) {
										for (int m = l+2; m < 10000; m+=2) {
											if (isPrime[m] == 0 && isValid(i,m,isPrime)
												&& isValid(j,m,isPrime) && isValid(k,m,isPrime)
												&& isValid(l,m,isPrime)) {
												System.out.println(i +" "+j+" "+k+" "+l+" "+m);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}