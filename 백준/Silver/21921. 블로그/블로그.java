import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringTokenizer visit_st = new StringTokenizer(br.readLine());

        int[] visits = new int[N];
        for (int i = 0; i < N; i++) {
            visits[i] = Integer.parseInt(visit_st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < X; i++) {
            sum += visits[i];
        }
        int max = sum;
        int count = max == 0 ? 0 : 1;
        int new_sum = sum;
        // 슬라이딩 윈도우
        for (int i = X; i < N; i++) {
            new_sum += visits[i] - visits[i - X];
            if (new_sum >= max) {
                if (max == new_sum) {
                    count++;
                } else {
                    max = new_sum;
                    count = 1;
                }
            }
        }
        if (max == 0) {
            System.out.println("SAD");
            return;
        }
        System.out.println(max);
        System.out.println(count);
    }
}
