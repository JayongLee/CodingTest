import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {

    private static class Node {
        int dest, time;

        public Node(int dest, int time) {
            this.dest = dest;
            this.time = time;
        }
    }

    private static int ans;

    public int solution(int N, int[][] road, int K) {
        ArrayList<Node>[] adjList = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int[] edge : road) {
            adjList[edge[0]].add(new Node(edge[1], edge[2]));
            adjList[edge[1]].add(new Node(edge[0], edge[2]));
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[1] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(
                (o1, o2) -> Integer.compare(o1.time, o2.time));
        pq.add(new Node(1, 0));
        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (dist[now.dest] < now.time)
                continue;

            for (Node next : adjList[now.dest]) {
                if (dist[next.dest] > now.time + next.time) {
                    dist[next.dest] = now.time + next.time;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }

        for (int distance : dist) {
            if (distance <= K)
                ans++;
        }
        return ans;
    }
}