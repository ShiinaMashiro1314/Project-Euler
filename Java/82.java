import java.util.*;
//import java.math.*;
import java.io.*;

public class Solution {
	public static int getmin(int[] x) {
		int min = x[0];
		int minIndex = 0;
		for (int i = 0; i < 80; i++) {
			if (x[i] < min) {
				min = x[i];
				minIndex = i;
			}		
		}
		return minIndex;
	}
	
	public static int getMin(int[] x, ArrayList<Integer> l) {
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for (int i = 0; i < 80; i++) {
			if (!l.contains(i) && x[i] < min) {
				min = x[i];
				minIndex = i;
			}		
		}
		return minIndex;
	}
	
	public static int get(int[] prev, int[] data, int start, int end) {
		int result = prev[start];
		if (start <= end) {
			for (int i = start; i <= end; i++)
				result += data[i];
		}
		else
			for (int i = start; i >= end; i--)
				result += data[i];
		return result;
	}
	
	public static void update(int[][] result, int row, int[][] data) {
		int[] prev = result[row-1];
		int[] dataNow = data[row];
		int[] fin = new int[80];
		ArrayList<Integer> pos = new ArrayList<>();
		while (pos.size() != 80) {
			pos.add(getMin(prev,pos));
		}
		for (int i = 0; i < 80; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j <= i; j++) {
				int temp = get(prev, dataNow, pos.get(j), pos.get(i));
				if (temp < min)
					min = temp;
			}
			fin[pos.get(i)] = min;
		}
		result[row] = fin;
		//System.out.println(pos);
		//System.out.println(result[row][79]);
	}
	
	public static void main(String[] args) throws Exception {
		File f = new File("C:/Users/shiina/workspace/Tests/src/82.txt");
		String[][] data = new String[80][80];
		int[][] data1 = new int[80][80];
		int[][] result = new int[80][80];
		Scanner input = new Scanner(f);
		for (int i = 0; i < 80; i++) {
			String temp = input.nextLine();
			data[i] = temp.split(",");
		}
		for (int i = 0; i < 80; i++) {
			for (int j = 0; j < 80; j++) {
				data1[j][i] = Integer.parseInt(data[i][j]);
			}
		}
		for (int i = 0; i < 80; i++) {
			for (int j = 0; j < 80; j++) {
				//System.out.print(data1[i][j] + " ");
			}
			//System.out.println();
		}
		for (int i = 0; i < 80; i++) {
			if (i == 0) {
				for (int j = 0; j < 80; j++) {
					result[i][j] = data1[i][j];
				}
			}
			else
				update(result,i,data1);
		}
		input.close();
//		for (int i = 0; i < 80; i++) {
//			for (int j = 0; j < 80; j++) {
//				System.out.print(data1[i][j] + " ");
//			}
//			System.out.println();
//			System.out.println();
//			for (int j = 0; j < 80; j++) {
//				System.out.print(result[i][j] + " ");
//			}
//			System.out.println();
//			System.out.println();
//		}
//		System.out.println();
//		for (int i = 0; i < 80; i++) {
//			for (int j = 0; j < 80; j++) {
//				System.out.print(result[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(result[79][getmin(result[79])]);
	}
}