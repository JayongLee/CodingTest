import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long big, small, plus;
            if (a >= b) {
                big = a;
                small = b;
            } else {
                big = b;
                small = a;
            }
            plus = big;
            while (true) {
                if (big % small == 0) {
                    System.out.println(big);
                    break;
                }
                big += plus;
            }
        }
    }
}