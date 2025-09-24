import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int M, N, K;
    private static int[][] map;
    private static int count;
    private static int[] dx = new int[]{-1, 0, 1, 0};
    private static int[] dy = new int[]{0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            initMap();
            findBug();
            sb.append(count).append("\n");
            count = 0;
        }
        System.out.println(sb);
    }

    private static void findBug() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    count++;
                    findSet(i, j);
                }
            }
        }
    }

    private static void findSet(int x, int y) {
        map[x][y] = -1;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (validation(nextX, nextY) && map[nextX][nextY] == 1) {
                findSet(nextX, nextY);
            }
        }
    }

    private static boolean validation(int nextX, int nextY) {
        return 0 <= nextX && 0 <= nextY && nextX < M && nextY < N;
    }

    private static void initMap() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
        }
    }
}
