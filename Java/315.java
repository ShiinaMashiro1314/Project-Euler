public class Solution {
	public static int[] getBool(int x) {
		switch (x) {
		case 0: {int[] result = {1,1,1,1,1,1,0}; return result;}
		case 1: {int[] result = {0,0,1,1,0,0,0}; return result;}
		case 2: {int[] result = {0,1,1,0,1,1,1}; return result;}
		case 3: {int[] result = {0,1,1,1,1,0,1}; return result;}
		case 4: {int[] result = {1,0,1,1,0,0,1}; return result;}
		case 5: {int[] result = {1,1,0,1,1,0,1}; return result;}
		case 6: {int[] result = {1,1,0,1,1,1,1}; return result;}
		case 7: {int[] result = {1,1,1,1,0,0,0}; return result;}
		case 8: {int[] result = {1,1,1,1,1,1,1}; return result;}
		default: {int[] result = {1,1,1,1,1,0,1}; return result;}
		}
	}
	
	public static int getDigit(int[] x, int[] y) {
		int result = 0;
		for (int i = 0; i < 7; i++) {
			if (x[i] == 1 && y[i] == 1)
				result++;
		}
		return result;
	}
	
	public static int getInt(int x, int y) {
		int result = 0;
		if (x > y)
			return getInt(y,x);
		while (x > 0) {
			result += getDigit(getBool(x%10),getBool(y%10));
			x /= 10;
			y /= 10;
		}
		return result;
	}
	
	public static int digitSum(int p) {
		int result = 0;
		while (p > 0) {
			result += p % 10;
			p /= 10;
		}
		return result;
	}
	
	public static int get(int p) {
		int result = 0;
		while (p >= 10) {
			int temp = digitSum(p);
			result += getInt(temp,p);
			p = temp;
		}
		return 2*result;
	}
	
	public static void main(String[] args) {
		int N = 20000000;
		int[] isPrime = new int[N];
		long result = 0;
		long time = System.currentTimeMillis();
		for (int i = 2; i*i < N; i++) {
			if (isPrime[i] == 0)
				for (int j = i; i*j < N; j++) {
					isPrime[i*j] = 1;
				}
		}
		for (int i = N/2; i < N; i++)
			if (isPrime[i] == 0) {
				result += get(i);
			}
				
		System.out.println(result);
		System.out.println("Time: " + (System.currentTimeMillis() - time));
	}
}