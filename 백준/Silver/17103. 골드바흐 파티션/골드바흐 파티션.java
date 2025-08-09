import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] test = new int[T];
        int max = 0;
        for (int i = 0; i < T; i++) {
            int next = Integer.parseInt(br.readLine());
            max = Math.max(next, max);
            test[i] = next;
        }

        // 에라스토테네스의 체
        int[] prime = new int[max + 1];
        prime[2] = 2;
        for (int i = 3; i <= max; i+=2) {
            prime[i] = i;
        }
        for (int i = 3; i <= max; i+=2) {
            if (prime[i] == 0) {
                continue;
            }
            for (int j = i * 2; j <= max; j += i) {
                prime[j] = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int n : test) {
            if (n == 4) {
                sb.append(1).append("\n");
                continue;
            }
            int count = 0;
            for (int i = 3; i <= n / 2; i+=2)  {
                if (prime[i] != 0 && prime[n - i] != 0) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
