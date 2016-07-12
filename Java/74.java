public class Solution {
	public static int getSum(int i, int[] factorial) {
		int result = 0;
		while (i > 0) {
			result += factorial[i%10];
			i /= 10;
		}
		return result;
	}
	
    public static void main(String[] args) {
    	int[] factorial = {1,1,2,6,24,120,720,5040,40320,362880};
    	int[] results = new int[10000000];
    	int count = 0;

    	for (int i = 1; i < 1000000; i++) {
    		if (true) {
    			//System.out.println(i);
    			int temp = i;
        		ArrayList<Integer> array = new ArrayList<>();
        		while ((!array.contains(temp)) && results[temp] == 0) {
        			array.add(temp);
        			//System.out.println("    " + temp);
        			temp = getSum(temp,factorial);
        			}
        		int n = array.size();
        		results[array.get(0)] = n + results[temp];
        		
        		if (n + results[temp]	 == 60)
        			count++;
//        		for (int j = 0; j < n; j++) {
//        			results[array.get(j)] = n - j + x;
//        		}
    		}
    	}
//    	for (int i = 1; i < 1000000; i++) {
//    		if (results[i] == 60)
//    			count++;
//    	}
    	System.out.println(count);
    }
}