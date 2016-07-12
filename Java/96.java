import java.util.*;
import java.io.*;

class pos {
	int x;
	int y;
	pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Solution {
	public static void main(String[] args) throws Exception{
		long time = System.currentTimeMillis();
		File f = new File("C:/Users/shiina/workspace/Tests/src/96.txt");
		int result = 0;
		Scanner input = new Scanner(f);
		for (int i = 0; i < 50; i++) {
			input.nextLine();
			char[][] board = new char[9][9];
			for (int j = 0; j < 9; j++) {
				setBoard(board, j, input.nextLine());
			}
			result += solveSudoku(board);
		}
		System.out.println(result);
		System.out.println("Time: " + (System.currentTimeMillis() - time));
		input.close();
	}
	
	public static void setBoard(char[][] board, int i, String s) {
		for (int j = 0; j < 9; j++)
			board[i][j] = s.charAt(j);
	}
	
	public static char get(pos p, char[][] board) {
		int x = p.x;
		int y = p.y;
		int start;
		if (board[x][y] == '0')
			start = 1;
		else
			start = board[x][y] - '1' + 2;
		for (int i = start; i < 10; i++) {
			if (isValid(x,y,i,board))
				return (char) (i + '0');
		}
		return '0';
	}
	
	public static boolean isValid(int x, int y, int i, char[][] board) {
		return checkRow(x,y,i,board) && checkCol(x,y,i,board) && checkSqu(x,y,i,board);
	}
	
	public static boolean checkRow(int x, int y, int i, char[][] board) {
		for (int j = 0; j < 9; j ++) {
			if (j != y)
				if (board[x][j] == (char) (i + '0'))
					return false;
		}
		return true;
	}
	
	public static boolean checkCol(int x, int y, int i, char[][] board) {
		for (int j = 0; j < 9; j ++) {
			if (j != x)
				if (board[j][y] == (char) (i + '0'))
					return false;
		}
		return true;
	}
	
	public static boolean checkSqu(int x, int y, int i, char[][] board) {
		int a = x / 3;
		int b = y / 3;
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				if (3*a+j != x || 3*b+k != y)
					if (board[3*a+j][3*b+k] == (char) (i + '0'))
						return false;
			}
		}
		return true;
	}
	
    public static int solveSudoku(char[][] board) {
    	ArrayList<pos> temp = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
        	for (int j = 0; j < 9; j++) {
        		if (board[i][j] == '0') {
        			temp.add(new pos(i,j));
        		}
        	}
        }
        int N = temp.size();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++)
        	nums[i] = -1;
        int i = 0;
        while (i >= 0 && i < N) {
        	pos p = temp.get(i);
        	char j = get(p,board);
        	
        	if (j == '0') {
        		board[p.x][p.y] = '0';
        		i--;
        	}
        	else {
        		board[p.x][p.y] = j;
        		i++;
        	}
        }
        int a = board[0][0] - '0';
        int b = board[0][1] - '0';
        int c = board[0][2] - '0';
        return (100*a+10*b+c);
    }
}