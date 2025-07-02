import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int cost = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for (int i = N-1; i >=0; i--) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (coins[i] > cost) continue;
            if (cost <= 0) break;
            int q = cost / coins[i];
            cost -= coins[i] * q;
            count += q;
        }
        System.out.println(count);
    }
}