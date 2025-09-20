import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int N, M;
    private static int d;
    private static int[][] room;
    private static int nowX, nowY;
    private static int count;
    private static final int[] dx = new int[]{-1, 0, 1, 0}; // 상 우 하 좌
    private static final int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        nowX = Integer.parseInt(st.nextToken());
        nowY = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        count = 0;
        room = new int[N][M];
        initRoom();

        while (true) {
            // 1. 현재 칸이 아직 청소되지 않은 경우 현재 칸 청소
            clean();
            // 현재 칸의 주변 4칸 중 청소되지 않은 빈 칸이 있는 경우,
            if (checkDirtyAround()) {
                do {
                    turn(); // 반시계 방향 회전
                } while (!checkDirtyThenMove()); // 바라보는 방향을 기준으로 앞쪽 칸이 청소되지 않은 빈 칸인 경우 한 칸 전진한다.
                continue;
            } else { // 현재 칸의 주변 4칸 중 청소되지 않은 빈 칸이 없는 경우,
                // 바라보는 방향을 유지한 채로 한 칸 후진할 수 있다면
                if (canMoveBackThenMove()) {
                    // 한 칸 후진하고 1번으로 돌아간다.
                    continue;
                } else {
                    // 바라보는 방향의 뒤쪽 칸이 벽이라 후진할 수 없다면 작동을 멈춘다.
                    break;
                }
            }
            //
        }

        System.out.println(count);
    }

    private static void clean() {
        if (room[nowX][nowY] == 0) {
            room[nowX][nowY] = -1; // 청소했다는 표시
            count++;
        }
    }

    private static boolean checkDirtyAround() {
        for (int i = 0; i < 4; i++) {
            int nextX = nowX + dx[i];
            int nextY = nowY + dy[i];
            if (isDirty(nextX, nextY))  {
                return true;
            }
        }
        return false;
    }

    private static boolean isDirty(int nextX, int nextY) {
        return validation(nextX, nextY) && room[nextX][nextY] == 0;
    }

    private static void turn() {
        if (d == 0) {
            d = 3;
        } else {
            d -= 1;
        }
    }
    private static boolean checkDirtyThenMove() {
        int nextX = nowX + dx[d];
        int nextY = nowY + dy[d];
        if (isDirty(nextX, nextY)) {
            nowX = nextX;
            nowY = nextY;
            return true;
        }
        return false;
    }

    private static boolean canMoveBackThenMove() {
        int backD = (d + 2) % 4;
        int backX = nowX + dx[backD];
        int backY = nowY + dy[backD];
        if (validation(backX, backY) && room[backX][backY] != 1) {
            nowX = backX;
            nowY = backY;
            return true;
        }
        return false;
    }

    private static boolean validation(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < M;
    }

    private static void initRoom() throws IOException{
        for (int i = 0; i < N; i++) {
            StringTokenizer line = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(line.nextToken());
            }
        }
    }
}
