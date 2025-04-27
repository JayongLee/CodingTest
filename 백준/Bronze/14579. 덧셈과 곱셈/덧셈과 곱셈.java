
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long ans = 1;
        for (int i = a; i <= b; i++) {
            int sum = i * (i + 1) / 2;
            sum = sum % 14579;
            ans *= sum;
            ans = ans % 14579;
        }
        System.out.println(ans);
    }
}