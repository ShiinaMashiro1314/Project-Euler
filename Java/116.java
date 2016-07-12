public class Solution {
  public static long comb(int a, int b) {
    long result = 1;
    for (int i = 0; i < b; i++) {
      result *= a-i;
      result /= i+1;
    }
    return result;
  }
  
  public static long calc(int N, int n) {
    long count = 0;
    for (int i = 1; i * n <= N; i++) {
      count += comb(N - (n-1) * (i-1) - (n-2) - 1, i);
    }
    return count;
  }
  
  public static void main(String[] args) {
    long time = System.currentTimeMillis();
    int N = 50;
    System.out.println(calc(N,2) + calc(N,3) + calc(N,4));
    System.out.println(System.currentTimeMillis() - time);
  }
}