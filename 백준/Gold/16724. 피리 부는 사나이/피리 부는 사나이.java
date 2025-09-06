import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String[][] map;
    private static int row;
    private static int col;
    private static XY[][] parent;
    private static boolean[][] visited;

    private static class XY {
        private int x;
        private int y;

        private XY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private int getX() {
            return this.x;
        }

        private int getY() {
            return this.y;
        }
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        row = N;
        col = M;
        map = new String[N][M];
        parent = new XY[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) + "";
                parent[i][j] = new XY(i, j);
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (visited[r][c])
                    continue;
                XY next = directionXY(map[r][c], r, c);
                XY now = new XY(r, c);
                XY nextParent = find(next);
                XY nowParent = find(now);
                if (!(nextParent.getX() == nowParent.getX() && nextParent.getY() == nowParent.getY()))
                    union(now, next);
            }
        }

        Set<XY> set = new HashSet<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                set.add(find(new XY(i, j))); // ← 반드시 루트로
            }
        }
        System.out.println(set.size());
    }

    private static XY find(XY xy) {
        XY parentXY = parent[xy.getX()][xy.getY()];
        if (parentXY.getX() == xy.getX() && parentXY.getY() == xy.getY())
            return parentXY;
        return parent[xy.getX()][xy.getY()] = find(parentXY);
    }

    private static void union(XY xy1, XY xy2) {
        XY root1 = find(xy1);
        XY root2 = find(xy2);
        parent[root2.getX()][root2.getY()] = root1;
    }

    private static XY directionXY(String direction, int row, int col) {
        switch (direction) {
            case "D" :
                return new XY(row + 1, col);
            case "U" :
                return new XY(row - 1, col);
            case "L" :
                return new XY(row, col - 1);
            case "R" :
                return new XY(row, col + 1);
            default:
                return new XY(row, col);
        }
    }
}
