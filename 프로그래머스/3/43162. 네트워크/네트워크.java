import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

class Solution {

    private static boolean[] visited;

    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, computers, n);
            }
        }
        return count;
    }

    private static void dfs(int node, int[][] computers, int n) {
        visited[node] = true;
        for (int next = 0; next < n; next++) {
            if (!visited[next] && computers[node][next] == 1) {
                dfs(next, computers, n);
            }
        }
    }
}