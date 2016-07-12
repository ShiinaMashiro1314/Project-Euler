import java.util.*;

public class Solution {
	public static boolean isValid(ArrayList<Integer> nums) {
		int sum = 0;
		for (int i : nums)
			sum += i;
		if (sum != 10)
			return false;
		sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += nums.get(i) * i;
		}
		return (sum == 23 || sum == 34 || sum == 45 || sum == 56 || sum == 67);
	}
	
	public static int comb(int a, int b) {
		if (b == 0)
			return 1;
		if (a == b)
			return 1;
		if (b == 1)
			return a;
		if (b == 2)
			return a * (a-1) / 2;
		return 1;
	}
	
	public static long get(ArrayList<Integer> nums) {
		long result = 1;
		int n = 10;
		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				result *= comb(9,nums.get(i));
				n -= nums.get(i);
			}
			else {
				result *= comb(n,nums.get(i));
				n -= nums.get(i);
			}
		}
		n = 10;
		for (int i : nums) {
			int temp = 2 - i;
			result *= comb(n,temp);
			n -= temp;
		}
		return result;	
	}
	public static void main(String[] args) {
		long count = 0;
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 59049; i++) {
			int temp = i;
			for (int j = 0; j < 10; j++) {
				nums.add(temp%3);
				temp /= 3;
			}
			if (isValid(nums))
				count += get(nums);
			nums.clear();
		}
		System.out.println(count);
	}
}