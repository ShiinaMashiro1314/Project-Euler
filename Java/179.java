import java.util.*;

public class Solution {
	public static Map<Integer,Integer> getMap(int i, ArrayList<Map<Integer,Integer>> l, Set<Integer> primes) {
		for (int p : primes) {
			if (i % p == 0 && i != p) {
				Map<Integer,Integer> map = new HashMap<>();
				map.putAll(l.get(i/p));
				if (map.containsKey(p)) {
					map.put(p, map.get(p) + 1);
				}
				else
					map.put(p, 1);
				return map;
			}
			if (i <= p)
				break;
		}
		Map<Integer,Integer> map = new HashMap<>();
		map.put(i, 1);
		return map;
	}
	
	public static int get(Map<Integer,Integer> map) {
		int result = 1;
		for (int x : map.keySet()) {
			result *= map.get(x) + 1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		ArrayList<Map<Integer,Integer>> l = new ArrayList<>();
		l.add(new HashMap<Integer, Integer>());
		l.add(new HashMap<Integer, Integer>());
		int count = 0;
		int prev = 0;
		int N = 3162;
		int[] isPrime = new int[N];
		Set<Integer> primes = new LinkedHashSet<>();
		for (int i = 2; i*i < N; i++) {
			if (isPrime[i] == 0)
				for (int j = i; i*j < N; j++) {
					isPrime[i*j] = 1;
				}
		}
		for (int i = 2; i < N; i++) {
			if (isPrime[i] == 0)
				primes.add(i);
		}
		for (int i = 2; i < 1e7; i++) {
			Map<Integer,Integer> map = new HashMap<>();
			map = getMap(i, l, primes);
			l.add(map);
			int curr = get(map);
			if (curr == prev)
				count++;
			prev = curr;
		}
		System.out.println(count);
	}
}