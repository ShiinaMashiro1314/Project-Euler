import java.util.*;


public class Solution {
	public static int get(int x) {
		ArrayList<Integer> l = new ArrayList<>();
		int N = 100000;
		for (int i = 2; i*i < x; i++) {
			if (x % i == 0) {
				l.add(i);
				while (x % i == 0) {
					x /= i;
				}	
			}	
		}
		if (x != 1)
			l.add(x);
		if (l.size() == 1)
			return (int) (Math.log(N) / Math.log(l.get(0)));
		else if (l.size() == 2){
			int result = 0;
			int a = l.get(0);
			int b = l.get(1);
			for (int i = 1; Math.pow(a, i) * b <= N; i++) {
				for (int j = 1; Math.pow(a, i) * Math.pow(b, j) <= N; j++) {
					result++;
				}
			}
			return result;
		}
		else if (l.size() == 3){
			int result = 0;
			int a = l.get(0);
			int b = l.get(1);
			int c = l.get(2);
			for (int i = 1; Math.pow(a, i) * b * c <= N; i++) {
				for (int j = 1; Math.pow(a, i) * Math.pow(b, j) * c <= N; j++) {
					for (int k = 1; Math.pow(a, i) * Math.pow(b, j) * Math.pow(c, k) <= N; k++) {
						result++;
					}
				}
			}
			return result;
		}
		else if (l.size() == 4){
			int result = 0;
			int a = l.get(0);
			int b = l.get(1);
			int c = l.get(2);
			int d = l.get(3);
			for (int i = 1; Math.pow(a, i) * b * c * d <= N; i++) {
				for (int j = 1; Math.pow(a, i) * Math.pow(b, j) * c * d <= N; j++) {
					for (int k = 1; Math.pow(a, i) * Math.pow(b, j) * Math.pow(c, k) * d <= N; k++) {
						for (int m = 1; Math.pow(a, i) * Math.pow(b, j) * Math.pow(c, k) * Math.pow(d, m) <= N; m++) {
							result++;
						}
						
					}
				}
			}
			return result;
		}
		else {
			int result = 0;
			int a = l.get(0);
			int b = l.get(1);
			int c = l.get(2);
			int d = l.get(3);
			int e = l.get(4);
			for (int i = 1; Math.pow(a, i) * b * c * d * e <= N; i++) {
				for (int j = 1; Math.pow(a, i) * Math.pow(b, j) * c * d * e <= N; j++) {
					for (int k = 1; Math.pow(a, i) * Math.pow(b, j) * Math.pow(c, k) * d * e <= N; k++) {
						for (int m = 1; Math.pow(a, i) * Math.pow(b, j) * Math.pow(c, k) * Math.pow(d, m) * e <= N; m++) {
							for (int n = 1; Math.pow(a, i) * Math.pow(b, j) * Math.pow(c, k) * Math.pow(d, m) * Math.pow(e, n) <= N; k++) {
								result++;
							}
							
						}
						
					}
				}
			}
			return result;
		}
	}
	
	public static boolean isValid(int x) {
		for (int i = 2; i*i <= x; i++) {
			if (x % i == 0) {
				x /= i;
				if (x % i == 0)
					return false;
			}	
		}
		return true;
	}
	
	public static void main(String[] args) {
		int count = 1;
		int i = 2;
		while (count + get(i) < 10000) {
			System.out.println(i);
			System.out.println(get(i));
			System.out.println();
			count += get(i);
			i++;
			while (! isValid(i))
				i++;
		}
		System.out.println(i);
		System.out.println(count);
	}
}