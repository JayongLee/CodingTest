import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        if (N == 0) {
            System.out.println(1);
            return;
        }
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st1.nextToken());
        }
        if (N == P && T <= scores[N - 1]) {
            System.out.println(-1);
        } else {
            int rank = 1;
            for (int i = 0; i < N; i++) {
                if (scores[i] > T) {
                    rank++;
                } else break;
            }
            System.out.println(rank);
        }
    }
}