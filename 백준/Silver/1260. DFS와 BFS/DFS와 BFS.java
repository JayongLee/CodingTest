import java.io.*;
import java.util.*;

public class Main {

    private static final StringBuilder sb = new StringBuilder();
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final List<List<Integer>> adjList = new ArrayList<>();
    private static boolean[] visited;
    private static int N;
    private static int M;

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];

        // 연결된 두 정점 인접리스트에 추가
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for (List<Integer> node : adjList) {
            Collections.sort(node);
        }

        // 방문할 수 있는 정점이 여러 개인 경우는 정점 번호가 작은 것 부터
        // 더 이상 방문할 수 있는 점이 없는 경우 종료
        dfs(V);

        // bfs 준비
        visited = new boolean[N+1]; sb.append("\n");

        bfs(V);

        System.out.println(sb);
    }

    private static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");

        for (int next : adjList.get(start)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        visited[start] = true;
        que.offer(start);

        while (!que.isEmpty()) {
            int node = que.poll();
            sb.append(node).append(" ");

            for (int next : adjList.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    que.offer(next);
                }
            }
        }
    }
}