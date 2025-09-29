import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int[] memorization;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        memorization = new int[N+1];
        memorization[0] = 1;

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    max = Math.max(max, memorization[j]);
                }
            }
            memorization[i] = max + 1;
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, memorization[i]);
        }
        System.out.println(ans);
    }
}
