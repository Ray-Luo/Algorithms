public class EightQueens{
    public static void main(String[] args){
        
    }

    public static void putQueens(char[][] board, int row, List<List<String>> results){
	   if(row == board.length){
	   	saveResult(board, results);
		return;
	   } 

	   for(int col = 0; col < board[0].length; col++){
	   	if(isLegal(board, row, col)){
			board[row][col] = 'Q';
			putQueens(board, row + 1, results);
			board[row][col] = '.';
		}
	   }
	   return;
    }
}
