import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {

    private static int ans, N;
    private static int[][] dungeon;

    public int solution(int k, int[][] dungeons) {
        ans = 0;
        N = dungeons.length;
        dungeon = dungeons;
        boolean[] visited = new boolean[N];
        backtrack(0, k, visited);
        return ans;
    }

    private static void backtrack(int count, int tired, boolean[] visited) {
        if (count >= ans) {
            ans = count;
        }
        for (int i = 0; i < N; i++) {
            if (visited[i])
                continue;
            if (tired >= dungeon[i][0]) {
                boolean[] copyArr = Arrays.copyOf(visited, N);
                copyArr[i] = true;
                backtrack(count + 1, tired - dungeon[i][1], copyArr);
            }
        }
    }
}