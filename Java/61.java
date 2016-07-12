public class Solution {
	public static void main(String[] args) {
		int[][] trans = new int[6][100];
		
		for (int i = 15; i < 150; i++) {
			int temp = i*(i+1)/2;
			if (1000 < temp && temp < 10000 && temp%100 > 9) {
				trans[0][temp/100] = temp % 100;
			}
			temp = i*i;
			if (1000 < temp && temp < 10000 && temp%100 > 9) {
				trans[1][temp/100] = temp % 100;
			}
			temp = i*(3*i-1)/2;
			if (1000 < temp && temp < 10000 && temp%100 > 9) {
				trans[2][temp/100] = temp % 100;
			}
			temp = i*(2*i-1);
			if (1000 < temp && temp < 10000 && temp%100 > 9) {
				trans[3][temp/100] = temp % 100;
			}
			temp = i*(5*i-3)/2;
			if (1000 < temp && temp < 10000 && temp%100 > 9) {
				trans[4][temp/100] = temp % 100;
			}
			temp = i*(3*i-2);
			if (1000 < temp && temp < 10000 && temp%100 > 9) {
				trans[5][temp/100] = temp % 100;
			}
		}
		
		for (int i = 10; i < 100; i++) {
			int temp1 = trans[5][i];
			for (int a = 0; a < 5; a++) {
				int temp2 = trans[a][temp1];
				if (temp2 != 0) {
					for (int b = 0; b < 5; b++) {
						if (b != a) {
							int temp3 = trans[b][temp2];
							if (temp3 != 0) {
								for (int c = 0; c < 5; c++) {
									if (c != b && c != a) {
										int temp4 = trans[c][temp3];
										if (temp4 != 0) {
											for (int d = 0; d < 5; d++) {
												if (d != a && d != b && d != c) {
													int temp5 = trans[d][temp4];
													if (temp5 != 0) {
														for (int e = 0; e < 5; e++) {
															if (e != a && e != b && e != c && e != d) {
																int temp6 = trans[e][temp5];
																if (temp6 == i)
																	System.out.println(temp1 + " " + temp2 + " " + temp3 + " " + temp4 + " " + temp5 + " " + temp6);
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
				}
			}
		}
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 100; j++) {
//				System.out.print(trans[i][j] + " ");
//			}
//			System.out.println();
//		}

	}
}