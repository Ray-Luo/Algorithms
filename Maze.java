public class Maze{
    public static void Maze(String[] args){
        
    }

    public static boolean solveMaze(char[][] maze, int startX, int StartY, int targetX, int targetY, boolean[][] visited){
        if(startX < 0 || startX >= maze.length || startY < 0 || startY >= maze[0].length || maze[startX][startY] == 'X' || visited[startx][startY]){
		return false;
	}

	if(startX == targetX && startY == targetY){
	    return true;
	}

	visited[startX][startY] = true;

	if(solveMaze(maze, startX + 1, startY, targetX, targetY, visited) || solveMaze(maze, startX - 1, startY, targetX, targetY, visited) || solveMaze(maze, startX, startY + 1, targetX, targetY, visited) || solveMaze(maze, startX, startY - 1, targetX, targetY, visited)){
	    return true;
	}

	return false;
    }


    public static boolean solveMaze2(char[][] maze, int startX, int StartY, int targetX, int targetY){
        if(startX < 0 || startX >= maze.length || startY < 0 || startY >= maze[0].length || maze[startX][startY] == 'X' || visited[startx][startY]){
		return false;
	}

	if(startX == targetX && startY == targetY){
	    return true;
	}

	maze[startX][startY] = 'X';

	int[] dx = {1, 0, -1, 0};
	int[] dy = {0, 1, 0, -1};

	for(int i = 0; i < 4; i++){
	    if(solveMaze2(maze, startX + dx[i], startY + dy[i], targetX, targetY)){
	        return true;
	    }
	}
	return false;
    }

    public static boolean printMaze(char[][] maze, int startX, int StartY, int targetX, int targetY, String path){
        if(startX < 0 || startX >= maze.length || startY < 0 || startY >= maze[0].length || maze[startX][startY] == 'X' || visited[startx][startY]){
		return false;
	}

	if(startX == targetX && startY == targetY){
	    System.out.println(path);
	    return true;
	}

	maze[startX][startY] = 'X';

	int[] dx = {1, 0, -1, 0};
	int[] dy = {0, 1, 0, -1};
        char[] direction = {'D', 'R', 'U', 'L'};

	for(int i = 0; i < 4; i++){
	    String newPath = path + direction[i] + " ";
	    if(printMaze(maze, startX + dx[i], startY + dy[i], targetX, targetY)){
	        return true;
	    }
	}
	return false;
    }

    public static boolean printMaze2(char[][] maze, int startX, int StartY, int targetX, int targetY, ArrayList<Character> path){
        if(startX < 0 || startX >= maze.length || startY < 0 || startY >= maze[0].length || maze[startX][startY] == 'X' || visited[startx][startY]){
		return false;
	}

	if(startX == targetX && startY == targetY){
	    System.out.println(path);
	    return true;
	}

	maze[startX][startY] = 'X';

	int[] dx = {1, 0, -1, 0};
	int[] dy = {0, 1, 0, -1};
        char[] direction = {'D', 'R', 'U', 'L'};

	for(int i = 0; i < 4; i++){
	    path.add(direction[i]);
	    if(printMaze2(maze, startX + dx[i], startY + dy[i], targetX, targetY, path)){
	        return true;
	    }
	    path.remove(path.size() - 1);
	}
	return false;
    }



    
}
