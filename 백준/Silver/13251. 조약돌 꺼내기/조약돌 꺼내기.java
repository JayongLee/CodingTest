import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = 0;
        int[] colors = new int[M];
        for (int i = 0; i < M; i++) {
            int s = Integer.parseInt(st.nextToken());
            colors[i] = s;
            total += s;
        }
        int K = Integer.parseInt(br.readLine());
        double ans = 0;
        for (int i = 0; i < M; i++) {
            int color = colors[i];
            if (color < K) {
                continue;
            }
            double a = 1;
            for (int j = 0; j < K; j++) {
                a *= (double) (color - j) / (total - j);
            }
            ans += a;
        }
        System.out.println(ans);
    }
}