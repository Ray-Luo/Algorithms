import java.util.ArrayList;
import java.util.List;

public class Maze{
    public static void main(String[] args){
        char[][] board = {
		{'.','.','X','.','.'},
		{'X','.','.','X','X'},
		{'.','X','.','.','.'},
		{'.','X','X','.','.'},
		{'.','X','.','X','.'}
	};
	boolean result = exist(board, 0, 0, 4, 4);
	System.out.println(Boolean.toString(result));
        List<List<Character>> results = new ArrayList<>();
	printPath(results, new ArrayList<Character>(), board, 0, 0, 4, 4);
	System.out.println(results.size());
	for (List<Character> item : results) {
	    System.out.println(item.toString());
	}
        for (char[] item : board) {
	    System.out.println(String.valueOf(item));
	}

    }

    public static boolean exist(char[][] board, int startX, int startY, int targetX, int targetY) {
        if (startX == targetX && startY == targetY) {
	    return true;
	}
	if (startX < 0 || startX >= board.length || startY < 0 || startY >= board[0].length || board[startX][startY] == 'X') {
	    return false;
	}
	int[] dx = {1, -1, 0, 0};
	int[] dy = {0, 0, 1, -1};
	board[startX][startY] = 'X';
	for (int i = 0; i < 4; i++) {
	    if (exist(board,startX + dx[i], startY + dy[i], targetX, targetY)) {
	        return true;
	    }
	}
	board[startX][startY] = '.';
	return false;
    }

    public static void printPath(List<List<Character>> results, List<Character> items, char[][] board, int startX, int startY, int targetX, int targetY) {
        if (startX == targetX && startY == targetY) {
	    results.add(new ArrayList<>(items));
	    return;
	}
	if (startX < 0 || startX >= board.length || startY < 0 || startY >= board[0].length || board[startX][startY] == 'X') {
	    return;
	}
	int[] dx = {1, -1, 0, 0};
	int[] dy = {0, 0, 1, -1};
	char[] dir = {'R', 'L', 'D', 'U'};
	board[startX][startY] = 'X';
	for (int i = 0; i < 4; i++) {
	    items.add(dir[i]);
	    printPath(results, items, board, startX + dx[i], startY + dy[i], targetX, targetY);
	    items.remove(items.size() - 1);
	}
	board[startX][startY] = '.';
    }
               
}
