package Pratices.Arrays;

public class LandandWater {
    public static void main(String[] args) {
        int matri [][]= {{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        int count= islandcount(matri);
        System.out.println(count);

    }

    private static int islandcount(int[][] matri) {
        int count=0;
        for(int i=0;i<matri.length;i++){
            for(int j=0;j<matri[0].length;j++){
                if(matri[i][j]==1){
                    visitedIsland(matri,i,j);
                        count+=1;
                }
            }
        }

        return count;
    }

    private static void visitedIsland(int[][] matri, int i, int j) {
        matri[i][j]=-1;
        if(i<matri.length-1 && matri[i+1][j]==1)
            visitedIsland(matri,i+1,j);
        if(j<matri[0].length-1 && matri[i][j+1]==1)
            visitedIsland(matri,i,j+1);
        if(i>0 && matri[i-1][j]==1)
            visitedIsland(matri,i-1,j);
        if(j>0 && matri[i][j-1]==1)
            visitedIsland(matri,i,j-1);
    }
}
