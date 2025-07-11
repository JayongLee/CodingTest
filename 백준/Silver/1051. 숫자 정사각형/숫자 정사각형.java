import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = Math.min(N, M);

        int[][] square = new int[N][M];
        for (int row = 0; row < N; row++) {
            char[] line = br.readLine().toCharArray();
            for (int col = 0; col < M; col++) {
                square[row][col] = Integer.parseInt(String.valueOf(line[col]));
            }
        }
        for (int size = min; size >= 0; size--) {
            for (int i = 0; i + size <= N; i++) {
                for (int j = 0; j + size <= M; j++) {
                    int leftTop = square[i][j];
                    int rightTop = square[i][j + size - 1];
                    int leftBottom = square[i + size - 1][j];
                    int rightBottom = square[i + size - 1][j + size -1];
                    if (leftTop == leftBottom && leftBottom == rightTop && rightTop == rightBottom) {
                        System.out.println(size * size);
                        return;
                    }
                }
            }
        }
    }
}