package Pratices.BackTracking;

public class FindPathMaze {
    public static void main(String[] args) {
        int maze[][] =
                {
                        {0,1,1,1,1},
                        {0,1,0,0,0},
                        {0,1,0,1,0},
                        {0,1,0,1,0},
                        {0,0,0,1,0}

                };

        boolean path = isPathAvaliableHelper(maze,0,0);
        System.out  .println(path);
    }


    private static boolean isPathAvaliableHelper(int[][] maze, int i, int j) {
        if(maze.length-1==i && maze[0].length-1==j && maze[i][j]==0){
            return true;
        }
        maze[i][j]=-1;
        if(i<maze.length-1 && maze[i+1][j]==0)
            return isPathAvaliableHelper(maze,i+1,j);
        if(j<maze[0].length-1 && maze[i][j+1]==0)
            return isPathAvaliableHelper(maze,i,j+1);
        if(i>0 && maze[i-1][j]==0)
            return isPathAvaliableHelper(maze,i-1,j);
        if(j>0 && maze[i][j-1]==0)
            return  isPathAvaliableHelper(maze,i,j-1);

        return false;
    }
}
