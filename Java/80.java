public class Solution {
	public static int getVal(BigDecimal y) {
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			y = y.multiply(BigDecimal.valueOf(10));
			result += y.intValue();
			y = y.subtract(BigDecimal.valueOf(y.intValue()));
		}
		return result;
	}
	public static int get(int x) {
		int a = (int) Math.pow(x, 0.5);
		BigDecimal y = BigDecimal.valueOf((int) Math.pow(x, 0.5));
		int result = 0;
		for (int i = 1; i <= 99; i++) {
			int j = 0;
			BigDecimal temp = (BigDecimal.valueOf(0.1).pow(i));
			while (y.add(temp).multiply(y.add(temp)).compareTo(BigDecimal.valueOf(x)) < 0) {
				y = y.add(temp);
				j++;
			}
			result += j;
		}
		return result + a;
	//	return getVal(y.subtract(BigDecimal.valueOf(y.intValue())));
	}
	public static void main(String[] args) {
		int result = 0;
		for (int i = 2; i < 100; i++) {
			if ((int)(Math.pow(i, 0.5)) * (int)(Math.pow(i, 0.5)) != i) {
				result += get(i);
			}
		}
		System.out.println(result);
	}
}