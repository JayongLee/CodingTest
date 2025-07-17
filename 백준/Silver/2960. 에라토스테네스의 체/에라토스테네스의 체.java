import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] nums = new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            nums[i] = true;
        }

        int count = 0;
        while (true) {
            int p = 0;
            for (int i = 2; i <= N; i++) {
                if (nums[i]) {
                    p = i;
                    break;
                }
            }
            for (int idx = p; idx <= N; idx+=p) {
                if (nums[idx]) {
                    nums[idx] = false;
                    if (++count == K) {
                        System.out.println(idx);
                        return;
                    }
                }
            }
        }
    }
}