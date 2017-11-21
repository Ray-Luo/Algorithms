import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class EightQueen{
	public static void main(String[] args){
		char[][] board = {
			{'.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.'}
		};
	/*	List<Integer> item = new ArrayList<>();
		if(solve1(board, item, 0)){
			System.out.println("solve good");
			System.out.println(item.toString());
		}
		StringBuilder string = new StringBuilder();
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				if(j == item.get(i)){
					string.append("Q ");
				}else{
					string.append(". ");
				}
				if(j == board[0].length){
					string.append("\n");
				}
			}
			System.out.println(string.toString());
			string = new StringBuilder();
		}
		*/
		List<Integer> item = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		solve2(board, result, item, 0);
		System.out.println(result.size());
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i).toString());
		}
			
		

	}

	public static boolean solve1(char[][] board, List<Integer> item, int row){
		if(row == board.length){
			 return true;
		}

		
		for(int col = 0; col < board[0].length; col++){
			if(isLegal(board, row, col)){
				board[row][col] = 'Q';
				item.add(col);
				if(solve1(board, item, row + 1)){
					return true;
				}
				board[row][col] = '.';
				item.remove(item.size() - 1);
			}
		}
		return false;
	}

	
	public static void solve2(char[][] board, List<List<Integer>> result, List<Integer> item, int row){
		if(row == board.length){
			result.add(new ArrayList<>(item));
			return;
		}

		
		for(int col = 0; col < board[0].length; col++){
			if(isLegal(board, row, col)){
				board[row][col] = 'Q';
				item.add(col);
				solve2(board, result, item, row + 1);
				board[row][col] = '.';
				item.remove(item.size() - 1);
			}
		}
		return;	
	}


	public static boolean isLegal(char[][] board, int row, int col){
		for (int i = row-1; i >= 0; i--) {
			if (board[i][col] == 'Q')
				return false;

			int tempCol = col - row + i;
			if (tempCol >= 0 && tempCol < board.length && board[i][tempCol] == 'Q')
				return false;

			tempCol = col + row - i;
			if (tempCol >= 0 && tempCol < board.length && board[i][tempCol] == 'Q')
				return false;
		}
		return true;

	}

	
}
