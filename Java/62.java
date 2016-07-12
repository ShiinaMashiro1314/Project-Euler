public class Solution {
	public static int digitSum(long i) {
		int result = 0;
		while (i > 0) {
			result += (int) Math.pow(7, i%10);
			i /= 10;
		}
		return result;
	}
	public static void main(String[] args) {
		long[] count = new long[7*7*7*7*7*7*7*7*7*7];
		long i = 1;
		int d = digitSum(i*i*i);
		while (d != 47096358) {
			count[d]++;
			i++;
			d = digitSum(i*i*i);
		}
		System.out.println(i*i*i);
	}
}