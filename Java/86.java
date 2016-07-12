public class Solution {
	public static boolean isSquare(long x) {
		long a = (long) Math.pow(x, 0.5);
		return a*a == x;
	}
	
	public static int combin(int j, int i) {
		if (j > i)
			return (j/2) - (j-i) + 1;
		else
			return (j/2);
	}
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int M = 1817;
		int count = 0;
		for (int i = 1; i <= M; i++) {
			for (int j = 2; j <= 2*i; j++) {
				if (isSquare(j*j+i*i))
					count += combin(j,i);
				}
			}
		System.out.println(count);
		System.out.println("Time:" +
                (System.currentTimeMillis() - time));
	}
}