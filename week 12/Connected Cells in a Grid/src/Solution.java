import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Cell {
    public int r, c;
    public Cell(int i, int j) {
        r = i;
        c = j;
    }
}

public class Solution {

    static int[][] grid;
    static boolean[][] visited;
    static int N, M;


    static int count_connected(int row, int col) {
        int cnt = 1;
        if(row<0 || col<0 )return 0;
        if(!visited[row][col])return 0;
        visited[row][col]=true;
        for(int i=row-1;i<=row+1;i++){
            for(int j=col-1;j<=col+1;j++){
                cnt+=count_connected(i,j);
            }
        }
        // Viết chương trình vào đây

        return cnt;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        grid = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                grid[i][j] = scanner.nextInt();
                visited[i][j] = false;
            }
        }
        int max = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (grid[i][j] == 0 || visited[i][j]) continue;
                int cnt = count_connected(i, j);
                if (max < cnt) max = cnt;
            }
        }

        System.out.println(max);

    }
}