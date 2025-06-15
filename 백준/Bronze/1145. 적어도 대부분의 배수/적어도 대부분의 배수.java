import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[5];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            int next = Integer.parseInt(st.nextToken());
            if (next < min) min = next;
            num[i] = next;
        }
        while (true) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (min % num[i] == 0) count++;
            }
            if (count >= 3) {
                System.out.println(min);
                break;
            }
            min++;
        }
    }
}
