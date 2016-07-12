public class Solution {
	public static void main(String[] args) {
		int N = 7100;
		int[] temp = new int[N];
		int[] results = new int[50000000];
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
		
		for (int c : primes) {
			int c4 = c * c * c * c;
			if (c4 > 50000000)
				break;
			else {
				for (int b : primes) {
					int b3 = b * b * b;
					if (b3 + c4 > 50000000)
						break;
					else {
						for (int a : primes) {
							int a2 = a * a;
							if (a2 + b3 + c4 > 50000000)
								break;
							else
								results[a2+b3+c4] = 1;
						}
					}
				}
			}
		}
		int count = 0;
		for (int i = 0 ; i < 50000000; i++) {
			count += results[i];
			if (count == 100)
				System.out.println(count);
		}
		System.out.println(count);
	}
}