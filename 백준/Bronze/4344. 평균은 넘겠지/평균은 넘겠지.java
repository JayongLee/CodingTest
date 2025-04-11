import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int avg = 0;
            int[] scores = new int[M];
            for (int j = 0; j < M; j++) {
                int score = Integer.parseInt(st.nextToken());
                scores[j] = score;
                avg += score;
            }
            avg = avg / M;
            int count = 0;
            for (int j = 0; j < M; j++) {
                if (scores[j] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f", (double) count / (double) M * 100);
            System.out.println("%");
        }
    }
}