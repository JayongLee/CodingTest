import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int iter = 0; iter < T; iter++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 팀의 개수
            int n = Integer.parseInt(st.nextToken());
            // 문제의 개수
            int k = Integer.parseInt(st.nextToken());
            // 팀의 ID
            int t = Integer.parseInt(st.nextToken());
            // 로그 엔트리의 개수
            int m = Integer.parseInt(st.nextToken());

            int[] sum = new int[n+1];
            int[][] score = new int[n+1][k+1];
            int[][] count = new int[n+1][2];

            for (int l = 1; l <= m; l++) {
                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken());
                int j = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());

                count[i][0]++;
                count[i][1] = l;

                if (s > score[i][j]) {
                    sum[i] += s - score[i][j];
                    score[i][j] = s;
                }
            }

            int rank = 1;
            for (int l = 1; l <= n; l++) {
                if (sum[l] > sum[t]
                    || (sum[l] == sum[t] && count[l][0] < count[t][0])
                    || (sum[l] == sum[t] && count[l][0] == count[t][0] && count[l][1] < count[t][1])
                ) rank++;
            }
            System.out.println(rank);
        }
    }
}