import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            for (int i = 0; i < K-1; i++) {
                q.add(q.poll());
            }
            list.add(q.poll());
        }
        System.out.print("<");
        for (int i = 0; i < N-1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.print(list.get(list.size()-1) + ">");
    }
}
