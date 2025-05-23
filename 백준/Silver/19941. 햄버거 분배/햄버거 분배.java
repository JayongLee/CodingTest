import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        char[] bench = s.toCharArray();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (bench[i] == 'P') {
                for (int j = Math.max(i - K, 0); j <= i + K && j < N; j++) {
                    if (bench[j] == 'H') {
                        count++;
                        bench[j] = 'X';
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}