class Solution {
    public static int[][] map, road;
    public int solution(int m, int n, int[][] puddles) {
        // 2, 2 [[1, 2]]
        // ㅁ X
        // o ㅁ
        road = new int[n + 2][m + 2];
        map = new int[n + 2][m + 2];
        init(m, n, puddles);
        
        // A[r][c] = A[r][c-1] + A[r-1][c]
        // dp(n-1,m-1);
        int value = dp(n,m);
//         for (int r = 1; r <= n; r++) {
//             for (int c = 1; c <= m; c++) {
//                 System.out.print(road[r][c] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();
        
//         for (int r = 1; r <= n; r++) {
//             for (int c = 1; c <= m; c++) {
//                 System.out.print(map[r][c] + " ");
//             }
//             System.out.println();
//         }
        return value;
    }
    
    private static int dp(int r, int c) {
        if (map[r][c] == -1) return 0; // 웅덩이 돔황쳐
        if (r == 1 || c == 1) return 1;
        if (road[r][c] == 0) {
            road[r][c] = (dp(r, c-1) + dp(r-1, c)) % 1_000_000_007;
            return road[r][c];
        } else {
            return road[r][c];
        }
        
    }
    
    private static void init(int m, int n, int[][] puddles) {
        // 웅덩이 저장
        for (int[] puddle : puddles) {
            int y = puddle[1];
            int x = puddle[0];
            map[y][x] = -1;
            if (x == 1) {
                for (int c = y; c <= n; c++) {
                    map[c][1] = -1;
                }
            }
            if (y == 1) {
                for (int r = x; r <= m; r++) {
                    map[1][r] = -1;
                }
            }
        }
    }
}