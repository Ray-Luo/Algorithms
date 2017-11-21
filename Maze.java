import java.util.ArrayList;
import java.util.List;

public class Maze{
    public static void main(String[] args){
        char[][] maze = {
		{'.','.','X','.','.'},
		{'X','.','.','X','X'},
		{'.','X','.','.','.'},
		{'.','X','X','.','.'},
		{'.','X','.','X','.'}
	};

	//if(solve1(maze, 0, 0, 4, 4)){
	//	System.out.println("solve1 Good");
	//}

	//if(solve2(maze, 0, 0, 4, 4)){
	//	System.out.println("solve2 Good");
	//}
	
	List<Character> path = new ArrayList<>();
	if(solve3(maze, 0, 0, 4, 4, path)){
		System.out.println("solve3 Good");
		System.out.println(path.toString());
	}


    }

    public static boolean solve1(char[][] maze, int startX, int startY, int targetX, int targetY){
    
	if(startX == targetX && startY == targetY){
		return true;
	}

	if(startX >= maze.length || startY >= maze[0].length || startX < 0 || startY < 0 || maze[startX][startY] == 'X'){
		return false;
	}

	
	maze[startX][startY] = 'X';

	return solve1(maze, startX + 1, startY, targetX, targetY) || solve1(maze, startX - 1, startY, targetX, targetY) || solve1(maze, startX, startY + 1, targetX, targetY) || solve1(maze, startX, startY - 1, targetX, targetY);

    }

    public static boolean solve2(char[][] maze, int startX, int startY, int targetX, int targetY){
    	
	if(startX >= maze.length || startY >= maze[0].length || startX < 0 || startY < 0 || maze[startX][startY] == 'X'){
		return false;
	}

	if(startX == targetX && startY == targetY){
		return true;
	}

	
	maze[startX][startY] = 'X';
   	int[] xMove = {1, 0, -1, 0};
	int[] yMove = {0, 1, 0, -1};

	for(int i = 0; i < 4; i++){
		if(solve2(maze, startX + xMove[i], startY + yMove[i], targetX, targetY)){
			return true;
		}
	}
    	return false;
    }

    public static boolean solve3(char[][] maze, int startX, int startY, int targetX, int targetY, List<Character> path){
    	if(startX == targetX && startY == targetY){
		return true;
	}
	
	if(startX >= maze.length || startY >= maze[0].length || startX < 0 || startY < 0 || maze[startX][startY] == 'X'){
		return false;
	}
	
	maze[startX][startY] = 'X';
	int[] xMove = {1, 0, -1, 0};
	int[] yMove = {0, 1, 0, -1};
	char[] dir = {'D', 'R', 'U', 'L'};

	for(int i = 0; i < 4; i++){
		path.add(dir[i]);
		if(solve3(maze, startX + xMove[i], startY + yMove[i], targetX, targetY, path)){
			return true;
		}
		path.remove(path.size() - 1);
	}
	return false;
    }

    
}
