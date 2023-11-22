import java.util.*;
import java.io.*;
    public class Main {
        static int count = 0;
        public static void putEdge(int[][] graph, int x, int y){
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        public static void dfs(int v, int[][] graph, boolean[] visited) {
            visited[v] = true;

            for(int i = 1; i < graph.length; i++) {
                if(graph[v][i] == 1 && !visited[i]) {
                    count += 1;
                    dfs(i, graph, visited);
                }
            }
        }
        public static void main(String[] args) throws IOException {
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //StringTokenizer st = new StringTokenizer(br.readLine());
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int [][] graph = new int[n + 1][n + 1];
            boolean [] visited = new boolean[n + 1];

            for(int i = 0; i < m; i++){
                putEdge(graph, scanner.nextInt(), scanner.nextInt());
            }

            dfs(1, graph, visited);

            System.out.println(count);

        }

    }