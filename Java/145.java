public class Solution {
	public static int rev(int i) {
		int result = 0;
		while (i > 0) {
			result *= 10;
			result += i % 10;
			i /= 10;
		}
		return result;
	}
	
	public static boolean isValid(int i) {
		if (i % 10 == 0)
			return false;
		int x = i + rev(i);
		while (x > 0) {
			if (x % 2 == 0)
				return false;
			else
				x /= 10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 1E9; i++) {
			if (isValid(i))
				count++;
		}
		System.out.println(count);
	}
}