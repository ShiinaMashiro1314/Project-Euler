import java.util.*;

public class Solution {
	public static int getNum(int i, int diff, int[] isPrime) {
		int result = 0;
		for (int j = 0; j < 9; j ++) {
			if (isPrime[i+j*diff] == 0)
				result++;
		}
		return result;
	}
	
	public static ArrayList<Integer> getDiff(int i) {
		ArrayList<Integer> temp = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		int count = 0;
		while (i > 0) {
			if (i % 10 == 1)
				temp.add((int) (Math.pow(10, count)));
			i /= 10;
			count++;
		}
		int n = temp.size();
		if (n == 0)
			return temp;
		else {
			for (int j = 0; j < 1<<n; j++) {
				int num = 0;
				for (int k = 0; k < n; k++) {
					if (((j >> k) & 1) == 1) {
						num += temp.get(k);
					}
				}
				result.add(num);
			}
		}
		return result;
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
		
		int i = 56003;
		ArrayList<Integer> diff = new ArrayList<>();
		while (true) {
			i += 2;
			if (isPrime[i] == 0) {
				diff = getDiff(i);
				if (diff.size() != 0) {
					for (int x : diff) {
						if (getNum(i,x,isPrime) == 8) {
							System.out.println(i);
							System.exit(1);
						}
					}
				}
			}	
		}
	}
}