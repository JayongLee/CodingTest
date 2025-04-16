import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int sum = S + K + H;
        if (sum < 100) {
            if (S < K) {
                if (S <= H) {
                    System.out.println("Soongsil");
                } else {
                    System.out.println("Hanyang");
                }
            } else {
                if (K < H) {
                    System.out.println("Korea");
                } else {
                    System.out.println("Hanyang");
                }
            }
        } else {
            System.out.println("OK");
        }
    }
}

