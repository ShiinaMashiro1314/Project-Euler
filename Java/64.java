public class Solution {
	public static int get(int a) {
		int sq = (int) Math.pow(a,0.5);
		int b = sq;
		int c = 1;
		int count = 0;
		do {
			c = (a-b*b)/c;
			int temp = (sq+b)/c;
			count++;
			b = c*temp-b;
		} while(c != 1);
		return count;
		
	}
	public static void main(String[] args) {
		int result = 0;
		for (int i = 2; i < 10001; i++) {
			if ((int)Math.pow((int)(Math.pow(i, 0.5)), 2) != i) {
				if (get(i) % 2 == 1)
					result++;
			}
		}
		System.out.println(result);
	}
}