import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            long secret = Long.parseLong(br.readLine());
            if (secret % 2 == 0) {
                System.out.println("NO");
                continue;
            }
            boolean isTrue = true;
            for (int j = 3; j < 1000000; j+=2) {
                if (secret % j == 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}