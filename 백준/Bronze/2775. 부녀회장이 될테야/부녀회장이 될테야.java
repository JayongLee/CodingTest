import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] apt = new int[k+1][n+1];
            for (int j = 1; j <= n; j++) {
                apt[0][j] = j;
            }
            for (int j = 1; j <= k; j++) {
                apt[j][1] = apt[j-1][1];
            }
            for (int h = 1; h <= k; h++) {
                for (int l = 2; l <= n; l++) {
                    apt[h][l] = apt[h][l-1] + apt[h-1][l];
                }
            }
            System.out.println(apt[k][n]);
        }
    }
}