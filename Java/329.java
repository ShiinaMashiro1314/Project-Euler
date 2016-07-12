class frac {
	long a;
	long b;
	private long gcd (long a, long b) {
		if (a > b)
			return gcd(b,a);
		if (a == 0)
			return b;
		return gcd(b%a, a);
	}
	
	frac(long a, long b) {
		long c = gcd(a,b);
		this.a = a / c;
		this.b = b / c;
	}
	frac add(frac f) {
		long x = gcd(this.b, f.b);
		return new frac(this.a*(f.b/x)+f.a*(this.b/x),this.b*(f.b/x));
	}
	
	frac mult(frac f) {
		return new frac(this.a*f.a,this.b*f.b);
	}
	@Override
	public String toString() {
		return "" + a + " " + b;
	}
}

public class Solution {
	public static frac get(frac prob, int[] pos, int[] isPrime) {
		for (int i = 0; i < 4; i++) {
			prob = prob.mult((isPrime[pos[i]] == 0) ? new frac(2,3) : new frac(1,3));
		}
		for (int i = 4; i < 6; i++) {
			prob = prob.mult((isPrime[pos[i]] == 0) ? new frac(1,3) : new frac(2,3));
		}
		for (int i = 6; i < 9; i++) {
			prob = prob.mult((isPrime[pos[i]] == 0) ? new frac(2,3) : new frac(1,3));
		}
		for (int i = 9; i < 10; i++) {
			prob = prob.mult((isPrime[pos[i]] == 0) ? new frac(1,3) : new frac(2,3));
		}
		for (int i = 10; i < 12; i++) {
			prob = prob.mult((isPrime[pos[i]] == 0) ? new frac(2,3) : new frac(1,3));
		}
		for (int i = 12; i < 13; i++) {
			prob = prob.mult((isPrime[pos[i]] == 0) ? new frac(1,3) : new frac(2,3));
		}
		for (int i = 13; i < 14; i++) {
			prob = prob.mult((isPrime[pos[i]] == 0) ? new frac(2,3) : new frac(1,3));
		}
		for (int i = 14; i < 15; i++) {
			prob = prob.mult((isPrime[pos[i]] == 0) ? new frac(1,3) : new frac(2,3));
		}
		return prob;
	}
	
	public static void main(String[] args) {
		frac result = new frac(0,1);
		int N = 501;
		int[] isPrime = new int[N];
		for (int i = 2; i*i < N; i++) {
			if (isPrime[i] == 0)
				for (int j = i; i*j < N; j++) {
					isPrime[i*j] = 1;
				}
		}
		isPrime[1] = 1;
		for (int i = 1; i <= 500; i++) {
			for (int n = 0; n < 1<<14; n++) {
				int tempi = i;
				int[] pos = new int[15];
				int temp = n;
				pos[0] = tempi;
				frac prob = new frac(1,500);
				for (int j = 1; j < 15; j++) {
					int change = (temp % 2 == 0) ? -1 : 1;
					temp /= 2;
					if (tempi == 1 || tempi == 500) {
						if (tempi == 1) {
							if (change == -1) {
								break;
							}
							else {
								tempi = 2;
								pos[j] = 2;
							}
						}
						else {
							if (change == 1) {
								break;
							}
							else {
								tempi = 499;
								pos[j] = 499;
							}
						}
					}
					else {
						prob = prob.mult(new frac(1,2));
						tempi += change;
						pos[j] = tempi;
					}
					if (j == 14) {
						prob = get(prob, pos, isPrime);
						result = result.add(prob);
					}
						
				}			
			}
		}
		System.out.println(result.a);
		System.out.println(result.b);
	}
}