import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (E % 15 == 0) E = 0;
        if (S % 28 == 0) S = 0;
        if (M % 19 == 0) M = 0;

        int i = 1;
        while (true) {
            if (i % 15 == E && i % 28 == S && i % 19 == M) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}