public class Solution {
  public static void main(String[] args) {
    long time = System.currentTimeMillis();
    int N = 1000000;
    int count = 0;
    for (int i = 1; i * (i + 2) <= N / 4; i ++) {
      count += (N / (4 * i) - i);
    }
    System.out.println(count);
    System.out.println(System.currentTimeMillis() - time);
  }
}