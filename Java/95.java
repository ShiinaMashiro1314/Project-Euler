import java.util.ArrayList;

public class Solution {
  public static void main(String[] args) {
    long time = System.currentTimeMillis();
    int N = 1000000;
    int[] nums = new int[N];
    boolean[] notPrime = new boolean[N];
    for (int j = 2; j * j < N; j++) {
      if (!notPrime[j]) {
        for (int k = j; j * k < N; k++)
          notPrime[j * k] = true;
      }
    }
    ArrayList<Integer> primes = new ArrayList<>();
    for (int i = 2; i < N; i++) {
      if (! notPrime[i])
        primes.add(i);
    }
    for (int i = 2; i < N; i++) {
      if (! notPrime[i])
        nums[i] = 1 + i;
      else {
        for (int p : primes) {
          if (i % p == 0) {
            int count = 1;
            int temp = i;
            while (temp % p == 0) {
              temp /= p;
              count *= p;
            }
            nums[i] = nums[temp] * (count*p-1) / (p-1);
            break;
          }
        }
      }
    }
    for (int i = 2; i < N; i++)
      nums[i] -= i;
    int result = 0;
    int max = 0;
    for (int i = 2; i < N; i++) {
      if (notPrime[i] && nums[i] > 0 && nums[i] < N) {
        int curr = nums[i];
        nums[i] = -1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (curr < N && curr > 1 && !temp.contains(curr)) {
          temp.add(curr);
          int t = curr;
          curr = nums[curr];
          nums[t] = -1;
        }
        if (temp.contains(curr)) {
          int start = temp.indexOf(curr);
          int length = temp.size() - start;
          if (length > max) {
            max = length;
            int min = curr;
            for (int j = start+1; j < temp.size(); j++) {
              if (temp.get(j) < min)
                min = temp.get(j);
            }
            result = min;
          }
        }
      }
    }
    System.out.println(result);
    System.out.println("Time: " + (System.currentTimeMillis() - time));
  }
}