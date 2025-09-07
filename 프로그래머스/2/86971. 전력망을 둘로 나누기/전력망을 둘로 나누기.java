import java.util.*;

class Solution {

    private static ArrayList<Integer>[] adjList;
    private static boolean[] visited;
    private static int ans;
    private static int N;

    public int solution(int n, int[][] wires) {
        N = n;
        ans = n-1;
        adjList = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int[] edge : wires) {
            // 무방향
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }
        visited = new boolean[n+1];
        dfs(1);

        return ans;
    }

    private static int dfs(int now) {
        visited[now] = true;
        int sum = 0;

        for (int next : adjList[now]) {
            if (!visited[next]) {
                int count = dfs(next);
                ans = Math.min(ans, Math.abs((N-count)-count));
                sum += count;
            }
        }
        return sum + 1; // 현재 노드 + 자식 노드들의 수 + 1
    }
}