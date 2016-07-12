//http://mathworld.wolfram.com/PartitionFunctionP.html
public class Solution {
  public static void main(String[] args) {
    long time = System.currentTimeMillis();
    int N = 100000;
    int[] ans = new int[N];
    ans[1] = 1;
    for (int i = 2; i < N; i++) {
      for (int k = 1; k < i; k++) {
        if (i <= k*(3*k-1)/2)
          break;
        ans[i] += (k%2 == 0 ? -1 : 1) * ((i-k*(3*k-1)/2 > 0 ? ans[i-k*(3*k-1)/2] % 1000000 : 0)+
           (i-k*(3*k+1)/2 > 0 ? ans[i-k*(3*k+1)/2]%1000000 : 0));
        ans[i] %= 1000000;
      }
      if (ans[i] == 0) {
        System.out.println(i-1);
        break;
      }
    }
    System.out.println("Time: " + (System.currentTimeMillis()-time));
  }
}