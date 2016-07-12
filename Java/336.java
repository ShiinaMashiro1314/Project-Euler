import java.util.*;


public class Solution { 
	public static int[] init(int x) {
		int[] result = new int[x];
		for (int i = 0; i < x; i++)
			result[i] = i;
		return result;
	}
	
	public static void rev(int[] pos, int i, int j) {
		while (i < j) {
			int temp = pos[i];
			pos[i] = pos[j];
			pos[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void update(int[] pos, int i, int j) {
		rev(pos,j,10);
		rev(pos,i,10);
	}
	
	public static void printList(int[] x) {
		for (int i = 0; i < 11; i++)
			System.out.print(" " + x[i]);
		System.out.println();
	}
	
	public static void printList(char[] x) {
		for (int i = 0; i < 11; i++)
			System.out.print(x[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] results = new String[362880];
		int count = 0;
		int i = 0;
		int n = 11;
		for (int j = i+1; j < n-1; j++) {
			i = 0;
			int[] pos = init(n);
			char[] temp = new char[n];
			//printList(pos);
			update(pos,i,j);
			//printList(pos);
			i = 1;
			//System.out.println(index);
			for (int a2 = i+1; a2 < n-1; a2++) {
				i = 1;
				int[] pos2 = Arrays.copyOf(pos, n);
				//printList(pos2);
				update(pos2,i,a2);
				//printList(pos2);
				i = 2;
				//System.out.println(index);
				for (int a3 = i+1; a3 < n-1; a3++) {
					i = 2;
					int[] pos3 = Arrays.copyOf(pos2, n);
					update(pos3,i,a3);
					i = 3;
					//System.out.println(index);
					for (int a4 = i+1; a4 < n-1; a4++) {
						i = 3;
						int[] pos4 = Arrays.copyOf(pos3, n);
						update(pos4,i,a4);
						i = 4;
						//System.out.println(index);
						for (int a5 = i+1; a5 < n-1; a5++) {
							i = 4;
							int[] pos5 = Arrays.copyOf(pos4, n);
							update(pos5,i,a5);
							i = 5;
							//System.out.println(index);
							for (int a6 = i+1; a6 < n-1; a6++) {
								i = 5;
								int[] pos6 = Arrays.copyOf(pos5, n);
								update(pos6,i,a6);
								i = 6;
								for (int a7 = i+1; a7 < n-1; a7++) {
									i = 6;
									int[] pos7 = Arrays.copyOf(pos6, n);
									update(pos7,i,a7);
									i = 7;
									for (int a8 = i+1; a8 < n-1; a8++) {
										i = 7;
										int[] pos8 = Arrays.copyOf(pos7, n);
										update(pos8,i,a8);
										i = 8;
										for (int a9 = i+1; a9 < n-1; a9++) {
											i = 8;
											int[] pos9 = Arrays.copyOf(pos8, n);
											update(pos9,i,a9);
											i = 9;
											for (int a10 = i+1; a10 <= n-1; a10++) {
												i = 9;
												int[] pos10 = Arrays.copyOf(pos9, n);
												update(pos10,i,a10);
												i = 10;
												for (int a11 = i; a11 <= n-1; a11++) {
													i = 10;
													int[] pos11 = Arrays.copyOf(pos10, n);
													update(pos11,i,a11);
													String s = "";
													//System.out.println(index);
													for (int k = 0; k < n; k++) {
														temp[pos11[k]] = (char) (k + 'A');
													}
													for (int k = 0; k < n; k++) {
														s += temp[k];
													}
													//System.out.println();
													results[count] = s;
													count++; 
													//System.out.println();
												}
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}
		
			
		Arrays.sort(results);
		System.out.println(results[2010]);
	}
}