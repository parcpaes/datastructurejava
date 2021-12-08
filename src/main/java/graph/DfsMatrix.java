package graph;

import java.util.Arrays;

public class DfsMatrix {
    public static boolean visited[][];
    public static int ones[];
    public static void dfs(int [][]mat,int i,int j){
        if(visited[i][j] || mat[i][j]==0) return;;
        visited[i][j]=true;
        ones[i]++;
        System.out.println(i+" "+j);
        for(int k=0;k<mat.length;k++){
            for(int l=0;l<mat[0].length;l++){
                dfs(mat,k,l);
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
             {1,1,0,0,0},
             {1,1,1,1,0},
             {1,0,0,0,0},
             {1,1,0,0,0},
             {1,1,1,1,1}
        };
        visited = new boolean[mat.length][mat[0].length];
        ones = new int[mat.length];
        dfs(mat,0,0);
        System.out.println(Arrays.toString(ones));
    }
}
