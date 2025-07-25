import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M + 1];
        for (int i = 2; i <= M; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= M; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i * 2; j <= M; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = N; i <= M; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}