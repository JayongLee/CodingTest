import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int B = Integer.parseInt(st2.nextToken());
        int C = Integer.parseInt(st2.nextToken());

        long count = N;

        for (int i = 0; i < N; i++) {
            int rest = Integer.parseInt(st1.nextToken()) - B;
            if (rest > 0) {
                count += rest % C == 0 ? rest / C : rest / C + 1;
            }
        }
        System.out.println(count);
    }
}